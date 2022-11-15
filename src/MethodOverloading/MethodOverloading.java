package MethodOverloading;

import java.util.Arrays;

public class MethodOverloading {

    public static int sum(int a) {
    	return a;
	}
    
	public static double sum(int a, int b) {
		return a+b;
	}
	public static float sum(int a, int b, int c) {
		return a+b+c;
	}
	public static void main(String... args) {
	
		System.out.println(sum(10));
		System.out.println(sum('a', 20));
		System.out.println(sum(100, 20, 30));

	}

}
