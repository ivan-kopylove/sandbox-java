package cbba7ca30f474263b8d43ecdbe9e26d8;

import java.io.File;
import java.io.IOException;

/**
 * java.io.* playground
 */
class FileExample
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("1.txt");
        System.out.println(f);
        System.out.println(f.getAbsolutePath());
        System.out.println(f);
        System.out.println(f.getCanonicalPath());
        System.out.println(f.getAbsoluteFile());
    }
}

