package demo;

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
        // Buoc 1: Nap trinh dieu khien
        try {
            Class.forName(driverName);
            // Buoc 2: Tao Ket Noi
            try {
                Connection myConn=DriverManager.getConnection(jdbcUrl,user,pass);

                // Buoc 3: Tao doi tuong statement
                // Buoc 4: Thuc hien truy van
                Statement stmt = myConn.createStatement();
                String sql = "SELECT * FROM pratienttbl;";
                ResultSet result= stmt.executeQuery(sql);
                // Buoc 5: Xu Ly Ket qua tra ve
                while (result.next()) {
                    int id = result.getInt(1);
                    String name =result.getString(2).trim();
                    Double hospitalFee = result.getDouble(3);
                    Patient tempStudent = new Patient(id, name, hospitalFee);
                    System.out.println("" + tempStudent.toString());
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



        // Buoc 6: Dong ket noi
    }

}
