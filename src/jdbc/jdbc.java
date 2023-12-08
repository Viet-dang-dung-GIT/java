package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String driverName = "com.mysql.cj.jdbc.Driver";
        String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/pratientdb";
        String user="root";
        String pass="";
        try {
            System.out.println("Connecting to the database: "+jdbcUrl);
            Connection myConn=
                    DriverManager.getConnection(jdbcUrl,user,pass);
            System.out.println("Connection successful!");
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

}
