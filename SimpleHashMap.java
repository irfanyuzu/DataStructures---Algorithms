// Simple implementation of a HashMap which supports String - Integer as the Key - Value pairs
//
// Author : Bharath Kumar Pareek
// Email  : bharathpareek@gmail.com

import java.util.ArrayList;

public class SimpleHashMap {
	private ArrayList<ArrayList<Node>> list = new ArrayList<ArrayList<Node>>();	
	
	public SimpleHashMap(){
		for(int i=0; i<10; i++)
			list.add(i, new ArrayList<Node>());
	}	
	
	private class Node{
		String k;
		int v;
		public Node(String k, int v){
			this.k = k;
			this.v = v;
		}
	}
	private int calculateHash(String k){
		int sumOfChar=0;
		char[] tempArray = k.toCharArray();
		for(int i=0; i<tempArray.length; i++){
			sumOfChar += tempArray[i];
		}
		int index = sumOfChar % 10;
		return index;
	}
	public void put(String k, int v){
		int index = calculateHash(k);					
		for(Node node : list.get(index)){
			if(node.k == k){
				node.v = v;
				return;
			}
		}
		Node n = new Node(k,v);		
		list.get(index).add(n);
	}
	
	public int get(String k){
		int index = calculateHash(k);
		int value = -1;
		for(Node l : list.get(index)){
			if(l.k == k)
				value = l.v;
		}	
		
		return value;
	}
	
	public int size(){
		int count = 0;
		for(int i=0; i<10; i++){
			count += list.get(i).size();
		}
		return count;
	}
	
}
