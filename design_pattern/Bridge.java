package design_pattern;

public class Bridge {
	public static void main(String [] args){
		Brand b;
		
		b = new BrandA();
		b.run(new FunctionA());
		
		b = new BrandB();
		b.run(new FunctionB());
	}
}

abstract class Brand{
	public abstract void run(Function a);
}

class BrandA extends Brand{
	public void run(Function a){
		System.out.println("BA");
		a.run();
	}
}

class BrandB extends Brand{
	public void run(Function a){
		System.out.println("BB");
		a.run();
	}
}

abstract class Function{
	public abstract void run();
}

class FunctionA extends Function{
	public void run(){
		System.out.println("fa");
	}
}

class FunctionB extends Function{
	public void run(){
		System.out.println("fb");
	}
}