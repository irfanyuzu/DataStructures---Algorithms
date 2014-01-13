/*
* Given a String, the program will compress the string as shown in the example. The main method will display the string
* of smaller length after the compression
*
* Ex 1:Input String      : "aaabbbccddaa"
*      Compressed String : "a3b3c2d2a2"
*      Outut String      : "a3b3c2d2a2"
*     
* Ex 2:Input String      : "abcd"
*      Compressed String : "a1b2c1d1"
*      Outut String      : "abcd"
*     
* Author : Bharath Kumar Pareek
* Email  : bharathpareek@gmail.com
*/

public class stringCompresser {
	public static void main(String[] args){
		String s = "aaaaaaabcda";
		if(compresser(s).length() > s.length())
			System.out.print(s);
		else
			System.out.print(compresser(s));
	}
	
	public static String compresser(String s){		
		StringBuffer sb = new StringBuffer();
		int count = 1;
		sb.append(s.charAt(0));
		sb.append(count);
		int len;
		for(int i=1; i<s.length(); i++){			
			if(s.charAt(i) == s.charAt(i-1)){	
				len = sb.length();
				sb.deleteCharAt(len-1);				
				sb.append(++count);
			}
			else {
				count = 1;
				sb.append(s.charAt(i));
				sb.append(count);
			}
		}
		
		return (new String(sb));
		
	}
}
