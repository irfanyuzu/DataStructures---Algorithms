/*
* For a given sorted array of integers, the program creates a Balanced Search Tree from the array.
*
* Author : Bharath Kumar Pareek
* Email  : bharathpareek@gmail.com
*/


public class createBSTFromArray {
	public static void main(String[] args){
		int array[] = {1,2,4,5,6,8,9,24};
		Node root = createTree(array,0, array.length-1);
		verifyTreeCreation(root);		
	}
	
	public static Node createTree(int[] array, int start, int end){
		if(start>end)
			return null;
		int mid = start + (end - start)/2;		
		
			Node node = new Node(array[mid]);
			node.left = createTree(array,start,mid-1);
			node.right = createTree(array,mid+1, end);		
		return node;
	}	
	
	// if method verifyTreeCreation prints the keys in ascending order, then the tree is properly created and is balanced
	
	public static void verifyTreeCreation(Node root){
		if(root == null)
			return;
		verifyTreeCreation(root.left);
		System.out.print(root.key + " "); 
		verifyTreeCreation(root.right);
	}
}

// Node Class is : 
class Node {
	Node left;
	Node right;
	int key;
	public Node(int key){
		this.key = key;
	}
}
