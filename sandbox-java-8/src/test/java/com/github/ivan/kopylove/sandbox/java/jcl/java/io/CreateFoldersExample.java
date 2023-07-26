package com.github.ivan.kopylove.sandbox.java.jcl.java.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFoldersExample
{
    @Test
    public void main()
    {
        String property = System.getProperty("java.io.tmpdir");

        String path1 = property + "\\some_dir/subdir1\\123";
        String path2 = property + "\\some_dir//subdir2\\123";
        String path3 = property + "\\some_dir/subdir3\\\\123";

        try
        {
            Path p1 = Files.createDirectories(Paths.get(path1));
            Path p2 = Files.createDirectories(Paths.get(path2));
            Path p3 = Files.createDirectories(Paths.get(path3));
            Assertions.assertTrue(p1.toFile()
                                    .exists());
            Assertions.assertTrue(p2.toFile()
                                    .exists());
            Assertions.assertTrue(p3.toFile()
                                    .exists());
        }
        catch (IOException e)
        {
            Assertions.fail();
            e.printStackTrace();
        }
    }
}
