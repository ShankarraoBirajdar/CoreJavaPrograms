package com.hp.shankar.StringOperations;

import java.util.Arrays;

public class PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[4];//declaration
		arr[0]=10;arr[1]=20;arr[2]=30;arr[3]=40;//initialization
		
		String[] city = new String[4];
		city[0]="Solapur";city[1]="Pune";city[2]="Mumbai";city[3]="Thane";
		
		double[] dArr = {5.1,5.2,5.3,5.4,5.5};
		float[] fArr = {1.1f,1.2f,1.3f,1.4f,1.5f};
		char[] cArr= {'A','B','C','D','F'};
		forloop(arr);
		foreach(city);
		ArraysToString(arr,city,dArr,fArr,cArr);

	}
	
	public static void forloop(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void foreach(String[] city)
	{
		for(String str:city) {
			System.out.println(str);
		}
		
	}

	public static void ArraysToString(int arr[],String[] city,double[] dArr,float[] fArr,char[] cArr)
	{
	
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(city));
		System.out.println(Arrays.toString(dArr));
		System.out.println(Arrays.toString(fArr));
		System.out.println(Arrays.toString(cArr));
		
		System.out.println(Arrays.asList(city));
	}
}
