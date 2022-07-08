package com.hp.shankar.corejavaPrograms;

public class Client {
	public static void main(String[] args) {
		System.out.println(SingleTon.getSingleTon().hashCode());
		System.out.println(SingleTon.getSingleTon().hashCode());
		System.out.println(SingleTon.getSingleTon().hashCode());
		System.out.println(SingleTon.getSingleTon().hashCode());
	}
}

class SingleTon {
	private static SingleTon st = null;
	private static SingleTon st2 = null;

	private SingleTon() {
	}
	public static SingleTon getSingleTon() {

		if (st == null) {
			st = new SingleTon();
			return st;
		}
		else if (st2 == null) {
			st2 = new SingleTon();
			return st2;
		}
		else {
			double randomNumber= Math.random();
			boolean isTrue =randomNumber<0.5;
			System.out.println(randomNumber);
			System.out.println(isTrue);
			if(isTrue)
				return st;
			else
				return st2;
		}
		

	}
}
