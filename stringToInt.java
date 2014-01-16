// Given a String containing numbers, the program will return the integer value.
// Ex : Str = "10"
// Output int = 10
//
// Author : Bharath Kumar Pareek
// Email  : bharathpareek@gmail.com

public class stringToInt {
	public static void main(String[] args) throws Exception{
		String s = "-100";
		System.out.print(convert(s));
	}
	
	public static int convert(String s) throws Exception{
		int result = 0;
		boolean flag = false;
		int intermediateResult=0;
		if (s == null)
			throw new Exception("Empty String");
		
		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i) == '-'){
				flag = true;				
			}
			else {
				result = result * 10;
				intermediateResult = s.charAt(i) - '0';				
				if(s.charAt(i) > '9')
					throw new Exception("String contains Characters !!!");
				result = result + intermediateResult;
			}				
		}
		
		if(flag)
			return result*-1;
		else
			return result;
	}
}
