package cmd_args;

public class CommandLine_args
{

	public static void main(String[] args)
	{
		int m1=Integer.parseInt(args[0]);
		int m2=Integer.parseInt(args[1]);
		int m3=Integer.parseInt(args[2]);
		
		int ans=(m1+m2+m3);
		
		/*Right click->Run As-> Run Configuration ->select Program name->click argument tab-> add agrument
		 * in  program agrument */
		System.out.println(ans);
	}

}
