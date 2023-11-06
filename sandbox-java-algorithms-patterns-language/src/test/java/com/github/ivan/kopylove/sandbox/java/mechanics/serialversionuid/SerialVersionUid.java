package com.github.ivan.kopylove.sandbox.java.mechanics.serialversionuid;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Ivan Kopylov
 */

public class SerialVersionUid
{
    private static final String FILE_NAME  = System.getProperty("java.io.tmpdir") + "SerialVersionUid-sandbox-java-test.dat";
    private static final String TEST_VALUE = "test value";

    @BeforeEach
    public void writeThenChangeSerialVersionUidManually() throws IOException
    {
        File file = new File(FILE_NAME);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream os = new ObjectOutputStream(fileOutputStream);
        os.writeObject(new SerializableClass(TEST_VALUE));
        os.flush();
        os.close();

        Assertions.assertTrue(file.exists());
    }

    @Test
    public void readWrittenFile() throws IOException, ClassNotFoundException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        SerializableClass result = (SerializableClass) objectInputStream.readObject();

        objectInputStream.close();

        Assertions.assertEquals(TEST_VALUE, result.getValue());
    }
}
