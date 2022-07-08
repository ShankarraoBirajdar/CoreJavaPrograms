package StringPrograms;
//WAP On Armstrong Number 
import java.util.Scanner;

public class ArmStrongIO {

	public static void main(String[] args) 
	{
		  int n,c=0,a,temp=1,t=1,c1=0;
		  Scanner sc=new Scanner(System.in);
			String n1; 
			System.out.println("Enter The no");
			n1=sc.nextLine();
		    //int n=153;//It is the number to check armstrong 
			int x=n1.length();

			n=Integer.parseInt(n1);
		    temp=n;  
		    while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    int sum=1;
		    for(int i=0;i<x;i++)
			{
			sum=sum*a;
		    }
		    c=c+(sum);  
		     }  
		    if(temp==c)  
		    System.out.println("armstrong number");   
		    else  
		        System.out.println("Not armstrong number");  
		    /*......................................

		    n	base-10  n-narcissistic numbers or Armstrong number
		    1	0, 1, 2, 3, 4, 5, 6, 7, 8, 9
		    3	153, 370, 371, 407
		    4	1634, 8208, 9474
		    5	54748, 92727, 93084
		    6	548834
		    7	1741725, 4210818, 9800817, 9926315
		    8	24678050, 24678051, 88593477
		    9	146511208, 472335975, 534494836, 912985153
		    10	4679307774 
		    */
		    
		     

	}

}
