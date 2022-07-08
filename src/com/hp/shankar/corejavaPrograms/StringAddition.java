package com.hp.shankar.corejavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringAddition {

	public static void main(String[] args) {
		String str = "a1ddgf2svc67bchd30dsdf1000jhbu1000vjbut1000";
		String[] strArray = str.split("\\D");
		int sum = 0;
		
		List<Integer> source = Arrays.asList(1, 2, 3);
		List<Integer> dest = Arrays.asList(5, 6, 7, 8, 9, 10);
		Collections.copy(dest, source);
		
		System.out.println(source);
		System.out.println(dest);

//		System.out.println(Arrays.toString(strArray));

		/* Method 1 */
		List<String> list = List.of(strArray);
//		List<String> list = Arrays.asList(strArray);

		List<String> list2 = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {

			if (!list.get(i).isBlank()) {
				sum = sum + Integer.parseInt(list.get(i));
				list2.add(list.get(i));
			}
		}
		System.out.println(list2);
		System.out.println(sum);

		/* Method 2 */
		sum = 0;
		for (int i = 0; i < strArray.length; i++) {
			try {
				sum = sum + Integer.parseInt(strArray[i]);
			} catch (Exception e) {

			}

		}

		System.out.println(sum);
	}

}
