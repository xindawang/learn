package design_pattern;

public class Adapter {
	public static void main(String [] args){
		Target t = new Adapt();
		t.request();
	}
}

class Target{
	public void request(){
		System.out.println("普通请求");
	}
}

class Adaptee{
	public void specificRequest(){
		System.out.println("特殊请求");
	}
}

class Adapt extends Target{
	private Adaptee ad= new Adaptee();
	public void request(){
		ad.specificRequest();
	}
}