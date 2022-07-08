package ObjectClass;



public class ToStringMethods
{
	int rollno;  
	 String name;  
	 String city; 

	public ToStringMethods(int rollno, String name, String city) 
	{
		this.rollno=rollno;  
		 this.name=name;  
		 this.city=city; 
	}
	public String toString()
	{//overriding the toString() method  
		  return rollno+" "+name+" "+city; 
	}
	public static void main(String[] args) 
	{
		ToStringMethods t=new ToStringMethods(101,"Raj","lucknow");
		ToStringMethods t2=new ToStringMethods(102,"Vijay","ghaziabad");
		System.out.println(t);//compiler writes here s1.toString()  
		System.out.println(t2);//compiler writes here s2.toString()  
	}

}