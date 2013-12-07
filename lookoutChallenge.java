import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
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
					a=a.replaceAll(testData[k], testData[k+1]);
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
}

