package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {

    public Connection Get_Connection() throws Exception {
        try {

            //String username = "b2114db3d334e8";
            //String password = "5850d23c";
            String username = "root";
            String password = "westpoint7";
            // String dbUrl = "jdbc:mysql://host:port/db";
            String dbUrl = "jdbc:mysql://127.0.0.1:3307/CoverMyMeds";
            //Class.forName("com.mysql.jdbc.Driver").newInstance();
            //String dbUrl = "jdbc:mysql://us-cdbr-iron-east-02.cleardb.net/heroku_a3fafe30431f3f4";
            return DriverManager.getConnection(dbUrl, username, password);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public DatabaseUtil() {
    }

}
