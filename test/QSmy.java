package test;

public class QSmy {

	
	public static void main(String [] args){
//		int[] inputArray ={3,6,4,9,4,12,5,4,2,1}; 
//		int[] inputArray ={3,6,4,5,7,9}; 
//		int[] inputArray ={49,38,65,97,76,13,27,49};
		int[] inputArray ={8,6,4,9,4,12,5};
		quickSort(inputArray,0,inputArray.length);
		for (int z=0;z<inputArray.length;z++){
			System.out.print(inputArray[z]+" ");
		}
	}
	
	public static int findLower(int flag,int l,int[] a){
		int nextLowerNumber = -1;
		for (int j=l-1;j>0;j--){
			if (a[j]<flag){
				nextLowerNumber = j;
				break;
			}			
		}
		return nextLowerNumber;
	}
	
	public static int findHigher(int flag,int h,int[] a){
		int nextHigherNumber = -1;
		for (int i=h+1;i<a.length;i++){
			if (a[i]>flag){
				nextHigherNumber = i;
				break;
			}			
		}
		return nextHigherNumber;
	}
	
	public static void quickSort(int a[],int h,int l){	
		int flag = a[0];
		//findLower方法每次先 -1，因此初始值是a.length而不是a.length-1
		//同理，findHigher每次先 +1，从下一项开始，因此初始值是-1，而不是0
		h--;	//h即为findHigher参数
		
		int ll = findLower(flag,l,a);
		int hh = findHigher(flag,h,a);
		
		a[0] = a[ll];
	
		a[ll] = a[hh];
		while (ll>hh){			
			
			ll = findLower(flag,ll,a);
			if(ll==-1||ll<=hh){
				a[hh] =flag;
//						return a;
			}
			else{
				a[hh] =a[ll];
			}
			
			hh = findHigher(flag,hh,a);	
			if (hh==-1||ll<=hh){
				a[ll] =flag;
//						return a;
			}
			else{
				a[ll] =a[hh];
			}
		}	
	}
	
	public static void recursion(){
		
	}
}
