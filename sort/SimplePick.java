package sort;

public class SimplePick {
	public static void main(String [] args){
		int[] inputArray ={3,6,4,9,4,12,5,4,2,1}; 
		int[] array=simplePick(inputArray);
		for (int z=0;z<array.length;z++){
			System.out.print(array[z]+" ");
		}
	}
	
	public static int[] simplePick(int array[]){	
		for (int j=0;j<array.length-1;j++){
			int min = array[j];
			int x =j;
			
			//此处 i=j，前面排序过的不用再检查
			for (int i=j;i<array.length;i++){	
				if (array[i] <= min){
					min = array[i];
					x = i;
				}
			}
			if (array[j] != min){
				int t = array[j];
				array[j] = array[x];
				array[x] = t;
			}
		}
		return array;
	}
}

