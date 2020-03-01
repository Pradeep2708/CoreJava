package January26;

public class SwapNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=20;
		int y=10;
		/*int z;
		
		z=x;
		x=y;
		y=z;
		System.out.println(x);
		System.out.println(y);*/
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("X:"+x);
		System.out.println("Y:"+y);

	}

}
