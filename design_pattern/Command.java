package design_pattern;

import java.util.ArrayList;
import java.util.List;

public class Command {
	public static void main(String [] args){
		Barbecuer bb = new Barbecuer();
		Waiter girl = new Waiter();
		BakeChicken bc = new BakeChicken(bb);
		BakeMutton bm = new BakeMutton(bb);
		
		girl.setOrder(bc);
		girl.setOrder(bc);
		girl.setOrder(bc);
		girl.setOrder(bc);
		girl.setOrder(bm);
		
		girl.deleteOrder(bc);
		girl.deleteOrder(bc);
		
		girl.startNotify();
	}
}

class Barbecuer{
	public void bakeChicken(){
		System.out.println("Bake Chicken");
	}
	public void bakeMutton(){
		System.out.println("Bake mutton");
	}
}

class Waiter{
	List<Commander> commandList = new ArrayList<Commander>();
	public void setOrder(Commander cm){
		commandList.add(cm);
	}
	
	public void deleteOrder(Commander cm){
		commandList.remove(cm);
	}
	public void startNotify(){
		for (Commander cm:commandList){
			cm.bake();
		}
	}
}

abstract class Commander{
	protected Barbecuer bb;
	public Commander(Barbecuer bb){
		this.bb = bb;
	}
	public abstract void bake();
}

class BakeChicken extends Commander{
	public BakeChicken(Barbecuer bb) {
		super(bb);
	}

	public void bake(){
		bb.bakeChicken();
	}

}

class BakeMutton extends Commander{
	public BakeMutton(Barbecuer bb) {
		super(bb);
	}

	public void bake(){
		bb.bakeMutton();
	}
}