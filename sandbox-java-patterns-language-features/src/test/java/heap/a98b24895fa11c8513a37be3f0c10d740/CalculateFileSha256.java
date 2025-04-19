<<<<<<<< HEAD:sandbox-java-patterns-language-features/src/test/java/heap/a98b24895fa11c8513a37be3f0c10d740/CalculateFileSha256.java
package heap.a98b24895fa11c8513a37be3f0c10d740;
========
package com.github.ivan.kopylove.commons.util;
>>>>>>>> origin/master:kopylove-commons/src/main/java/com/github/ivan/kopylove/commons/util/Sha256.java

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

<<<<<<<< HEAD:sandbox-java-patterns-language-features/src/test/java/heap/a98b24895fa11c8513a37be3f0c10d740/CalculateFileSha256.java
public final class CalculateFileSha256
{

    private CalculateFileSha256() {}

    public static String calculateFileSha256(byte[] bytes) throws NoSuchAlgorithmException, IOException
========
public class Sha256
{
    public static String sha256(byte[] bytes) throws NoSuchAlgorithmException, IOException
>>>>>>>> origin/master:kopylove-commons/src/main/java/com/github/ivan/kopylove/commons/util/Sha256.java
    {
        byte[] buffer = new byte[8192];
        int count;
        MessageDigest digest;
        digest = MessageDigest.getInstance("SHA-256");
        BufferedInputStream bis = new BufferedInputStream(new ByteArrayInputStream(bytes));
        while ((count = bis.read(buffer)) > 0)
        {
            digest.update(buffer, 0, count);
        }
        bis.close();

        byte[] hash = digest.digest();
        StringBuilder hexString = new StringBuilder();

        for (int i = 0; i < hash.length; i++)
        {
            String hex = Integer.toHexString(0xff & hash[i]);
            if (hex.length() == 1)
            {
                hexString.append('0');
            }
            hexString.append(hex);
        }

        return hexString.toString();
    }

}
