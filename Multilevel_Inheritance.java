class A
{
	public void methodA()
	{
		System.out.println("From Class A");
	}
}

class B extends A
{
	public void methodB()
	{
		System.out.println("From Class B");
	}
}

class Multilevel_Inheritance extends B
{
	public void method_Multilevel_Inheritance()
	{
		System.out.println("From Class Mulitlevel Inheritance");
	}
	
	public static void main(String args[])
	{
		Multilevel_Inheritance obj=new Multilevel_Inheritance();
		obj.methodA();
		obj.methodB();
		obj.method_Multilevel_Inheritance();
	}
}
