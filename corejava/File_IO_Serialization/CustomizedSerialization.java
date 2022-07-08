package File_IO_Serialization;
import java.io.*;

class Login implements Serializable
{
	 String userName="Shankar";
	transient String pwd="ABCD";
	transient int pin=1234;
	private void writeObject(ObjectOutputStream os) throws Exception
	{
		os.defaultWriteObject();
		String epwd="123"+pwd;
		os.writeObject(epwd);
		int epin=4444+pin;
		os.writeInt(epin);
	}
	private void readObject(ObjectInputStream in) throws Exception
	{
		in.defaultReadObject();
		String epwd=(String)in.readObject();
		pwd=epwd.substring(3);
		int epin=in.readInt();
		pin=epin-4444;		
	}
}
public class CustomizedSerialization
{

	public static void main(String[] args) throws Exception
	{
		Login l=new Login();
		System.out.println("Before Serialization");
		System.out.println("userName ="+l.userName+"\nPwd="+l.pwd+"\nPin="+l.pin);
		
         /*............Serialization.............*/
		
		FileOutputStream fout=new FileOutputStream("CustomizedSeri.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fout);
		oos.writeObject(l);
		
		
		/*............Deserialization.............*/
		
		FileInputStream fin=new FileInputStream("CustomizedSeri.txt");
		ObjectInputStream ois=new ObjectInputStream(fin);
		Login l2=(Login)ois.readObject();
		System.out.println("\nAfter Serialization");
		System.out.println("userName ="+l2.userName+"\nPwd="+l2.pwd+"\nPin="+l2.pin);

	}

}
