// This Program can be used to :
// 1. Find the first index of a sub-string 
// 2. Replace the first occurence of the sub-string
//
// Ex: Original String = "I love Programming in Java"
// Find String: "Programming"
// Replace STring: "Coding"
// Result : "I love Coding in Java"
//
// Author : Bharath Kumar Pareek
// Email  : bharathpareek@gmail.com
// 

public class replaceFirstOccurenceOfString {
	
	public static void main(String[] args){		
		String originalString="Hello you there ?";
		String findString="?";
		String replaceString="Rooney ?";
		
		int index = indexOf(originalString,findString);
		if(index <0)
			System.out.print("Cannot find the string");
		else{
			originalString = replace(originalString, replaceString, index, findString.length());
		    System.out.print(originalString);
		}
	}	
	
	public static int indexOf(String original, String findString){
		int j=0;
		char[] orig = original.toCharArray();
		char[] find = findString.toCharArray();		
		
		for(int i=0; i<orig.length;){			
			if(orig[i++]==find[j]){					
				if(j == find.length-1){										
					return i-find.length;
				}
				else j++;
			}
			else{				
				i = i-j;					
				j = 0;
			}
		}		
		return -1;
	}
	
	public static String replace(String originalString, String replaceString, int index, int findStringLength){
		char[] orig = originalString.toCharArray();
		char[] repl = replaceString.toCharArray();
		int j=0;
		
		if(findStringLength == replaceString.length()){
			for(int i= index; i<index+repl.length; i++){
				orig[i] =repl[j++]; 			
			}
			return String.valueOf(orig);
		} 
		else {
			int newStringLength;
			if(findStringLength >= replaceString.length())
				newStringLength = originalString.length()-(findStringLength-replaceString.length());
			else
				newStringLength = originalString.length() + (replaceString.length()-findStringLength);
			
			char[] newString = new char[newStringLength];
			int k = index+replaceString.length();
			int offset = index+findStringLength;
			
			for(int i=0; i<newString.length; i++){
				if(i >=index && i<k){
					newString[i] = repl[j++];
				}
				else if(i>=k){
					newString[i] = orig[offset++];
				}
				else
					newString[i] = orig[i];
			}	
			return String.valueOf(newString);
		}
	}
}
