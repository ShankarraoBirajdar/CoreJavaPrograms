package Inheritance_program;import java.io.*;
import java.util.Scanner;
class Dimension
{
	int side,radius;
	void setSide(int side)
	{
		this.side=side;
	}
	void setRadius(int radius)
	{
		this.radius=radius;
	}
}
class square extends Dimension
{
	void Area()
	{
		System.out.println("Area of square="+side*side);
	}
}
class circle extends Dimension
{
	void Area()
	{
		System.out.println("Area of circle="+3.14f*radius*radius);
	}
}
public class HeirarchicalInheristance {
public static void main(String ares[])
{
	square s=new square();
	circle c=new circle();
	s.setSide(10);
	s.Area();
	c.setRadius(10);
	c.Area();
}
}