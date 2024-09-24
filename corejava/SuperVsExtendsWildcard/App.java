package SuperVsExtendsWildcard;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
//		ArrayList<Object> arrayList = new ArrayList<String>();//Type mismatch: cannot convert from ArrayList<String> to ArrayList<Object>
		ArrayList<String> arrayList1 = new ArrayList<String>();
		arrayList1.add("abc");
		arrayList1.add("xyz");
		arrayList1.add(null);
//		arrayList.add(123);//The method add(int, String) in the type ArrayList<String> is not applicable for the arguments (int)
		m1(arrayList1);
		
		ArrayList<String> arrayList2 = new ArrayList<String>();
//		arrayList2.add("abc");//The method add(capture#1-of ?) in the type ArrayList<capture#1-of ?> is not applicable for the arguments (String)
//		arrayList2.add("xyz");//The method add(capture#1-of ?) in the type ArrayList<capture#1-of ?> is not applicable for the arguments (String)
		arrayList2.add(null); //No error for adding null
//		arrayList2.add(123);//The method add(capture#1-of ?) in the type ArrayList<capture#1-of ?> is not applicable for the arguments (String)
		m2(arrayList2);

		ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
//		arrayList3.add("abc");
//		arrayList3.add("xyz");
//		arrayList3.add(null);
//		arrayList3.add(123);
		arrayList3.add(123);
		arrayList3.add(444);
		ArrayList<Double> arrayList4 = new ArrayList<Double>();
//		arrayList4.add("abc");
//		arrayList4.add("xyz");
//		arrayList4.add(null);
//		arrayList4.add(123);
		arrayList4.add(12.4d);
		arrayList4.add(77.45d);
		m3(arrayList3);
		m3(arrayList4);
		
		
	}
	
	public static void m1(ArrayList<String> arrayList) {
		System.out.println(arrayList);
	}
	
	public static void m2(ArrayList<?> arrayList) {
		System.out.println(arrayList);
	}
	
	public static void m3(ArrayList<? extends Number> arrayList) {

		System.out.println(arrayList);
	}

}
