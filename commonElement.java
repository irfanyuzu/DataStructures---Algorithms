import java.util.ArrayList;


public class commonElement {
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6,7,8,9};
		int[] b = {5,7,9,10,11,12,14};
		commonInteger(a,b);		
	}
	
	public static void commonInteger(int[] a, int[] b){
		int i=0, j=0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		while((i<a.length) && (j<b.length)){
			if(a[i] < b[j])
				i++;
			else if(a[i] > b[j])
				j++;
			else{							
				list.add(a[i]);
				i++;
				j++;
			}								
		}
		for(Integer elem : list)
			System.out.println(elem);
		
	}
}
