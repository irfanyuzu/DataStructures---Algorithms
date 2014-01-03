/*
Given a non empty array, the program will determine the top two smallest integers.
Complexity = O(N) : Where N is the length of the array

Author : Bharath Kumar Pareek
Email  : bharathpareek@gmail.com
*/
public class findTopTwoSmallestInt {
	public static void main(String[] args){
		int array[] = {10,0,-1,1,5,6};
		smallInt(array);
	}
	
	public static void smallInt(int[] array){
		int small1, small2;
		if(array[0] < array[1]){
			small1 = array[0];
			small2 = array[1];
		}
		else{
			small2 = array[0];
			small1 = array[1];
		}
		
		for(int i=2; i<array.length; i++){
			if(array[i]<small2){
				small2=array[i];
				if(small2 < small1){
					int temp = small1;
					small1 = small2;
					small2 = temp;
				}
			}
		}
		
		System.out.print(small1 + " " + small2);
	}
}
