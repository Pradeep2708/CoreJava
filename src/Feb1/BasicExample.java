package Feb1;

import java.util.Scanner;

public class BasicExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello world");
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your name");
		String name= obj.nextLine();
		System.out.println(name);
		System.out.println("Enter your DOB");
		int dob=obj.nextInt();
		System.out.println("Your date of birth:"+dob);

	}

}
