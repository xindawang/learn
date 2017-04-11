package sort;

public class ShellSort {
	public static void main(String [] args){
		int[] inputArray ={3,6,4,9,4,12,5,4,2,1}; 
		shellsort(inputArray,inputArray.length);
		for (int z=0;z<inputArray.length;z++){
			System.out.print(inputArray[z]+" ");
		}
	}
	
	public static void shellsort(int a[], int n){  
	    int i, j, gap;  
	  
	    for (gap = n / 2; gap > 0; gap /= 2){ 
	        for (i = gap; i < n; i++){
	            for (j = i - gap; j >= 0 && a[j] > a[j + gap]; j -= gap){  
	            	int temp = a[j];
	            	a[j]=a[j + gap];
	            	a[j+gap]= temp;
//	            	swap(a[j], a[j + gap]); 
	            }
	        }
	    }
	}  
}
