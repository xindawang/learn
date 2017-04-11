package test;
import java.util.Scanner;

public class myJC {

	
	static int arrayCount;
	static int flag=0;
	
	public static void main(String [] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[]=new int[n];
		arrayCount = n;
		for (int i=0; i<n; i++){
			a[i] = i+1;
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int re[] = remainNumber(a);
		while (arrayCount>1){
			re = remainNumber(re);
		}
		System.out.println(re[0]);
	}
	
	public static int[] remainNumber(int arr[]){
		int remain[] = new int[arrayCount];
		int currentCount = arrayCount;
		int currentFlag = flag;
		int remainCount = 0;
		currentFlag++;
		int k=0;
		for (int j=0;j<currentCount;j++){
			if (j==currentCount-1){
				flag=currentFlag%3;
			}
			
			if (currentFlag%3==0){
				arrayCount--;
				currentFlag++;
			}else{
				remain[k]=arr[j];
				k++;
				currentFlag++;
				remainCount++;
			}
		}
		int realRemain[] = new int[remainCount];
		for (int z=0;z<remainCount;z++){
			realRemain[z]=remain[z];
		}
		return realRemain;
	}	
}
