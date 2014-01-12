/* 
* Given two strings, the program will determine if the strings are anagram. 
* Space Complexity = O(N), Here N is 256 and the assumption is made that strings contains only ASCII Characters
* Time Complexity  = O(N), M is the length of the String. 
* 
* Note : The anagram check can also be done by sorting the strings and then checking if the sorted strings are equal.
* 
* Author : Bharath Kumar Pareek
* Email  : bharathpareek@gmail.com
*/

public class anagramCheck {
	public static void main(String[] args){
		String s1 = "lemon";
		String s2 = "melon";
		System.out.print(isAnagram(s1,s2));
	}
	
	public static boolean isAnagram(String s1, String s2){
		if (s1.length() != s2.length())
			return false;
		int[] array = new int[256];
		for(int i=0; i<s1.length(); i++){
			array[s1.charAt(i)]++;
		}
		
		for(int j=0; j<s2.length(); j++)
			array[s2.charAt(j)]--;
		
		for(int k=0; k<256; k++){
			if(array[k] > 0)
				return false;
		}
		
		return true;
			
	}
}
