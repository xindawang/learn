package test;

public class OneOrZero {
	
	public static void main(String [] args){
//		Scanner scanner = new Scanner(System.in);
//		int a = scanner.nextInt();
		int a = 3;
		int b = 4;
		int k = 2;
		int c = oneZeroReverse(a,b,k);
		System.out.println(c);
	}
	private static int oneZeroReverse(int a, int b, int k) {
		int count = 0;
		int k_remain = (a+b)%k;
		while(b!=k){
			if (b>k){
				a=a+k;
				b=b-k;
				count++;
			}
			a=a-k+2*b;
			b=k-b;
			count++;	
			if(b==k_remain){
				a=a-k_remain+(k-k_remain);
				b=b+k_remain-(k-k_remain);
			}
		}
		count++;
		return count;
	}
}
