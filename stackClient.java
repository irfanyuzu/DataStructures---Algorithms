// Stack Client
// Program uses the LinkedList Stack Implementation to reverse a given sentence.
// For ex : If testData is "I am a RockStar", the output will be "RockStar a am I"
// This is not the best solution for reversing a Sentence but is a way to reverse a given sentence.
// Complexity : The cost of Push and Pop in a Stack (Linked List Implementation) is O(1)
//
// Author : Bharath Kumar Pareek
// E-mail : bharathpareek@gmail.com

public class stackClient {

	public static void main(String[] args){
		String testData = "Bharath Kumar Pareek";
		String[] arrString = testData.split(" ");
		
		stackImplementation stack = new stackImplementation();
		
		int len = arrString.length;
		
		for (int i=0; i<len; i++){
			stack.push(arrString[i]);
		}
		while(!stack.isEmpty()){
			System.out.print(stack.pop() + " ");
		}
	}
}
