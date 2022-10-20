package ReaddatafromDB;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class readdatafromDatabase {
	@Test
	public void readDataTest() throws Throwable
	{
		//step2 connect to database
		Connection con=null;
		try {
			//step 1 Register the driver
			Driver dref=new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(dref);
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root","root");
			
			//step3 creat statement
			Statement stmt = con.createStatement();
			
			//step4 execute query
			ResultSet result = stmt.executeQuery("select * from students_info;");
			while(result.next())
			{
				System.out.println(result.getString(1)+""+result.getString(2));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		finally {
			
		
		//step5 close connection with database
		con.close();
		System.out.println("connection closed");
		}
	}
		
		
		
		
	}


