package Core_JDBC;
import java.io.*;
import java.sql.*;
public class Drop_Program {

	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/DJT32","root","root");
			 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		      Statement stmt=con.createStatement();
		      String sql="Drop table student ";
		      int i=stmt.executeUpdate(sql);
		      if(i==0)
		    	  System.out.println("table Drop Successfully");
		      else
		    	  System.out.println("table Drop not Successfully");
		} catch (Exception e) {
			
			System.out.println(e);

		}

	}

}
