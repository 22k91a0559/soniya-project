
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class update {

	public static void main(String[] args) throws Exception {
		String URL = "jdbc:mysql://localhost:3306/mysql";
		String USER = "root";
		String PASSWORD = "sony112@8919";
			
		//step-1 : load and register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");	
		System.out.println("The Driver is loaded successfully");
		
		//step-2 : Establishing the connection
		Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
		System.out.println("Connection Established");
		
		//step-3 : statement creation
		Statement st = con.createStatement();
		
		//step-4 : execute a query
		st.executeUpdate("UPDATE student SET sname = 'seetha B' where sid = 101");
		st.executeUpdate("UPDATE student SET sname = 'soniya D' where sid = 102");
		System.out.println("Table updated successfully");
		
		st.close();
		con.close();

		}
		


	}


