package January26;

import java.util.Scanner;

public class UserInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
	/*	System.out.println("Enter a number to display the range:");
		int number = obj.nextInt();
		for(int i=1; i<=number; i++){
			System.out.println(i);
		}*/
		System.out.println("Enter your name:");
		String name=obj.nextLine();
		
		System.out.println("Enter your city:");
		String city=obj.nextLine();
		
		System.out.println("Your name is :"+name);
		System.out.println("Your city is:"+city);
		

	}

}
