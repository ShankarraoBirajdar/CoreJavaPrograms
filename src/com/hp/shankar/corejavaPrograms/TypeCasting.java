package com.hp.shankar.corejavaPrograms;

public class TypeCasting {
	
	public static void main(String[] args) {
		
		String str=new String("String");
		Object obj=str;
		System.out.println(str.hashCode()+"="+obj.hashCode());
		System.out.println(obj);
		
		Integer i = new Integer(10);
		Number n=i;
		obj=n;
		System.out.println(i.hashCode()+"="+n.hashCode()+"="+obj.hashCode());
		System.out.println(obj);
		
		
	}

}
