package a3337100f88bfb786d428257b74040014;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.fail;

class SerializableTest
{
    public static int sizeof(Object obj) throws IOException
    {
        ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteOutputStream);

        objectOutputStream.writeObject(obj);
        objectOutputStream.flush();
        objectOutputStream.close();

        return byteOutputStream.toByteArray().length;
    }

    private static String readAllBytesJava7(String filePath)
    {
        String content = "";
        try
        {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return content;
    }

    @Test
    void serializable1()
    {
        String q = readAllBytesJava7("C:\\Windows\\System32\\drivers\\etc\\hosts");
        try
        {
            int i = sizeof(q);
            System.out.println(i);
        }
        catch (IOException e)
        {
            System.out.println("error " + e);
            fail();
        }
    }
}
