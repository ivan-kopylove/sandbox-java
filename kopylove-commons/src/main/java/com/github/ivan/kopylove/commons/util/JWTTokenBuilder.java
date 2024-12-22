package com.github.ivan.kopylove.commons.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.bouncycastle.util.io.pem.PemObject;
import org.bouncycastle.util.io.pem.PemReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

import static java.time.Instant.now;

public class JWTTokenBuilder
{
    private static final Logger LOGGER = LoggerFactory.getLogger(JWTTokenBuilder.class);

    public String buildJwtToken(String issuer, String kid, Path path, String audience)
    {
        Objects.requireNonNull(issuer);
        Objects.requireNonNull(kid);
        Objects.requireNonNull(path);
        Objects.requireNonNull(audience);

        try
        {
            PemObject privateKeyPem;
            try (PemReader reader = new PemReader(new FileReader(path.toString())))
            {
                privateKeyPem = reader.readPemObject();
            }

            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            // here can be an NPE because yandex adds extra line to their key
            PrivateKey privateKey = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(privateKeyPem.getContent()));

            Instant now = now();

            return Jwts.builder()
                       .setHeaderParam("kid", kid)
                       .setIssuer(issuer)
                       .setAudience(audience)
                       .setIssuedAt(Date.from(now))
                       .setExpiration(Date.from(now.plusSeconds(360)))
                       .signWith(SignatureAlgorithm.PS256, privateKey)
                       .compact();
        }
        catch (IOException | NoSuchAlgorithmException | InvalidKeySpecException e)
        {
            LOGGER.error("error building jwt token", e);
            throw new RuntimeException(e);
        }
    }
}
