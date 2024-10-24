package cbba7ca30f474263b8d43ecdbe9e26d8;

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
