/*
Given a String, the program will return true if the string has all the roman characters, else will return false

Space Complexity = O(M)
Time Complexity = O(N), Where N is the size of the string and M is 26 (all lower case alphabets)

Author : Bharath Kumar Pareek
Email  : bharathpareek@gmail.com
*/

public class hasEveryChar {
	public static void main(String[] args){		
		String str = "The Quick Brown Fox Jumps Over The Lazy Dog";
		System.out.print(hasEveryLetter(str));
	}
	
	public static boolean hasEveryLetter(String str){
	    boolean[] set = new boolean[26];
	    
	    for(int i=0; i<str.length(); i++){ 
	    	char c = str.charAt(i);
	        int index = Character.toLowerCase(c) - 'a';
	        if((index < 26) && (index >=0)){
	            if(set[index] == false) {
	                set[index] = true;
	            }
	            else
	                continue;
	        }
	    }
	    
	    for(int j=0; j<26; j++){
	        if(set[j] == false)
	            return false;
	    }
	    
	    return true;  
	}
}
