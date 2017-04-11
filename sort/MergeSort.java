package sort;

public class MergeSort {
	public static void main(String [] args){
		int[] inputArray ={3,6,4,9,4,12,5,4,2,1};
		int last = inputArray.length-1;
		int[] temp = new int[last+1];
		mergeSort(inputArray,0,last,temp);
		for (int z=0;z<inputArray.length;z++){
			System.out.print(inputArray[z]+" ");
		}
	}
	
	public static void mergeSort(int[] a,int first,int last, int[] temp){
		if (first<last){
			int mid = (first+last)/2;
			mergeSort(a,first,mid,temp);
			mergeSort(a,mid+1,last,temp);
			merge(a,temp,first,last,mid);
		}
	}
	
	public static void merge(int[] a,int[] temp,int low,int high,int mid){
		int i = low;
		int j = mid +1;
		int k = low;
		
		while(i<=mid&&j<=high){
			if (a[i]<=a[j]){
				temp[k++] = a[i++];
			}
			else{
				temp[k++] = a[j++];
			}
		}
		while (i<=mid){
			temp[k++] = a[i++];
		}
		while (j<=high){
			temp[k++] = a[j++];
		}
		for(int z=low;z<=high;z++){
			a[z] = temp[z];
		}
	}
}
