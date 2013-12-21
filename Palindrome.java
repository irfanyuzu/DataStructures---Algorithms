
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
