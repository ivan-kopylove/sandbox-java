package com.github.ivan.kopylove.challenges.cd60574ed8864718931db1b17b320983;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SerialVersionUidTest
{
    private static final String FILE_NAME  = System.getProperty("java.io.tmpdir") + "SerialVersionUid-sandbox-java-test.dat";
    private static final String TEST_VALUE = "test value";

    @BeforeEach
    public void writeThenChangeSerialVersionUidManually() throws IOException
    {
        File file = new File(FILE_NAME);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream os = new ObjectOutputStream(fileOutputStream);
        os.writeObject(new com.github.ivan.kopylove.challenges.cd60574ed8864718931db1b17b320983.SerializableClass(TEST_VALUE));
        os.flush();
        os.close();

        assertTrue(file.exists());
    }

    @Test
    void readWrittenFile() throws IOException, ClassNotFoundException
    {
        FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        com.github.ivan.kopylove.challenges.cd60574ed8864718931db1b17b320983.SerializableClass result = (com.github.ivan.kopylove.challenges.cd60574ed8864718931db1b17b320983.SerializableClass) objectInputStream.readObject();

        objectInputStream.close();

        assertEquals(TEST_VALUE, result.getValue());
    }
}
