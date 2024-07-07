package com.github.ivan.kopylove.commons.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA3
{

    private static final byte[] HEX_ARRAY = "0123456789abcdef".getBytes(StandardCharsets.US_ASCII);

    private SHA3() {}

    public static String sha3_256(byte[] input) throws NoSuchAlgorithmException
    {
        MessageDigest digest = MessageDigest.getInstance("SHA3-256");
        byte[] hashbytes = digest.digest(input);
        return bytesToHex(hashbytes);
    }

    private static String bytesToHex(byte[] bytes)
    {
        byte[] hexChars = new byte[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++)
        {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars, StandardCharsets.UTF_8);
    }
}
