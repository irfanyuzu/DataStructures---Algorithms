/*
* Given a character array containing integers from 0-9 as the characters, the program will sort the array.
*
* Time Complexity = O(N)
* Space Complexity = O(N), where N is the size of the array
*
* Author : Bharath Kumar Pareek
* Email  : bharathpareek@gmail.com
*/

public class personalSort {
	public static void main(String[] args){
		int[] array = {'0','0','1','1','5','6','7','8','8','8','3','3','2','2','1'};
		sort(array);
	}
	
	public static void sort(int[] array){
		int[] ascii = new int[10];
		for(int i=0; i<array.length; i++){
			int x =  array[i] - '0';			
			ascii[x]++;
		}
		int m = 0;
		for(int j=0; j<ascii.length; j++){
			int value = ascii[j];
			for(int k=0; k<value; k++)
				array[m++] = j;
		}
		
		for(int l=0; l<array.length; l++)
			System.out.print(array[l]+ " ");		
		
	}	
}
