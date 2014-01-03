import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class multiMap {
	public static void main(String[] args){
		String[] str = {"dog", "cat", "god", "one", "tac", "eno"};
		HashMap <String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		
		for(int i=0; i<str.length; i++){
			char[] c = str[i].toCharArray();
			Arrays.sort(c);
			String s = new String(c);
			if(map.get(new String(c)) == null)				
				map.put(s, new ArrayList<String>());
			map.get(s).add(str[i]);
		}
		int i=0;
		
		for(String string : map.keySet()){
			for(String lists : map.get(string)){				
				str[i++] = lists;
			}
		}
		for(int k=0; k<str.length; k++)	
			System.out.print(str[k] + " ");
	}
}
