package test;

public class HeapSort {
	public static void main(String [] args){
		int[] inputArray ={3,6,4,9,4,12,5,4,2,1}; 
		heapSort(inputArray);
		for (int z=0;z<inputArray.length;z++){
			System.out.print(inputArray[z]+" ");
		}
	}

	private static void heapSort(int[] inputArray) {
		buildHeap();
		adjustHeap();
	}

	private static void buildHeap() {
		// TODO Auto-generated method stub
		
	}

	private static void adjustHeap() {
		// TODO Auto-generated method stub
		
	}
}
