package design_pattern;

public class Mediator {
	public static void main(String [] args){
		ConcreteMediator cm = new ConcreteMediator();
		Collegue1 c1 = new Collegue1(cm);
		Collegue2 c2 = new Collegue2(cm);
		
		cm.setCollegue1(c1);
		cm.setCollegue2(c2);
		c1.speak("c2 hear me?");
		c2.speak("c1 hear me?");
	}
}

abstract class absMediator{
	protected Collegue1 c1;
	protected Collegue2 c2;
	public abstract void sendMessage(String s, Collegue c);
}

class ConcreteMediator extends absMediator{
	public void setCollegue1(Collegue1 c1){
		this.c1 =c1;
	}
	
	public void setCollegue2(Collegue2 c2){
		this.c2 =c2;
	}
	
	public void sendMessage(String s, Collegue c){
		if(c.equals(c1)){
			c2.hear(s);
		}
		else c1.hear(s);
	}
}

abstract class Collegue{
	protected ConcreteMediator cm;
	public Collegue(ConcreteMediator cm){
		this.cm = cm;
	}
	
	public void speak(String s){
		cm.sendMessage(s, this);
	}
	public abstract void hear(String s);
}

class Collegue1 extends Collegue{
	public Collegue1(ConcreteMediator cm) {
		super(cm);
	}

	public void hear(String s){
		System.out.println("c1 copy"+"	"+s);
	}
}

class Collegue2 extends Collegue{
	public Collegue2(ConcreteMediator cm) {
		super(cm);
	}

	public void hear(String s){
		System.out.println("c2 copy"+"	"+s);
	}
}