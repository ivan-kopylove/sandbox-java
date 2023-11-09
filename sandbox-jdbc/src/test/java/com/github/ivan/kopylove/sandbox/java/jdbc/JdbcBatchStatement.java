package com.github.ivan.kopylove.sandbox.java.jdbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Batch reduces the number of database roundtrip which again results in significant performance gain.
 */
class JdbcBatchStatement
{
    private static final String CREATE_PARENTTABLE  = "CREATE TABLE GEMS (GEM_KEY INTEGER NOT NULL, NAME VARCHAR(255), PRIMARY KEY (GEM_KEY))";
    private static final String SQL_INSERT_TEMPLATE = "";

    @BeforeAll
    public static void create_table() throws SQLException
    {
        Connection conn = null;
        Statement statement = null;
        try
        {
            conn = DriverManager.getConnection("jdbc:h2:mem:myDb;DB_CLOSE_DELAY=-1");
            statement = conn.createStatement();

            int lines = statement.executeUpdate(CREATE_PARENTTABLE);
            Assertions.assertEquals(0, lines);
        }
        finally
        {
            if (statement != null)
            {
                statement.close();
            }
            if (conn != null)
            {
                conn.close();
            }
        }
    }

    @Test
    void run() throws SQLException
    {
        Connection conn = null;
        Statement statement = null;

        try
        {
            conn = DriverManager.getConnection("jdbc:h2:mem:myDb;DB_CLOSE_DELAY=-1");
            statement = conn.createStatement();

            statement.addBatch("INSERT INTO GEMS (GEM_KEY, NAME) VALUES (1000, 'Citrine')");
            statement.addBatch("INSERT INTO GEMS (GEM_KEY, NAME) VALUES (1001, 'Quartz')");
            statement.addBatch("INSERT INTO GEMS (GEM_KEY, NAME) VALUES (1002, 'Amber')");

            int[] recordsAffected = statement.executeBatch();


            Assertions.assertEquals(1, recordsAffected[0]);
            Assertions.assertEquals(2, recordsAffected[1]);
            Assertions.assertEquals(3, recordsAffected[2]);

            statement.close();
            conn.close();
        }
        finally
        {
            if (statement != null)
            {
                statement.close();
            }
            if (conn != null)
            {
                conn.close();
            }
        }
    }
}
