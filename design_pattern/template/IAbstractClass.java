package design_pattern.template;

public interface IAbstractClass {

	public abstract void PrimitiveOperation1();
	public abstract void PrimitiveOperation2();
	
	public default void TemplateMethod(){
		PrimitiveOperation1();
		PrimitiveOperation2();
	}
	
	public static void main(String [] args){
		IAbstractClass c;
		c = new IConcreteClassA();
		c.TemplateMethod();
		
		c = new IConcreteClassB();
		c.TemplateMethod();
	}
}

class IConcreteClassA implements IAbstractClass{
	public void PrimitiveOperation1(){
		System.out.println("A��1����ʵ��");
	}
	
	public void PrimitiveOperation2(){
		System.out.println("A��2����ʵ��");
	}
}

class IConcreteClassB implements IAbstractClass{
	public void PrimitiveOperation1(){
		System.out.println("B��1����ʵ��");
	}
	
	public void PrimitiveOperation2(){
		System.out.println("B��2����ʵ��");
	}
}