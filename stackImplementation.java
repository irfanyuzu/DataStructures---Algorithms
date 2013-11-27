
public class stackImplementation {
	private Node first;
	
	private class Node{
		String str;
		Node next;
	}
		
	public void  push(String s){
		Node oldFirst = first;
		first = new Node();
		first.str = s;
		first.next = oldFirst;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public String pop(){
		String item = first.str;
		first = first.next;
		return item;
	}
}

