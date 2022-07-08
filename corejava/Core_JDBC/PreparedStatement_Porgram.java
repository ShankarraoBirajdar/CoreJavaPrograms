
/*WAp to use PreparedStatement and Batch  */
package Core_JDBC;
import java.io.*;
import java.sql.*;
public class PreparedStatement_Porgram
{

	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/DJT32","root","root");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("1.Insert\n2.Update\n3.Delete");
			int ch=Integer.parseInt(br.readLine());

			switch(ch)
			{
			case 1:System.out.println("enter no of employee");
			int no=Integer.parseInt(br.readLine());
			
			PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");
			for(int i=0;i<no;i++)
			{
				System.out.println("Enter The Student Details");
				int id=Integer.parseInt(br.readLine());
				String name=br.readLine();
				String  Address=br.readLine();
				ps.setInt(1,id);
				ps.setString(2,name);
				ps.setString(3,Address);
				ps.addBatch(); 
			}
			int[] c=ps.executeBatch();
			if(c.length>0)
				System.out.println(c.length+"Record Inserted..!");
			else
				System.out.println("Record not Inserted..!");
			break;
			case 2:System.out.println("Enter Student Id");
			int id2=Integer.parseInt(br.readLine());
			String name2=br.readLine();
			String Address2=br.readLine();
			PreparedStatement ps1=con.prepareStatement("update student set(name=?,Address=?)");
			ps1.setInt(1,id2);
			ps1.setString(2,name2);
			ps1.setString(3,Address2);
			ps1.executeUpdate();

			break;
			case 3:System.out.println("Enter Student Id");
			int id3=Integer.parseInt(br.readLine());
			PreparedStatement ps2=con.prepareStatement("delete from student where id=? ");
			ps2.setInt(1,id3);
			ps2.executeUpdate();
			break;

			default :System.out.println("Sorry try Again..!");
			}



		} catch (Exception e) {

			System.out.println(e);
		}


	}

}
