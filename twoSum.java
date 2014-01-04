/*
Given an unsorted array and a Sum Value, the program will determine all the possible pairs which sums up to the 
Sum Value.
For ex :

Input  = {1,10,6,-3,5,2}
The output will be 
{1,6}, {6,1}, {10,-3}, {-3,10}, {5,2}, {2,5}

Time Complexity : O(N log N) Where N is the size of the array

Author : Bharath Kumar Pareek
Email  : bharathpareek@gmail.com
*/

import java.util.Arrays;

public class twoSum {
	public static void main(String[] args){
		int array[] = {1,10,2,6,-3,5,0};
		int sum = 7;
		findSum(array, sum);
	}
	
	public static void findSum(int[] array, int sum){
		Arrays.sort(array);
		int x;
		int y;
		int k;
		for(int i=0; i<array.length; i++){
			x = array[i];
			y = sum - x;
			k = binarySearch(array, y);			
			if((k != i) && (k!=-1)){
				System.out.print(array[i] + " " + array [k]);
				System.out.println();
			}
		}
	}
	
	public static int binarySearch(int[] array, int y){
		int lo = 0;
		int hi = array.length-1;
		while(lo<=hi){
			int mid = lo + (hi-lo)/2;
			if(y > array[mid])
				lo = mid+1;
			else if(y < array[mid])
				hi = mid-1;
			else
				return mid;
		}
		
		return -1;
	}
}
