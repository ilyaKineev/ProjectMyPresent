package com.ProjectMyPresent.ProjectMyPresent.Repository;

import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


@Repository
public class MainTableTest {
    static final String DB_URL = "jdbc:postgresql://ec2-52-31-201-170.eu-west-1.compute.amazonaws.com:5432/d8lq9j2cok5af4";
    static final String USER = "nqbmcohoindqwx";
    static final String PASS = "01ea3ed55096b52f611e4d86409845b20e802c10446919ef8f409ce58711fc18";

    public static List<Boolean> getAnswers(long id) {
        List<Boolean> booleanList = new ArrayList<>();
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection(DB_URL, USER, PASS);
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM maintabletest WHERE id = '" + id + "';");
            while (rs.next()) {
                for (int i = 1; i <= 100; i++) {
                    boolean b = rs.getBoolean("q_" + i);
                    booleanList.add(b);
                }
            }
            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return booleanList;
    }
}
