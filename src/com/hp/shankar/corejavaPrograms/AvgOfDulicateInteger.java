package com.hp.shankar.corejavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AvgOfDulicateInteger {

	public static void main(String[] args) {
		
		int[] numArray = {6,3,8,9,8,9,8};
	    for(int i = 0; i < numArray.length; i++){
	      for(int j = 0; j < numArray.length; j++){
	        if(j!=i && numArray[i] == numArray[j]){
	          System.out.println("Duplicate element found " + numArray[j]);
	        }
	      }
	    }    


		Scanner scanner = new  Scanner(System.in);
		System.out.println("Enter the size of list:");
		Integer sizeofInteger = scanner.nextInt();
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		for(int i=0;i<sizeofInteger;i++) {
			arrayList.add(scanner.nextInt());
			
		}
		
		
		Collections.sort(arrayList);
		int sizeOfArrayList  =arrayList.size();
		
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		
		for(int i=0;i<sizeOfArrayList;i++) {
			for(int j=0;j<sizeOfArrayList;j++) {
				if(i!=j && arrayList.get(i)==arrayList.get(j)) {
					arrayList2.add(arrayList.get(i));
					
				}
			}
		}
		
		System.out.println(arrayList);
		System.out.println(arrayList2);
		
		int sum=0,avg=0;
		for(int i: arrayList2) {
			sum=sum+i;
		}
		System.out.println(sum);
		avg=sum/arrayList2.size();
		System.out.println(avg);
		
		

	}

}
