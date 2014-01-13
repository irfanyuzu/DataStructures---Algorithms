/*
* Stack Implementation
* This stack provides the functions like push(int key), pop(), size(), peek(), min() in constant time (ie. O(1))
*
* Author : Bharath Kumar Pareek
* Email  : bharathpareek@gmail.com
*/

public class minStack {
	private Node first;
	private int N = 0;
	public class Node{
		int item;
		int min;
		Node next;
	}
	public void push(int item){
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
		N++;
		if(N == 1)
			first.min = item;
		else if (N>1){
			if(oldFirst.min < first.item)
				first.min = oldFirst.min;
			else
				first.min = first.item;
		}
			
	}
	public boolean isEmpty(){
		return first==null;
	}
	public int pop(){
		int key = first.item;
		first = first.next;
		N--;
		return key;
	}
	public int min(){
		return first.min;
	}
	public int size(){
		return N;
	}
	public int peek(){
		return first.item;
	}
}
