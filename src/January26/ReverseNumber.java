package January26;

public class ReverseNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=124578,reverse=0;
		while(n!=0){
			reverse = reverse*10;
			reverse=reverse+n%10;
			n=n/10;
		}
		System.out.println(reverse+ "is the reverse number");

	}

}
