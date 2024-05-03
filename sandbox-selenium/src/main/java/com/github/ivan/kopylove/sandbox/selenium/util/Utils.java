package com.github.ivan.kopylove.sandbox.selenium.util;

import javax.annotation.Nullable;
import java.io.File;
import java.net.URL;

class Utils
{
    @Nullable
    public static String convertClassPathToAbsolutePath(String path)
    {
        URL resource = Utils.class.getClassLoader()
                                  .getResource("FindElementsRelevantToAnother.html");
        if (resource != null)
        {
            File file = new File(resource.getFile());
            String absolutePath = file.getAbsolutePath();
            String prefix = "file:///";
            return prefix += absolutePath;
        }
        else
        {
            return null;
        }
    }
}
