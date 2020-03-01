package Assignment;

public class ComparisonOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		int y=20;
		int z=50;
		
		System.out.println(x==y);
		System.out.println(x!=y);
		System.out.println(x>=y);
		System.out.println(!((x<y)&&(y>z)));
		boolean result= z>x || z<y;
		System.out.println(result);

	}

}
