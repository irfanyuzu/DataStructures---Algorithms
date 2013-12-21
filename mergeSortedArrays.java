
public class mergeSortedArrays {
	public static void main(String[] args){
		int a[] = {0,1,2,4,5};
		int b[] = {2,3,6,7,8};
		merge(a,b);
	}
	
	public static void merge(int[] a, int[] b){
		int[] c = new int[a.length + b.length];
		int i=0, j=0; 
		
		for(int k = 0; k < c.length; k++){
			if (i >= a.length)
				c[k] = b[j++];
			else if (j >= b.length)
				c[k] = a[i++];			
			else if(a[i] <= b[j]){
				c[k]= a[i++];
			}
			else if (a[i] > b[j]){
				c[k]= b[j++];
			}
			
		}
		
		for(int m=0; m<c.length; m++)
			System.out.print(c[m] + " ");
	}
}
