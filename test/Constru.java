package test;

public class Constru {
	private String name;
	private String address;
	public Constru(){
		this.setName(name);
		this.setAddress(address);
	}
	
	public void showName(){
		System.out.println(getName());
	}
	
	public void showAddress(){
		System.out.println(getAddress());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
