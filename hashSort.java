/*
* Given an integer array, the program will sort the array. This sort performs better than Merge sort 
* when the elements in the array are not sparse.
*
* Time Complexity = O(max-min), Where max is the largest element and min is the smallest element in the array 
* Space Complexity = O(N), where N is the size of the array
*
* Author : Bharath Kumar Pareek
* Email  : bharathpareek@gmail.com
*/

import java.util.HashMap;

public class hashSort {
	public static void main(String[] args){
		int[] array = {1,4,2,13,1,7,5,99,0,-1};
		sort(array);
	}
	
	public static void sort(int[] array){
		int min = array[0];
		int max = array[0];
		
		for(int i=1; i<array.length; i++){
			if(array[i] < min)
				min = array[i];
			if(array[i] > max)
				max = array[i];
		}
		
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		
		for(int i = 0; i<array.length; i++){
			Integer count = map.get(array[i]);
			if(count == null)
				count = new Integer(1);
			else
				count = count + 1;
			map.put(array[i], count);
		}
		
		int k=0;		
		
		for(int j = min; j<= max; j++){
			Integer count = map.get(j);
			if(count!=null){
				for(int m=0; m<count; m++){
					array[k++] = j;
				}
			}
		}
		
		for(int i = 0; i<array.length; i++)
			System.out.print(array[i] + " ");
		
	}
}
