package bank.management.system;
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;

    public Conn() {
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver"); // Ensure driver is loaded
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Prabh@kar23");
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
