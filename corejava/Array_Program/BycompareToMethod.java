package Array_Program;

public class BycompareToMethod {

	public static void main(String[] args) 
	{/*
	compareTo() method compares values and returns an int which tells
	 if the values compare less than, equal, or greater than.
      Suppose s1 and s2 are two string variables.If:

    s1 == s2 :0
    s1 > s2   :positive value
    s1 < s2   :negative value

	*/
		String s1="Sachin";  
		   String s2="Sachin";  
		   String s3="Ratan";  
		  
		   System.out.println(s1.compareTo(s2));//0  
		   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
		   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )
		   System.out.println(Character.getNumericValue('S')-Character.getNumericValue('R'));
		   System.out.println(Character.getNumericValue('R')-Character.getNumericValue('S'));
		   
		   s1="";
		   s3="";
		   System.out.println(s1.compareTo(s3));
		   System.out.println(s3.compareTo(s1));

	}

}
