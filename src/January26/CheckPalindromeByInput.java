package January26;
import java.util.Scanner;
public class CheckPalindromeByInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number to check:");
		int number = obj.nextInt();
		int rev=0;
		int temp=0;
		int num=number;
		while(num>0){
			temp=num%10;
			rev=(rev*10)+temp;
			num=num/10;
		}
		if(number==rev){
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
	}
}
