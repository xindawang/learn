package design_pattern;

public class Adapter {
	public static void main(String [] args){
		Target t = new Adapt();
		t.request();
	}
}

class Target{
	public void request(){
		System.out.println("��ͨ����");
	}
}

class Adaptee{
	public void specificRequest(){
		System.out.println("��������");
	}
}

class Adapt extends Target{
	private Adaptee ad= new Adaptee();
	public void request(){
		ad.specificRequest();
	}
}