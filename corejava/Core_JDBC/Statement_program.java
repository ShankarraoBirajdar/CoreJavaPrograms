package Core_JDBC;
import java.io.*;
import java.sql.*;
public class Statement_program {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/DJT32","root","root");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("1.Insert\n2.Update\n3.Delete");
			int ch=Integer.parseInt(br.readLine());

			switch(ch)
			{
			case 1:System.out.println("enter no of Student");
			int no=Integer.parseInt(br.readLine());
			int id;String name,Address;
			Statement ps=con.createStatement();
			for(int i=0;i<no;i++)
			{
				System.out.println("Enter The Student Details");
			     id=Integer.parseInt(br.readLine());
				 name=br.readLine();
			     Address=br.readLine();
			     String sql="insert into student values("+id+",'"+name+"','"+Address+"')";
				ps.addBatch(sql); 
			}
			int[] c=ps.executeBatch();
			if(c.length>0)
				System.out.println(c.length+"Record Inserted..!");
			else
				System.out.println("Record not Inserted..!");
			break;
			case 2:System.out.println("enter no of Update");
			int no2=Integer.parseInt(br.readLine());
			Statement stmt2=con.createStatement();
			for(int i=0;i<no2;i++)
			{
				System.out.println("Enter The Student  Id");
		      int id2=Integer.parseInt(br.readLine());
		      System.out.println("Enter The Student Name,Address");
		      String name2=br.readLine();
		      String address2=br.readLine();
		     
		      String sql2="update student set name='"+name2+"',Address='"+address2+"'where id="+id2+" ";
		      stmt2.addBatch(sql2);
			}
			int[] i2=stmt2.executeBatch();
		      if(i2.length>0)
		    	  System.out.println(i2.length+"Record Update Successfully");
		      else
		    	  System.out.println("Record Not Update Successfully");

			break;
			case 3:System.out.println("enter no of Delete");
			int no3=Integer.parseInt(br.readLine());
			Statement stmt3=con.createStatement();
			for(int i=0;i<no3;i++)
			{
				System.out.println("Enter The Student  Id");
		      int id3=Integer.parseInt(br.readLine());
		      String sql3="delete from student where id="+id3+" ";
		      stmt3.addBatch(sql3);
			}
			int[] i3=stmt3.executeBatch();
		      if(i3.length>0)
		    	  System.out.println(i3.length+"Record Delete Successfully");
		      else
		    	  System.out.println("Record Not Delete Successfully");;
			break;

			default :System.out.println("Sorry try Again..!");
			}



		} catch (Exception e) {

			System.out.println(e);
		}



	}

}
