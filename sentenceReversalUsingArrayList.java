// Reversing a sentence (string). This program uses extra space (Array List) to reverse the given sentence.
//
// Author : Bharath Kumar Pareek
// Email  : bharathpareek@gmail.com

import java.util.ArrayList;
	
public class sentenceReversalUsingArrayList {	
		
	public static void main(String[] args){
			String str = "Bharath Kumar Pareek";
			String rev = "";
			
			ArrayList<String> list = new ArrayList<String>();
			int beg = 0;
			for(int i =0; i<str.length(); i++){
				if(str.charAt(i) == ' '){
					list.add(str.substring(beg,i));
					beg = i + 1;
				}
				else if (i == str.length()-1)
					list.add(str.substring(beg));
			}
			
			for(int j = list.size()-1; j>=0; j--)
				rev += list.get(j) + " ";
				
			System.out.print(rev);
		}		
}

