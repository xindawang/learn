package design_pattern;

public class Proxy {
	public static void main(String [] args){
		SchoolGirl mm = new SchoolGirl();
		mm.setName("ã…ã…");
		ProxyPerson daili = new ProxyPerson(mm);
		daili.GiveDolls();
		daili.GiveFlowers();
	}
}

interface IGiveGift{
	void GiveDolls();
	void GiveFlowers();
}

class Pursuit implements IGiveGift{
	SchoolGirl mm ;
	public Pursuit(SchoolGirl mm){
		this.mm = mm;
	}
	
	public void GiveDolls(){
		System.out.println(mm.getName()+"ÀÕƒ„ÕﬁÕﬁ");
	}
	
	public void GiveFlowers(){
		System.out.println(mm.getName()+"ÀÕƒ„ª®");
	}
}

class ProxyPerson implements IGiveGift{
	Pursuit gg;
	public ProxyPerson(SchoolGirl mm){
		gg = new Pursuit(mm);
	}
	@Override
	public void GiveDolls() {
		gg.GiveDolls();
	}
	@Override
	public void GiveFlowers() {
		gg.GiveFlowers();
	}
}

class SchoolGirl{
	private String name;
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}