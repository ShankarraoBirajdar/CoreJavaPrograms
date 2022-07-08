package StringPrograms;

import java.util.Scanner;
//WAP On abc=1,def=2,ghi=3......yz=9 encryption of mobile no-->12345678ag o/p-->1234567813
public class Assignment2 
{

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		String s; 
		System.out.println("Enter The Mobile no");
		s=sc.nextLine();
		if(s.length()<=10)
		{
			//System.out.println("length of String is -->"+s.length());
			for(int i=0;i<s.length();i++)
			{
			for(int j=0;j<1;j++)
			{
				if(s.charAt(i)=='A'||s.charAt(i)=='B'||s.charAt(i)=='C'||s.charAt(i)=='a'||s.charAt(i)=='b'||s.charAt(i)=='c')
				{
					System.out.println(1);break;
				}
									
				if(s.charAt(i)=='D'||s.charAt(i)=='E'||s.charAt(i)=='F'||s.charAt(i)=='d'||s.charAt(i)=='e'||s.charAt(i)=='f')
				{
					System.out.println(2);break;
				}
									
				if(s.charAt(i)=='G'||s.charAt(i)=='H'||s.charAt(i)=='I'||s.charAt(i)=='g'||s.charAt(i)=='h'||s.charAt(i)=='i')
				{
					System.out.println(3);break;
				}
				if(s.charAt(i)=='J'||s.charAt(i)=='K'||s.charAt(i)=='L'||s.charAt(i)=='j'||s.charAt(i)=='k'||s.charAt(i)=='l')
				{
					System.out.println(4);break;
				}
				if(s.charAt(i)=='M'||s.charAt(i)=='N'||s.charAt(i)=='O'||s.charAt(i)=='m'||s.charAt(i)=='n'||s.charAt(i)=='o')
				{
					System.out.println(5);break;
				}
				if(s.charAt(i)=='P'||s.charAt(i)=='Q'||s.charAt(i)=='R'||s.charAt(i)=='p'||s.charAt(i)=='q'||s.charAt(i)=='r')
				{
					System.out.println(6);break;
				}
				if(s.charAt(i)=='S'||s.charAt(i)=='T'||s.charAt(i)=='U'||s.charAt(i)=='s'||s.charAt(i)=='t'||s.charAt(i)=='u')
				{
					System.out.println(7);break;
				}
				if(s.charAt(i)=='V'||s.charAt(i)=='W'||s.charAt(i)=='X'||s.charAt(i)=='v'||s.charAt(i)=='w'||s.charAt(i)=='x')
				{
					System.out.println(8);break;
				}
				if(s.charAt(i)=='Y'||s.charAt(i)=='Z'||s.charAt(i)=='y'||s.charAt(i)=='z')
				{
					System.out.println(9);break;
				}
				
				else
				{
					System.out.println(s.charAt(i));
				}
			}
				
			
				
				
			}
			
			
		}
		else
		{
			System.out.println("length of String is Exceed of 10-->"+s.length());
		}

		
		//System.out.println(s);

	}

}
