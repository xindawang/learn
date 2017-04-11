package test;

import java.util.Scanner;

public class OneZero {
	
	static int num_a = 0;
	static int num_b = 0;
	
	public static void main(String [] args){
//		Scanner scanner = new Scanner(System.in);
//		int a = scanner.nextInt();
		int origin_a = 3;
		int origin_b = 4;
		int k = 2;
		int arr[] = init(origin_a,origin_b,k);
		for (int i =0; i<origin_a+origin_b;i++){
			System.out.print(arr[i]);
		}
		num_a = origin_a;
		num_b = origin_b;
		while(num_b>0){
//			reverse(origin_a,origin_b,k);
		}
	}

	private static int[] init(int a, int b, int k) {
		int arr[] = new int[a+b];
		if (a!=0){
			for (int i =0; i<a;i++){
				arr[i] = 1;
			}
		}
		
		if (b!=0){
			for (int j =0; j<a;j++){
				arr[j+a] = 0;
			}
		}
		return arr;
	}
}
