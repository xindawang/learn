package design_pattern;

public class Decorator {
	public static void main(String [] args){
		Person p = new Person("Ð¡²Ë");
		TShirts ts = new TShirts();
		Trousers tr = new Trousers();
		
		ts.Decorate(p);
		tr.Decorate(ts);
		tr.show();
	}
}

class Person{
	public Person(){};
	private String name;
	public Person(String name){
		this.name = name;
	}
	
	public void show(){
		System.out.println("×°°çÕß:"+name);
	}
}

class Finery extends Person{
	private Person person;
	public void Decorate(Person person){
		this.person = person;
	}
	
	public void show(){
		if(person!=null){
			person.show();
		}
	}
}

class TShirts extends Finery{
	public void show(){
		System.out.println("TShirts");
		super.show();
	}
}

class Trousers extends Finery{
	public void show(){
		System.out.println("Trousers");
		super.show();
	}
}