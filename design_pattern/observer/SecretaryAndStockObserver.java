package design_pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class SecretaryAndStockObserver {
	
	public static void main(String [] args){
		Secretary tongzizhe = new Secretary();
		StockObserver tongzhi1 = new StockObserver("同志1",tongzizhe);
		StockObserver tongzhi2 = new StockObserver("同志1",tongzizhe);
		
		tongzizhe.attach(tongzhi1);
		tongzizhe.attach(tongzhi2);
		
		tongzizhe.setSecretaryAction("老板回来了！");
		tongzizhe.startNotify();
	}	
}


class StockObserver{
	private String name;
	private Secretary sub;
	public StockObserver(String name, Secretary sub){
		this.name = name;
		this.sub = sub;
	}
	
	public void update(){
		System.out.println(sub.getSecretaryAction() + name +"关闭股票");
	}
}

class Secretary{
	private List<StockObserver> observers = new ArrayList<StockObserver>();
	private String action;
	
	public void attach(StockObserver Observer){
		observers.add(Observer);
	}
	
	public void startNotify(){
		for (StockObserver o : observers){
			o.update();
		}
	}
	
	public String getSecretaryAction(){
		return this.action;
	}
	
	public void setSecretaryAction(String value){
		this.action = value;
	}
}