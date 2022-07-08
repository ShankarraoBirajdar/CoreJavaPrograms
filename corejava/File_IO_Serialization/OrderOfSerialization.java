package File_IO_Serialization;
import java.io.*;
/*We can Serialize any no of objects to the file,but in which order we serialize in the same order
  only we have to  De-Serialize .That is in Serializtion Order of Objects Is Important*/

class dog1 implements Serializable
{
	int a=10;
	int b=20;
}
class cat implements Serializable
{
	int d=10;
	int e=20;
}
class rat implements Serializable
{
	int f=10;
	int g=20;
}
public class OrderOfSerialization
{

	public static void main(String[] args) throws Exception
	{
		dog1 d1=new dog1();
		cat c1=new cat();
		rat r1=new rat();
        /*............Serialization.............*/
		
		FileOutputStream fout=new FileOutputStream("OrderOfSerial.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fout);
		oos.writeObject(d1);
		oos.writeObject(c1);
		oos.writeObject(r1);
		
		/*............Deserialization.............*/
		
		FileInputStream fin=new FileInputStream("OrderOfSerial.txt");
		ObjectInputStream ois=new ObjectInputStream(fin);
		dog1 d2=(dog1)ois.readObject();
		cat c2=(cat)ois.readObject();
		rat r2=(rat)ois.readObject();
		
		System.out.println("a="+d2.a+" b="+d2.b);
		System.out.println("c="+c2.d+" d="+c2.e);
		System.out.println("d="+r2.f+" f="+r2.g);
		
		/*If we Don't known Order of Object in De-Serialization then we use to instanceOf Operator*/
		/*
		   Object o=ois.readObject();
		   
		   if(o instanceOf dog1)
		   {
		   dog1 d2=(dog1)ois.readObject();
		   }
		   else if(o instanceOf cat)
		   {
		   cat c2=(cat)ois.readObject();
		   }
		   else if(o instanceOf rat)
		   {
		   rat r2=(rat)ois.readObject();
		   }
		   
		 */
		

	}

}
