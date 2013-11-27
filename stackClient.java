
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
