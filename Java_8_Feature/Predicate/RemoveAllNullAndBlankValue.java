package Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class RemoveAllNullAndBlankValue {

	public static void main(String[] args) {
		String[] strArr= {"Durga","",null,"Ravi","","Shiva",null};
		System.out.println("Before Remove:: "+Arrays.toString(strArr));
		Predicate<String> predicate = str-> str!=null && str.length()!=0;
		System.out.println("Removed All Null And Blank Value");
        find(predicate, strArr);
	}
	
	public static void find(Predicate<String> predicate, String[] strArr) {
		
		ArrayList<String > list =new ArrayList<String>();
		for (String string : strArr) {
			if (predicate.test(string)) {
				list.add(string);
			}
		}
		
		System.out.println("Valid Names Are: "+list);
	}

}
