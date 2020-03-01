package January26;

public class PalindromeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int num=1; num<=100000; num++){
		int rev=0;
		int temp;
		int number=num;
		while(number>0){
			temp=number%10;
			rev=(rev*10)+temp;
			number=number/10;
		}
		if(num==rev){
			System.out.println("Given number is palindrome"+num);
		}
		}
	}
}
