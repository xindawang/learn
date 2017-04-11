package sort;

public class QuickSort {
	
	public static int partition(int a[], int low, int high){
		int privotKey = a[low];                             //基准元素
		while(low < high){                                  //从表的两端交替地向中间扫描
			while(low < high  && a[high] >= privotKey) --high;  //从high 所指位置向前搜索，至多到low+1 位置。将比基准元素小的交换到低端
			int t1 = a[low];
			a[low] = a[high];
			a[high] = t1; 
			while(low < high  && a[low] <= privotKey ) ++low;  
			int t2 = a[low];
			a[low] = a[high];
			a[high] = t2; 
		}  
		return low;  
	}  
	
	public static void quickSort(int a[], int low, int high){  
		if(low < high){  
			int privotLoc = partition(a,low,high);  //将表一分为二
			quickSort(a,low,privotLoc-1);          //递归对低子表递归排序
			quickSort(a,privotLoc+1,high);        //递归对高子表递归排序
	    }  
	}  
	
	public static void main(String [] args){  
		int[] array = {3,1,5,7,2,4,9,6,10,8};  
	    quickSort(array,0,9);  
	    for (int z=0;z<array.length;z++){
			System.out.print(array[z]+" ");
		}
	}  
}	

