package sort;

public class BubbleSort {
	public static void main(String [] args){
		int[] inputArray ={3,6,4,9,4,12,5,4,2,1}; 
		bubbleSort(inputArray);
		for (int z=0;z<inputArray.length;z++){
			System.out.print(inputArray[z]+" ");
		}
	}
	
	public static void bubbleSort(int array[]){	
		for (int j=0;j<array.length-1;j++){
			
			//�˴�i<array.length-1-j������������Ĳ����ټ��
			for (int i=0;i<array.length-1-j;i++){
				if (array[i]>array[i+1]){
					int t =array[i];
					array[i] = array[i+1];
					array[i+1] = t;
				}
			}
		}
	}
}
