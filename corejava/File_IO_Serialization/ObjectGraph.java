package File_IO_Serialization;
import java.io.*;

class dog2 implements Serializable
{
	cat2 c1=new cat2();
}
class cat2 implements Serializable
{
	rat2 r1=new rat2();
}
class rat2 implements Serializable
{
	int f=10;
	int g=20;
}
public class ObjectGraph
{

	public static void main(String[] args) throws Exception
	{
		dog2 d1=new dog2();
		
		
        /*............Serialization.............*/
		
		FileOutputStream fout=new FileOutputStream("OrderOfSerial.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fout);
		oos.writeObject(d1);
		
		
		/*............Deserialization.............*/
		
		FileInputStream fin=new FileInputStream("OrderOfSerial.txt");
		ObjectInputStream ois=new ObjectInputStream(fin);
		dog2 d2=(dog2)ois.readObject();
		
		System.out.println("f="+d2.c1.r1.f+" g="+d2.c1.r1.g);
	
        /*Group of object is called Object graph*/

	}

}
