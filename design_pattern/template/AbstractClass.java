package design_pattern.template;

public abstract class AbstractClass {
	public abstract void PrimitiveOperation1();
	public abstract void PrimitiveOperation2();
	
	public void TemplateMethod(){
		PrimitiveOperation1();
		PrimitiveOperation2();
	}
	
	public static void main(String [] args){
		AbstractClass c;
		c = new ConcreteClassA();
		c.TemplateMethod();
		
		c = new ConcreteClassB();
		c.TemplateMethod();
	}
}

class ConcreteClassA extends AbstractClass{
	public void PrimitiveOperation1(){
		System.out.println("A��1����ʵ��");
	}
	
	public void PrimitiveOperation2(){
		System.out.println("A��2����ʵ��");
	}
}

class ConcreteClassB extends AbstractClass{
	public void PrimitiveOperation1(){
		System.out.println("B��1����ʵ��");
	}
	
	public void PrimitiveOperation2(){
		System.out.println("B��2����ʵ��");
	}
}