package Array_Program;

public class CharacterOperation {

	public static void main(String[] args)
	{
		char c='A';//		char c=3; is also allowed
		char []c2=new char[2];
		char c3[]={1,2,'A','B'};
		char c4=65;
		int x=c2.length;
		System.out.println(x);
		System.out.println(c+ " " +c3);
		/* we cannot print Char of array with concat " "+ use 
		if we want to print then for loop is mandatory
		otherwise without for loop using we try 
		to print then it show address of char variable
		insted of data */

	}

}
