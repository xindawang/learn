package test;

public class QSPractice {
	public static void main(String [] args){
		int[] array = {3,1,5,7,2,4,9,6,10,8};
		quickSort(array,0,array.length-1);
		for(int z=0;z<array.length;z++){
			System.out.print(array[z]+" ");
		}
	}
	
	public static void quickSort(int[] a,int low,int high){
		if (low<high){
			int sentry = partition(a,low,high);
			quickSort(a,low,sentry-1);
			quickSort(a,sentry+1,high);
		}
	}

	private static int partition(int[] a, int low, int high) {
		int sentry = a[low];
		while (low<high){
			while (low<high&&a[high]>=sentry) high--;
			int t1=a[low];
			a[low] = a[high];
			a[high] = t1;
			while (low<high&&a[low]<=sentry) low++;
			int t2 = a[low];
			a[low] = a[high];
			a[high]= t2;
		}
		return low;
	}
}
