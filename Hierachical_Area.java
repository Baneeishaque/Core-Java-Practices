class Square
{
	float length=(float)5.2;
	public float calculate_square_area()
	{
		return length*length;
	}
}
class Circle extends Square
{
	public float calculate_circle_area()
	{
		return (float)3.14*length*length;
	}	
}
class Rectangle extends Square
{
	float breadth=(float)4.2;
	public float calculate_rectangle_area()
	{
		return (float)3.14*length*breadth;
	}
}
class Hierachical_Area
{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		System.out.println("Area of square is "+r.calculate_square_area());
		System.out.println("Area of circle is "+c.calculate_circle_area());
		System.out.println("Area of rectangle is "+r.calculate_rectangle_area());
	}
}
