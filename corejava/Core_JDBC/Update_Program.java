package Core_JDBC;
import java.io.*;
import java.sql.*;
public class Update_Program {

	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/DJT32","root","root");
			 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		      System.out.println("Enter The Student  Id");
		      int id=Integer.parseInt(br.readLine());
		      System.out.println("Enter The Student Name,Address");
		      String name=br.readLine();
		      String address=br.readLine();
		      Statement stmt=con.createStatement();
		      String sql="update student set id="+id+",name='"+name+"',Address='"+address+"'where id="+id+" ";
		      int i=stmt.executeUpdate(sql);
		      if(i>0)
		    	  System.out.println("Record Update Successfully");
		      else
		    	  System.out.println("Record Not Update Successfully");
		} catch (Exception e) {
			
			System.out.println(e);

		}

	}

}
