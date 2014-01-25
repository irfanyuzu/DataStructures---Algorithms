/*
* Given a character array, the program will determine the first non-repeated Character
*
* Ex : Input = "aabbccaassddwfff"
*      Output= "w"
*
* Space Complexity = O(1)
* Time Complexity  = O(N Log N), where N is the size of the array
*
* The problem can be solved in linear time, if extra space is allowed (HashMap or ASCII array).
*
* Author : Bharath Kumar Pareek
* Email  : bharathpareek@gmail.com
*/

import java.util.Arrays;

public class firstNonRepeatedChar {
	public static void main(String[] args){
		String s = "aaabbccddeaaaf";
		char[] array = s.toCharArray();
		find(array);
	}
	
	public static void find(char[] array){		
		Arrays.sort(array);
		int count=0;
		for(int i=1; i<array.length; i++){
			if(array[i-1] == array[i]){
				count++;
			}
			else if(array[i-1] != array[i]){
				if(i == array.length-1){
						System.out.print(array[i]);
				}
				else{
					if(count == 1)
						System.out.print(array[i-1]);
					else
						count = 1;
				}				
			}
		}
	}
}
