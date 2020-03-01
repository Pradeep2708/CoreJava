package January26;

public class PalindromeEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=121212121;
		int rev=0;
		int temp;
		int number=num;
		while(num>0){
			temp=num%10;
			rev=(rev*10)+temp;
			num=num/10;
		}
		if(number==rev){
			System.out.println("Given number is palindrome");
		}
		else{
			System.out.println("Given number is not palindrome");
		}

	}

}
