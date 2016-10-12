package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDao {
    public static Connection getConnection() {
        String driver = "com.mysql.jdbc.Driver";
        //String url = "jdbc:mysql://wndbjrowdlbi.rds.sae.sina.com.cn:10386/bookdb";
        String url = "jdbc:mysql://localhost:3306/bookDB";
        String user = "root";
        String password = "root";
        Connection conn = null;
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
