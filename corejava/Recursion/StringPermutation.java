package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class StringPermutation {
	
	private static  String match;
	private static int count;
	public static ArrayList<String> printPermuation(String result,String input, ArrayList<String> list) {
		if(input.length()==0) {
			list.add(result);
			count++;
			if(result.equals(match)) {
				System.out.println(result+" = "+ (count-1));
			}
		}
		for (int i = 0; i < input.length(); i++) {
			char ch=input.charAt(i);
			String leftPart=input.substring(0,i);
			String rightPart=input.substring(i + 1);
			String concat=leftPart +rightPart;
			printPermuation(result + ch, concat, list);
		}
		
		return list;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter The String");
		String input=scanner.next();//ACBD
		
		System.out.println("Enter The Matcher");
		match=scanner.next();//ABCD
		
		ArrayList<String> list=new ArrayList<String>();
		ArrayList<String> list2 = printPermuation("",input,list);
		
		if(list2.size()<=100) {
			System.out.println(list2);
		}
		
		if(list2.contains(match)) {
			System.out.println("contains: "+list2.contains(match));
			System.out.println("indexOf: "+list2.indexOf(match));
			System.out.println("get: "+list2.get(list2.indexOf(match)));
//			System.out.println("get: "+list2.get(1278575));
			System.out.println("Size() Of List Before Clear(): "+list2.size()+" = "+list.size());
			list2.clear();
			list.clear();
			System.out.println("Size() Of List After Clear(): "+list2.size()+"="+list.size());
		}
		

	}

}
