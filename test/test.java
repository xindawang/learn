package test;

public class test {
	
	public static int aaa;
	public static int bbb;
	public int aa;
	public int bb;
	public test(int a,int b){
		aa = a;
		bb = b;
	}
	
	public void swap2(){
		int t = aa;
		aa = bb;
		bb = t;
	}
	
	public static void main(String [] args){
		int a =1;
		int b =2;
		swap(a,b);	
		
		test t = new test(a, b);
		t.swap2();
		
		aaa = 1;
		bbb = 2;
		swap3();
		
		System.out.print(a);
		System.out.println(b);
		System.out.print(t.aa);
		System.out.println(t.bb);
		System.out.print(aaa);
		System.out.println(bbb);
	}
	public static void swap(int a, int b){
		int t = a;
		a = b;
		b = t;
	} 
	public static void swap3(){
		int t = aaa;
		aaa = bbb;
		bbb = t;
	} 
}

