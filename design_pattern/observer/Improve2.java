package design_pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Improve2 {
	
	public static void main(String [] args){
		Subject boss = new Boss2();
		Subject sub2 = new Secretary2();
		
		Observer2 so1 = new StockObserver2("同志1",sub2);
		Observer2 so2 = new StockObserver2("同志2",boss);
		Observer2 so3 = new NBAObserver2("同志3",sub2);
		Observer2 so4 = new NBAObserver2("同志4",boss);
		
		sub2.attach(so1);
		boss.attach(so2);
		sub2.attach(so3);
		boss.attach(so4);
		
		boss.setAction("我回来了");
		sub2.setAction("老板回来了");
		sub2.startNotify();
		boss.startNotify();

	}
	
	
}

abstract class Subject{
	protected String action;
	protected List<Observer2> observers = new ArrayList<Observer2>();
	
	public void attach(Observer2 observer){
		observers.add(observer);
	}
	public void detach(Observer2 observer){
		observers.remove(observer);
	};
	public void startNotify(){
		for (Observer2 o : observers){
			o.update();
		}
	};
	public void setAction(String action){
		this.action = action;
	};
	
	public abstract String getAction();
}
class Boss2 extends Subject{

	public String getAction() {
		return action+"!!!";
	}
}
class Secretary2 extends Subject{
	public String getAction(){
		return action+",";
	}
}
abstract class Observer2{
	protected String name;
	protected Subject sub;
	public Observer2(String name, Subject sub){
		this.name = name;
		this.sub  = sub;
	}
	public abstract void update();
}

class StockObserver2 extends Observer2{
	public StockObserver2(String name, Subject sub) {
		super(name, sub);
	}
	
	@Override
	public void update(){
		System.out.println(sub.getAction()+name+"别看股票了");
	}
}

class NBAObserver2 extends Observer2{

	public NBAObserver2(String name, Subject sub) {
		super(name, sub);
	}

	@Override
	public void update() {
		System.out.println(sub.getAction()+name+"别看NBA了");
	}
	
}

