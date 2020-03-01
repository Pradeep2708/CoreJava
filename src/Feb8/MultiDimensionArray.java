package Feb8;

public class MultiDimensionArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numbers={{1,2,3,4},{5,6,7,8}};
		
		
		for(int i=0; i<numbers.length; i++){
			for(int j=0; j<numbers[i].length; j++){
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}

	}

}
