
public class PriorityQueueClient {
	public static void main(String[] args){
		MaxPriorityQueue pq = new MaxPriorityQueue(6);
		pq.insert("Andrew");
		pq.insert("Barry");
		pq.insert("Kevin");
		pq.insert("Danny");
		pq.insert("Freddy");
		pq.insert("Fred");
		
		System.out.print(pq.deleteMax() + " ");		
		System.out.print(pq.deleteMax() + " ");		
		System.out.print(pq.deleteMax() + " ");
		System.out.print(pq.deleteMax() + " ");		
		System.out.print(pq.deleteMax() + " ");
		System.out.print(pq.deleteMax() + " ");
		
	}
}
