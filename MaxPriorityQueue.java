
public class MaxPriorityQueue {
	
	public String[] str;
	private int N = 0;
	
	public MaxPriorityQueue(int capacity){
		str = new String[capacity+1];
	}

	public boolean isEmpty(){		
		return N == 0;
	}
	
	public void insert(String s){
		str[++N] = s;
		swim(N);
	}
	
	private void swim(int k){
		while(k>1){
			int d = str[k].compareTo(str[k/2]);			
			if(d>0){
				exch(k,k/2);
//				String temp = str[k];
//				str[k] = str[k/2];
//				str[k/2] = temp;
				k=k/2;
			}
			else break;
		}
	}
	
	private void exch(int a, int b){
		String temp = str[a];
		str[a] = str[b];
		str[b] = temp;
	}
	
	public String deleteMax(){
		String max = str[1];
		str[1] = str[N--];
		
		sink(1);
		str[N+1] = null;
		return max;
	}
	
	public void sink(int k){
		
		while(2*k <= N){
			int d = str[2*k].compareTo(str[(2*k)+1]);
			if(d >= 0){
				exch(k, 2*k);				
				k = 2*k;
			}
			else {
				exch(k,(2*k)+1);
				k = (2*k)+1;
			}
		}
	}
}
