// Given a String, the program verifies if the string is a Palindrome or not. 
// Space Complexity = O(1)
// Time Complexity = O(N) where N is the length of the string.
//
// Author : Bharath Kumar Pareek
// Email :  bharathpareek@gmail.com

public class Palindrome {
	public static void main(String[] args){
		String a = "RacaR";
		System.out.print(isPalindrome(a));
	}
	
	private static boolean isPalindrome(String str){
		int len = str.length();
		for(int i=0; i<len/2; i++){
			if(str.charAt(i) != str.charAt(len-1-i))		
			return false;
		}
		return true;
	}
}
