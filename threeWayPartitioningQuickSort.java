// Modified version of QuickSort which optimizes the performance of quickSort if the array has duplicate elements.
//
// Author : Bharath Kumar Pareek
// Email  : bharathpareek@gmail.com

public class threeWayPartitioningQuickSort {
	public static void main(String[] args){
		int array[] = {-1,0,9,8,67,0,-1,45,10,-10,-1,-1,-1,01};
		sort(array);
		
		for (int m=0; m<array.length; m++){
			System.out.print(array[m] + " ");
		}
	}
	
	public static void sort(int[] array){
		sort(array, 0, array.length-1);
	}
	
	private static void sort(int array[], int lo, int hi){
		if (hi<=lo)
			return;
		int v = array[lo];
		int lt = lo, gt = hi;
		
		int i = lo;
		while(gt>=i){
			int cmp = compareTo(array[i],v);
			if (cmp < 0)
				exchg(array,i++,lt++);
			else if (cmp > 0)
				exchg(array,i,gt--);
			else
				i++;
		}
		
		sort(array,lo,lt-1);
		sort(array,gt+1,hi);
	}

	private static void exchg(int[] array, int j, int k) {
		int temp = array[j];
		array[j] = array[k];
		array[k] = temp;
		
	}

	private static int compareTo(int v, int i) {
		if (v > i)
			return 1;
		else if (v < i)
			return -1;
		else
			return 0;
	}
	
	
}
