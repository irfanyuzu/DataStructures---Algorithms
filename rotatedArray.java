/*
* For a given rotated sorted array of integers, the program will determine the index of the smallest integer in the arrat
* 
* Time Complexity = O(log N)
*
* Ex :
* Input : 2,3,4,5,6,1
* Output: 5
*
* Author : Bharath Kumar Pareek
* Email  : bharathpareek@gmail.com
*/

public class rotatedArray {
	public static void main(String[] args) throws Exception{
		int[] array = {4,1,2,3};
		findIndex(array);
	}
	public static void findIndex(int[] array) throws Exception{
		int lo = 0;		
		int hi = array.length-1;		
		int mid = lo + (hi - lo)/2;
		if(array[lo] < array[hi])
			throw new Exception("Array is not rotated");
		while(lo<mid){		    
			if(array[mid] > array[lo]){
				lo = mid;
				mid = lo + (hi - lo)/2;
			}
			else {
				hi = mid;
				mid = lo + (hi - lo)/2;
			}
			
		}
		System.out.print(hi);
		
	}
}
