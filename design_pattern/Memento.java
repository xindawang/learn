package design_pattern;

public class Memento {
	public static void main(String [] args){
		Originator origin = new Originator();
		origin.setState("on");
		origin.show();
		
		CareTaker c = new CareTaker();
		c.setMemento1(origin.saveState());
		
		origin.setState("off");
		origin.show();
		c.setMemento2(origin.saveState());
		
		origin.getInit(c.getMemento1());
		origin.show();
		
		origin.getInit(c.getMemento2());
		origin.show();
	}
}

class Originator{
	private String state;
	
	public void setState(String state){
		this.state = state;
	}
	
	public String getState(){
		return state;
	}
	
	public void show(){
		System.out.println(state);
	}
	
	public Mementoo saveState(){
		return new Mementoo(state);
	}
	
	public void getInit(Mementoo m){
		state = m.getState();
	}
}

class Mementoo{
	private String state;
	public Mementoo(String state){
		this.state = state;
	}
	
	public String getState(){
		return state;
	}
}

//´æ´¢¶à·Ý´æµµ
class CareTaker{
	private Mementoo m1;
	private Mementoo m2;
	public Mementoo getMemento1(){
		return m1;
	}
	public void setMemento1(Mementoo m1){
		this.m1 = m1;
	}
	public Mementoo getMemento2(){
		return m2;
	}
	public void setMemento2(Mementoo m2){
		this.m2 = m2;
	}
}