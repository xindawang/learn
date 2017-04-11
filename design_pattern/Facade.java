package design_pattern;

public class Facade {
	public static void main(String [] args){
		MethodsCollection mc = new MethodsCollection();
		mc.methodA();
		mc.methodB();
	}
}

class SubSystem1{
	public void method1(){
		System.out.println("1");
	}
}
class SubSystem2{
	public void method2(){
		System.out.println("2");
	}
}
class SubSystem3{
	public void method3(){
		System.out.println("3");
	}
}

class MethodsCollection{
	SubSystem1 ss1;
	SubSystem2 ss2;
	SubSystem3 ss3;
	public MethodsCollection(){
		ss1 = new SubSystem1();
		ss2 = new SubSystem2();
		ss3 = new SubSystem3();
	}
	
	public void methodA(){
		ss1.method1();
		ss2.method2();
	}
	public void methodB(){
		ss2.method2();
		ss3.method3();
	}
}