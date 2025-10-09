
package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class select {

	public static void main(String[] args) throws Exception {
	       String URL = "jdbc:mysql://localhost:3306/mysql";
	        String USER = "root";
	        String PASSWORD = "sony112@8919";

	        Class.forName("com.mysql.cj.jdbc.Driver");    
	        System.out.println("The Driver is loaded successfully");
	        
	        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
	        System.out.println("Connection Established");

	        Statement st = con.createStatement();

	        ResultSet rs = st.executeQuery("SELECT * FROM student");

	        while (rs.next()) {
	            int id = rs.getInt("sid");
	            String name = rs.getString("sname");
	            System.out.println("ID: " + id + ", Name: " + name);
	        }

	        rs.close();
	        st.close();
	        con.close();
	    }
	}


