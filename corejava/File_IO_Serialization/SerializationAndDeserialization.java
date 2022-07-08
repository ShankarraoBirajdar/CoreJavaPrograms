package File_IO_Serialization;
import java.io.*;
class student implements Serializable
{
	int rollno=101;
	String name="shankar";
}

public class SerializationAndDeserialization 
{

	public static void main(String[] args) throws Exception
	{
		student s=new student();
		
		/*............Serialization.............*/
		
		FileOutputStream fout=new FileOutputStream("student.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fout);
		oos.writeObject(s);
		
		/*............Deserialization.............*/
		
		FileInputStream fin=new FileInputStream("student.txt");
		ObjectInputStream ois=new ObjectInputStream(fin);
		student s2=(student)ois.readObject();

		System.out.println("RollNo="+s2.rollno+"\nName="+s2.name);
	}

}
