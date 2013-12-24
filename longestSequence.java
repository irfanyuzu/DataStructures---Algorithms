
public class longestSequence {
	public static void main(String[] args) throws Exception{
		int array[] = {1,2,5,6,5,10,11,23,45,67,100,0,2,3};
		determineSequence(array);
	}
	
	public static void determineSequence(int[] array) throws Exception{
		int beg=0;
		int end=0;
		int longSeqBeg = 0;
		int longSeqEnd = 0;
		int max = 0;
		int seqLength = 0;
		int length = array.length;
		
		if (length == 0)
			throw new Exception("Empty Array");
		
		for(int i=1; i<length; i++){
			if(array[i-1] < array[i]){
				end = i;
				if(i == length -1){
					seqLength = end - beg + 1;
					if(max<seqLength){
						max = seqLength;
						longSeqBeg = beg;
						longSeqEnd = end;
					}
				}
			}
			else { 
				seqLength = end - beg +1;
				if(max<seqLength){
					max = seqLength;
					longSeqBeg = beg;
					longSeqEnd = end;
				}
				beg = i;
				
			}
		}
		
		for(int j=longSeqBeg; j<=longSeqEnd; j++)
			System.out.print(array[j] + " ");		
		
	}
}
