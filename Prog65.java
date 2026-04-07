import java.sql.*;
import java.io.*;

public class Prog65 {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");

            PreparedStatement stmt = con.prepareStatement(
                "INSERT INTO photos VALUES (?, ?)");

            FileInputStream img = new FileInputStream("sahil.jpg");
            stmt.setInt(1, 1);
            stmt.setBinaryStream(2, img);

            stmt.executeUpdate();
            System.out.println("Image inserted.");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}