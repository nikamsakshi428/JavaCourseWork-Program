import java.sql.*;

public class Prog64 {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");

            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO students VALUES (1, 'Sahil')");

            System.out.println("Data inserted.");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}