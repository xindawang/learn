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
				
				//i����j	����������ֹ��ѭ������ѭ��
				//j>0	����������Ϊ�ж���j-1����j--֮�󣬷�����������
				//<=	���������ɴ�������ͬԪ�ص�����
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