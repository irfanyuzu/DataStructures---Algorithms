
public class queueClient {
	public static void main(String[] args){
		String[] listOfStrings= {"Preetam","Bharath", "Karthik", "Santosh", "Aditya", "Vishal"};
		int len = listOfStrings.length;
		queueImplementation queue = new queueImplementation();
		for(int i=0; i<len; i++){
			if(listOfStrings[i] == "Vishal")
				System.out.println(listOfStrings[i] + ", I am Sorry ! The movie theater is full");
			else
				queue.enqueue(listOfStrings[i]);
		}
		while(!queue.isEmpty()){
		System.out.println("Welcome " + queue.dequeue() + " to watch the movie Dhoom 3");
		}
	}
}
