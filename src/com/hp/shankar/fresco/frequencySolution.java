package com.hp.shankar.fresco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class frequencySolution {

	public static void frequency(int n) {
		//your code here

		String str=Integer.toString(n);
		char[] nArray=str.toCharArray();

		SortedMap<Character,Integer> sm
		= new TreeMap<Character,Integer>();


		for(int i=0;i<nArray.length;i++)
		{
			int count=0;
			for(int j=0;j<nArray.length;j++)
			{
				if(nArray[i]==nArray[j])
				{
					count++;

				}
			}
			sm.put(nArray[i],count);
		}

		//System.out.println(sm);
		for (Map.Entry mapElement : sm.entrySet()) {
			Character key = (Character)mapElement.getKey();

			// Finding the value
			Integer value = (Integer)mapElement.getValue();

			System.out.println(key + ": " + value);
		}



	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		frequency(n);

	}

}
