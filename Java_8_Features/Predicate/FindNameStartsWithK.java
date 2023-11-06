package Predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Predicate;

public class FindNameStartsWithK {

	public static void main(String[] args) {
		String[] strArr= {"Sunny","Kajal","Mallika","Katrina","Kareena"};
		
		Predicate<String> predicate=str->str.startsWith("K");
//		Predicate<String> predicate=str->str.charAt(0)=='K';
		System.out.println("Name Starts With K");
		find(predicate, strArr);
		
		System.out.println("Name Starts Not With K");
		find(predicate.negate(), strArr);
	}
	
	public static void find(Predicate<String> predicate, String[] strArr) {
		for (String string : strArr) {
			if (predicate.test(string)) {
				System.out.println(string);
			}
		}
	}

}
