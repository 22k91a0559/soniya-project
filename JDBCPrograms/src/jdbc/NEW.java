package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class NEW {
    public static void main(String[] args) throws Exception {
        String URL = "jdbc:mysql://localhost:3306/soniyadb";
        String USER = "root";
        String PASSWORD = "sony112@8919";

        // Load MySQL driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("The Driver is loaded successfully");

        // Connect to database
        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
        System.out.println("Connection Established");

        Statement stmt = con.createStatement();

        // Check if table exists
        ResultSet rs = stmt.executeQuery(
            "SHOW TABLES LIKE 'student'"
        );

        if (!rs.next()) {
            System.out.println("Table 'student' does not exist. Creating table...");
            stmt.executeUpdate(
                "CREATE TABLE student (id INT PRIMARY KEY, name VARCHAR(50), age INT)"
            );
            System.out.println("Table 'student' created successfully.");
        }

        // Delete record with a specific ID
        int rows = stmt.executeUpdate("DELETE FROM student WHERE id = 1");
        if (rows > 0) {
            System.out.println("Record deleted successfully.");
        } else {
            System.out.println("No record found with the given ID.");
        }

        con.close();
    }
}