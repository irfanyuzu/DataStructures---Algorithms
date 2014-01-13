/*
* For a given matrix of size M X N, the program will set the entire row and column to zeros
* when a Zero is found in the original matrix.
*
* Author : Bharath Kumar Pareek
* Email  : bharathpareek@gmail.com
*/

public class matrixSetZeros {
	public static void main(String[] args){
		int[][] array = new int[4][4];
		for(int i=0; i<array[0].length; i++){
			for(int j=0; j<array[1].length; j++)
				array[i][j] = 1;
		}
		
		array[1][2] = 0;
		array[1][1] = 0;
		setZeros(array);
	}
	
	public static void setZeros(int[][] array){
		int[] row = new int[4];
		int[] column = new int[4];
		
		for(int i=0; i<array.length;i++){
			for(int j=0; j<array[0].length; j++){
				if(array[i][j] == 0){
					row[i] = 1;
					column[j] = 1;
				}
			}
		}		

		for(int k=0; k<array.length;k++){
			for(int l=0; l<array[0].length; l++){
				if(row[k] == 1 || column[l] == 1)
					array[k][l] = 0;
			}
		}
		
		for(int a=0; a<4; a++){
			for(int b=0; b<4; b++)
				System.out.print(array[a][b]);
			System.out.println();
		}
	}
}
