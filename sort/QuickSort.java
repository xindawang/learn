package sort;

public class QuickSort {
	
	public static int partition(int a[], int low, int high){
		int privotKey = a[low];                             //��׼Ԫ��
		while(low < high){                                  //�ӱ�����˽�������м�ɨ��
			while(low < high  && a[high] >= privotKey) --high;  //��high ��ָλ����ǰ���������ൽlow+1 λ�á����Ȼ�׼Ԫ��С�Ľ������Ͷ�
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
			int privotLoc = partition(a,low,high);  //����һ��Ϊ��
			quickSort(a,low,privotLoc-1);          //�ݹ�Ե��ӱ�ݹ�����
			quickSort(a,privotLoc+1,high);        //�ݹ�Ը��ӱ�ݹ�����
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

