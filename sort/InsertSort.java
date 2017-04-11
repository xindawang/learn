package sort;

public class InsertSort {
	public static void main(String [] args){
		int[] inputArray ={3,6,4,9,4,12,5,4,2,1}; 
//		int[] inputArray ={3,6,4,5,7,9}; 
//		int[] inputArray ={3,6,4,4};
		int[] array=insertSort(inputArray);
		for (int z=0;z<array.length;z++){
			System.out.print(array[z]+" ");
		}
	}
	
	public static int[] insertSort(int array[]){	
		for (int i=1;i<array.length;i++){
			int j = i;
			int sentry = array[j];	
			if(sentry <= array[j-1]){
				
				//i换成j	的条件，防止大循环无限循环
				//j>0	的条件，因为判断了j-1是在j--之后，否则会数组溢出
				//<=	的条件，可处理含有相同元素的问题
				while(j>0&&sentry <= array[j-1]){				
					array[j] = array[j-1];
					j--;
				}
				array[j] =sentry;
			}
		}
		return array;
	}
}