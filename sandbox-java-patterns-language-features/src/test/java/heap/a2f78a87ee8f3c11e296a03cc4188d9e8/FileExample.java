package heap.a2f78a87ee8f3c11e296a03cc4188d9e8;

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

