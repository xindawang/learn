package design_pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Improve1 {
	public static void main(String [] args){
		Secretary1 tongzhizhe = new Secretary1();
		Observer1 so = new StockObserver1("同志A",tongzhizhe);
		Observer1 no = new NBAObserver1("同志B",tongzhizhe);
		
		tongzhizhe.attach(so);
		tongzhizhe.attach(no);
		
		tongzhizhe.setAction("老板来了！");
		tongzhizhe.startNotify();
	}
}

class Secretary1{
	private List <Observer1> observers = new ArrayList<Observer1>();
	private String action;
	
	public void attach(Observer1 name){
		observers.add(name);
	}
	
	public void detach(Observer1 name){
		observers.remove(name);
	}
	
	public void startNotify(){
		for (Observer1 o : observers){
			o.update();
		}
	}
	
	public void setAction(String action){
		this.action = action;
	}
	
	public String getAction(){
		return action;
	}
}

abstract class Observer1{
	protected String name;
	protected Secretary1 sub;
	public Observer1(String name, Secretary1 sub){
		this.name = name;
		this.sub  = sub;
	}
	public abstract void update();
}

class StockObserver1 extends Observer1{
	public StockObserver1(String name, Secretary1 sub) {
		super(name, sub);
	}
	
	@Override
	public void update(){
		System.out.println(sub.getAction()+name+"别看股票了");
	}
}

class NBAObserver1 extends Observer1{

	public NBAObserver1(String name, Secretary1 sub) {
		super(name, sub);
	}

	@Override
	public void update() {
		System.out.println(sub.getAction()+name+"别看NBA了");
	}
	
}