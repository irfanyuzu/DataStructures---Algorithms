
public class queueImplementation {
	private Node first, last;
	
	private class Node{
		String item;
		Node next;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public void enqueue(String str){
		Node oldLast = last;
		last = new Node();
		last.item = str;
		last.next = null;
		if(isEmpty())
			first = last;
		else 
			oldLast.next = last;
	}
	
	public String dequeue(){
		String returnItem = first.item;
		first = first.next;
		if(isEmpty())
			last = null;
		return returnItem;
	}
}
