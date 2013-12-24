// Reversing a given String
//
// Author : Bharath Kumar Pareek
// Email  : bharathpareek@gmail.com

public class reverseString {
	public static void main(String[] args){
		String str = "Hello";
		reverse(str);
	}
	
	private static void reverse(String s){
		char[] str = s.toCharArray();
		int len = str.length;
		for(int i=0; i<len/2; i++){
			exch(str,i,len-1-i);
		}
		
		System.out.println(String.valueOf(str));
	}
	
	private static void exch(char[] str,int i, int j){
		char temp = str[j];
		str[j] = str[i];
		str[i] = temp;
	}
}
