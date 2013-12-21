import java.util.HashMap;


public class frequentNames {
	public static void main (String[] args){
		String[] names = {"Barry", "Barry", "Barry", "Barry", "Barry", "Barry", "Fred","Fred","Fred","Fred","Fred","Jack","Fred","Fred","Jack"};
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int len = names.length;
		
		for(int i=0; i<len; i++){
			Integer count = map.get(names[i]);
			if(count == null)
				count = new Integer(1);
			else
				count = new Integer(count+1);
			map.put(names[i], count);
		}
		
		int max = 0;
		String mostFreqName = null;
		
		for(String name : map.keySet()){
			int freq = map.get(name);
			
			if (max < freq){
				max = freq;
				mostFreqName = name;
			}
			System.out.println(name + " : " + freq);			
		}	
		System.out.println(mostFreqName + " has occured " + max + " times and is the most Frequent name");
	}
}
