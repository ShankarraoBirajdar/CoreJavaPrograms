package File_IO_MergeOperation;
import java.io.*;
//WAP to Merger Two File And Save Data Into 3rd File But Remove Duplicates
public class MergeTwoFileButDuplicateAvoid 
{

	public static void main(String[] args) 
	{
		try {
			PrintWriter pw =new PrintWriter("OutPut.txt");
			BufferedReader br1=new BufferedReader(new FileReader("Input.txt"));
			String line=br1.readLine();
			while(line!=null)
			{
				boolean avialable=false;
				BufferedReader br2=new BufferedReader(new FileReader("Delete.txt"));
				String target=br2.readLine();
				while(target!=null)
				{
					if(line.equals(target))
					{
						avialable=true;
						break;
					}
					target=br2.readLine();
				}
				
				if(avialable==false)
				{
					pw.println(line);
				}
				line=br1.readLine();
			}
			pw.flush();
		} catch (Exception e) {
			
			System.out.println(e);
		}
		System.out.println("Operation is Successful");

	}

}
