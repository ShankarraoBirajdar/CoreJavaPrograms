package File_IO_Serialization;
import java.io.*;
class dog implements Serializable
{
	int a=10;
	int b=20;
	transient int c=30; //It Applicable only for Variable And That Means No Serialize
	static transient int d=40;/*static keyword related to class level and
	                            transient keyword related to object level SO no impact*/
	final transient int f=50;/*final variable will be participate in
	                           serialization by their value so declaring final variable as trasient 
	                            no use or impact */
}
public class TransientKeyword
{

	public static void main(String[] args) throws Exception
	{
		dog d1=new dog();
         /*............Serialization.............*/
		
		FileOutputStream fout=new FileOutputStream("TransientOperation.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fout);
		oos.writeObject(d1);
		
		/*............Deserialization.............*/
		
		FileInputStream fin=new FileInputStream("TransientOperation.txt");
		ObjectInputStream ois=new ObjectInputStream(fin);
		dog d2=(dog)ois.readObject();

		System.out.println("a="+d2.a+" b="+d2.b);
		System.out.println("c="+d2.c);
		System.out.println("d="+d2.d+" f="+d2.f);

	}

}
