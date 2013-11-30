import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class lookoutChallenge {
	public static void main (String[] args) throws IOException{
		if (args.length < 1) {
			throw new IllegalArgumentException("Error: Input file not specified!");
		}
		
		File inputFile = new File(args[0]);
		
		try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
			while (br.ready()) {
				String s = br.readLine();
				
				int Mask;
				int maskedResult;
				int count=0;
				
				for(int x=0; x<s.length(); x++){
					if(s.charAt(x) == ';'){
						break;
					}
					else 
						count++;
				}
				
				String a = s.substring(0,count);
				String b = s.substring(count+1);
				
				String[] testData = b.split(",");
				
				for(int i=1; i<testData.length; i+=2){
					int x = Integer.parseInt(testData[i]);
					int len = testData[i].length();
					Mask = mask(x,len);
					maskedResult = Mask + x;			
					testData[i] = Integer.toString(maskedResult);						
				}	
				
				for(int k=0; k<testData.length; k=k+2){
					int ind = indexOf(a, testData[k]);
					
					if(ind < 0){
						throw new ArrayIndexOutOfBoundsException("String not found");
					}
					else
						a = replace(a, testData[k+1], ind, testData[k].length());			
				}		
				
				
				int[] arr = new int[a.length()];
				
				for(int j=0; j<a.length(); j++){
					arr[j]=Character.getNumericValue(a.charAt(j));
					if(arr[j]>1)
						arr[j]=arr[j] - 2 ;					
				}
				
				StringBuilder sb = new StringBuilder(arr.length);
				for (int i : arr) {
				  sb.append(i);
				}
				String result = sb.toString(); 
				System.out.println(result);
				
			}	
	}
}
	
	public static int mask(int b, int len){		
		int Mask=0;
		for (int i=0; i<len; i++){
			Mask+=2*Math.pow(10,i);			
		}		
		return Mask;
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
