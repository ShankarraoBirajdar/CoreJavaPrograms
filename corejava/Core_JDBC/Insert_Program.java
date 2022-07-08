package Core_JDBC;
import java.io.*;
import java.sql.*;
public class Insert_Program 
{
	static Connection con=null;
	public static void main(String[] args) throws Exception
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost/DJT32","root","root");
//			 con.setAutoCommit(false);
			 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		      System.out.println("Enter The Student Data Id ,Name,Address");
		      int id=Integer.parseInt(br.readLine());
		      String name=br.readLine();
		      String address=br.readLine();
		      Statement stmt=con.createStatement();
		      String sql="insert into student values"+"("+id+",'"+name+"','"+address+"')";
		      int i=stmt.executeUpdate(sql);
		      
		      if(i>0)
		    	  System.out.println("Record Insert Successfully");
		      else
		    	  System.out.println("Record Not Insert Successfully");
		} catch (Exception e) {
			
			System.out.println(e);
		}
		
       

	}

}
