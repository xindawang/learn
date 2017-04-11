package test;

class A {
	{
		System.out.println("1");
	}
	
	static{
		System.out.println("3");
	}
	
	public A() {
		System.out.println("2");
	}
}

class B extends A{
	{
		System.out.println("a");
	}
	
	public B() {
		System.out.println("b");
	}
}

public class Hello {
	public static void main(String[] args){
		A ab = new B();
		A b = new B();
	}
}
