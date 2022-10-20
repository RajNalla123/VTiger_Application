package ReaddatafromDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.xdevapi.Statement;

public class updatedataindatabase {
	@Test
	public void updatedatabaseTest() throws SQLException
	{
		Connection con=null;
		try {
			Driver dref= new Driver();
			DriverManager.registerDriver(dref);
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
			java.sql.Statement stmt = con.createStatement();
			int result=stmt.executeUpdate("insert into students_info (regno, firstname, middlename, lastname) values(4, 'raj', 'nalla', 'h');");
			if(result==1)
			{
				System.out.println("Data is stored");
			}
			else
			{
				System.out.println("Data is not stored");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
		
		con.close();
		System.out.println("connection closed");
		}
	}
	
		
			
		
		
	}


