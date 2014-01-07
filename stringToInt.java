// Given a String containing numbers, the program will return the integer value.
// Ex : Str = "10"
// Output int = 10
//
// Author : Bharath Kumar Pareek
// Email  : bharathpareek@gmail.com

public class stringToInt {
	public static void main(String[] args){
		String s = "100";
		convert(s);
	}
	
	public static void convert(String s){
		int result = 0;
		for(int i=0; i<s.length(); i++){
			result = result * 10;
			result = result + (s.charAt(i)-'0');
		}
		
		System.out.print(result);
	}
}
