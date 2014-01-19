/*
* Given a string S1 and S2, the program will print the position in S1 where S2 is found. 
* 
* Time complexity = O(N), where N is the length of the String S1
* Space Complexity= O(1)
*
* Author : Bharath Kumar Pareek
* Email  : bharathpareek@gmail.com
*/

public class findString {
	public static void main(String[] args) throws Exception{
		String s = "Hello Brother Hello";
		String f = "Bro";
		find(s,f);
	}
	public static void find(String s, String f) throws Exception{
		int j=0;
		int k=0;
		int count = 0;
		if(f == "")
			throw new Exception("Find String is Empty");
		if(f.length() > s.length())
			throw new Exception("Find String is bigger than the given string");
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i) == f.charAt(j++)){
				if(j==f.length()){	
					System.out.println(i-f.length()+1);
					j = 0;
					count++;
				}				
			}
			else{
				j=0;
			}
		}
		 if(count == 0)
			 System.out.print("String not found");
	}
}
