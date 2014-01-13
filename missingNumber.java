// For a given array of integers in increasing order with one number missing from the array, the program
// will determing the missing number
//
// Time Complexity = O(log N), where N is the size of the array;
// For ex : 
// Input : 2,3,4,5,6,7,9
// Output: 8
//
// Author : Bharath Kumar Pareek
// Email  : bharathpareek@gmail.com


public class missingNumber {
	public static void main(String[] args){
		int[] array = {1,2,3,4,5,6,7,9};
		System.out.print(findMissingInt(array, 0, array.length-1));
	}
	
	public static int findMissingInt(int[] array, int lo, int hi){		
		int mid = lo + (hi - lo)/2;
		int offset = array[0];
		while(lo<=hi){
			if(array[mid] == mid+offset){
				lo = mid+1;
				mid = lo + (hi-lo)/2;
			}
			else if (array[mid] > mid){
				hi = mid-1;
				mid = lo + (hi-lo)/2;
			}			
		}
		return mid+offset;
	}
}
