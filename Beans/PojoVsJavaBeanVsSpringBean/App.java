package PojoVsJavaBeanVsSpringBean;

import java.io.Serializable;

//Plan Old Java Object  POJO  No constrains

//Java Bean have 3 constrains
//1: Have Public Default (No argument) Constructors
//2:Getter and Setter Methods
//3:Implement java.io.Serializable - marker interface

//Spring Bean
//Any Java Object that is Managed by Spring
//Spring Uses IOC Container (Bean Factory or Application Context) to manage these objects

class POJO{
	//Plan Old Java Object
	private String text;
	private int number;
	
	@Override
	public String toString() {
		return "POJO [text=" + text + ", number=" + number + "]";
	}
	
	
}

class JavaBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String text;
	private int number;
	
	public JavaBean() {	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "POJO [text=" + text + ", number=" + number + "]";
	}
}
public class App {

	public static void main(String[] args) {
		//Plan Old Java Object  POJO  No constrains
		POJO pojo=new POJO();
		System.out.println(pojo);
		
		
		//Java Bean have 3 constrains
		//1: Have Public Default (No argument) Constructors
		//2:Getter and Setter Methods
		//3:Implement java.io.Serializable - marker interface
		
		//Spring Bean
		//Any Java Object that is Managed by Spring
		//Spring Uses IOC Container (Bean Factory or Application Context) to manage these objects

	}

}
