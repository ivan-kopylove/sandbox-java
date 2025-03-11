package heap.a2f78a87ee8f3c11e296a03cc4188d9e8;

import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * java.io.* playground
 */
class FileDeletionTest
{
    public static void main(String[] args)
    {
        File catalog = new File("src/main/resources/");
        File[] files = catalog.listFiles();
        List<File> listFiles = Arrays.asList(files);
        listFiles.forEach(File::delete);
    }
}
