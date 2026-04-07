import java.sql.*;

public class Prog66 {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");

            CallableStatement stmt = con.prepareCall("{call getStudent(?)}");
            stmt.setInt(1, 1); // student ID
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println("Name: " + rs.getString("name"));
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}