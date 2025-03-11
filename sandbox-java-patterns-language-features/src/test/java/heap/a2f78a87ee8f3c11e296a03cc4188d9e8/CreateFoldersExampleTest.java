package heap.a2f78a87ee8f3c11e296a03cc4188d9e8;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * java.io.* playground
 */
class CreateFoldersExampleTest
{
    @Test
    void main()
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

            assertTrue(p1.toFile()
                         .exists());
            assertTrue(p2.toFile()
                         .exists());
            assertTrue(p3.toFile()
                         .exists());
        }
        catch (IOException e)
        {
            fail();
            e.printStackTrace();
        }
    }
}
