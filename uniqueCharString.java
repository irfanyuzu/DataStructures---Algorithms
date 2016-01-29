/*
Given a String, this program will determine if the string contains unique characters or not.

Time Complexity : O(N) 
SpaceComplexity : O(1) - constant space
where N is the length of the string. Here it is assumed that characters in a string belongs to
ASCII Character Set

Author : Bharath Kumar Pareek
Email  : bharathpareek@gmail.com
*/

public class uniqueCharString {
	public static void main(String[] args){
		String str = "HELlO";
		System.out.println(isUnique(str));
	}
	
	public static boolean isUnique(String str){
		int[] array = new int[256];
		
		for(int i=0; i<str.length(); i++){			
			if(array[str.charAt(i)] == 0)
				array[str.charAt(i)] = 1;
			else
				return false;
		}
		return true;
	}
}
