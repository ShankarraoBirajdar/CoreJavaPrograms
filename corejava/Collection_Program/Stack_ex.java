package Collection_Program;

import java.util.Scanner;
import java.util.Stack;

public class Stack_ex {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Stack obj = new Stack();
		 obj.push(new Integer(3));
//		 obj.push(new Integer(2));
//		 obj.pop();
//		 obj.push(new Integer(5));
		System.out.println(obj.pop());
		Stack_ex t=new Stack_ex();
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		try{
		    double d= Double.valueOf(s);
		    if (d==(int)d){
		        System.out.println("integer"+(int)d);
		    }else{
		        System.out.println("double"+d);
		    }
		}catch(Exception e){
		    System.out.println("not number");}



	}

}
