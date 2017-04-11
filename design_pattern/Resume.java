package design_pattern;


//原形模式		克隆对象
public class Resume implements Cloneable{
	private String name;
	private String sex;
	private String age;
	private String timeArea;
	private String company;
	
	public Resume(String name){
		this.name = name;
	}
	
	public void SetPersonalInfo(String sex, String age){
		this.sex = sex;
		this.age = age;
	}
	
	public void SetWorkExperience(String timeArea, String company){
		this.timeArea = timeArea;
		this.company = company;
	}
	
	public void Display(){
		System.out.println(name+sex+age);
		System.out.println("工作经历：" +timeArea+company);
	}
	
//	public Object Clone(){
//		return (Object)this.Clone();
//	}
	
	public static void main(String [] args){
		Resume a = new Resume("大鸟");
		a.SetPersonalInfo("男", "29");
		a.SetWorkExperience("1998-2000", "XX公司");
		
		Resume b = null ;
		Resume c = null;
		try {
			b = (Resume)a.clone();
			b.SetWorkExperience("1996-1998", "公司");
			
			c = (Resume)a.clone();
			c.SetPersonalInfo("male", "45");
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		a.Display();
		b.Display();
		c.Display();
	}
	
}
