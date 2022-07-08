package Inheritance_program;
class Shape1
{
	float radius;
	void setRadius(int r)
	{
		radius = r;
		System.out.println("this is base class:: ");
	}
}
class  Circle1 extends Shape1
{
	int height;
	void SetHeight(int h)
	{
		height =h ;
	}
}
class Cylinder1 extends Circle1
{
	float circleArea()
	{
		return (float) (radius*radius*3.14);
	}
	float cylinderArea()
	{
		return (float) (2*3.14*radius*height);
	}
}
public class MultilevelInheritanceDemo {
	public static void main(String[] args) {
		Cylinder1 c= new Cylinder1();
		c.setRadius(10);
		c.SetHeight(20);
		float circle = c.circleArea();
		System.out.println("area of circle ::"+ circle);
		float Cylinder = c.cylinderArea();
		System.out.println("area of circle ::"+ Cylinder);
	}
}