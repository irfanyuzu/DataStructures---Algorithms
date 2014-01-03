/*
Given a String, this program will replace all the spaces with %20.

Time Complexity : O(N+M)
Space Complexity : O(N+M), where N is the length of the String, and M is 2*Number of Spaces

Author : Bharath Kumar Pareek
Email  : bharathpareek@gmail.com
*/

public class replaceSpace {
	public static void main(String[] args){
		String str = "Bharath Kumar Pareek";
		System.out.print(replace(str));
	}
	
	public static String replace(String str){
		if(str == "")
			return null;
		int count = 0;
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == ' ')
				count++;
		}
		int j=0;		
		char[] array = new char[(2*count)+str.length()];
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) != ' ')
				array[j++] = str.charAt(i);
			else {
				array[j] = '%';
				array[j+1] = '2';
				array[j+2] = '0';
				j = j+3;
			}
		}
		return String.valueOf(array);
	}
}
