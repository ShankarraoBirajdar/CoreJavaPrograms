package com.hp.shankar.corejavaPrograms;

class Animal{}
class Monkey extends Animal{}

class Test {

	void methodOne(Animal a) {
		System.out.println("Animal agrs Method");
	}

	void methodOne(Monkey m) {
		System.out.println("Monkey agrs Method");
	}

	
	public static void main(String[] args) {

		Test t=new Test();
     Animal a=new Animal();
     Monkey m=new Monkey();
     
     t.methodOne(a);
     t.methodOne(m);
     
     Animal am=new Monkey();
     t.methodOne(am);
   
     
		
	}

}