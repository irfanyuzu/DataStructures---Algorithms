
public class uniqueCharString {
	public static void main(String[] args){
		String str = "HELlO";
		System.out.println(isUnique(str));
	}
	
	public static boolean isUnique(String str){
		int[] array = new int[256];
		
		for(int i=0; i<str.length(); i++){			
			if(array[str.charAt(i)] == 0)
				array[str.charAt(i)] = 1;
			else
				return false;
		}
		return true;
	}
}
