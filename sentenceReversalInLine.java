import java.util.ArrayList;


public class sentenceReversalInLine {
	public static void main(String[] args){
		String str = "Bharath Kumar Pareek";
		str = reverse(str);		
		System.out.println(str);
//		ArrayList<String> list = new ArrayList<String>();
//		int beg = 0;
//		for(int i =0; i<str.length(); i++){
//			if(str.charAt(i) == ' '){
//				list.add(str.substring(beg,i));
//				beg = i + 1;
//			}
//			else if (i == str.length()-1)
//				list.add(str.substring(beg));
//		}
//		
//		for(int j = list.size()-1; j>=0; j--)
//			System.out.print(list.get(j) + " ");
	}
	
	public static String reverse(String str){
		
		
		char[] strArray = str.toCharArray();
		
		int strLength = strArray.length;
		
		
		for(int i=0; i<strLength/2; i++){
			swap(strArray, i, strLength-i-1);
		}
		
		int beg=0;		
		int len;
		
		for(int j=0; j<strArray.length; j++){ 
			int x=0;
			if(strArray[j] == ' '){ 
				len = j-beg;				
				for(int k=beg; k<(len/2)+beg; k++){					
					swap(strArray, k, j-x-1);
					x++;
				}
				beg = j+1;
			}
			else if (j == strArray.length-1){ 
				len = j-beg+1;				
				for(int m = beg; m<(len/2)+beg; m++){					
					swap(strArray,m, j-x);
					x++;
				}
			}
		}
		
		return String.valueOf(strArray);
	}
	
	public static void swap(char[] strArray, int i, int j){
		char temp = strArray[i];
		strArray[i] = strArray[j];
		strArray[j] = temp;
	}
}
