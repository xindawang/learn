package test;

public class Test51_exception {
	
	public static void main(String [] args){
		try{
			try{
				throw new ExampleB();
			}catch(ExampleA e){
				System.out.println("a");
				throw e;
			}		
		}		
		catch (ExampleB e){
			System.out.println("Exc");
			return;
		}
		finally{
			System.out.println("asdfg");
		}
	}
}

class ExampleB extends ExampleA{
	
}

class ExampleA extends Exception{
	
}