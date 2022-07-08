package File_IO_Package;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterOperation {

	public static void main(String[] args) throws IOException
	{
		 try
		 {
			 File f=new File("abc.txt");
			FileWriter fw=new FileWriter(f,true);
			char[]c={'a','b','c','d','e'};
			fw.write("\n");
			fw.write(c);
			fw.write('c');
			fw.write(100);
			fw.write("\n ");
			fw.write(1+""+2+""+3+""+4+""+5+""+6+""+7+""+8+""+9+""+10);
			fw.write("\nStrind data\n");
			fw.write('\n');//in some java system \n is not treated as new line but treated as data
			fw.write("char data\n");
			fw.flush();
			fw.close();

			
			
		 }
		 catch(FileNotFoundException e)
		 {
			 System.out.println(e.getMessage());
		 }



	}

}
