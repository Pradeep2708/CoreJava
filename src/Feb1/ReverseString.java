package Feb1;

import java.util.Scanner;

public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a string");
		String value=obj.nextLine();
		revString(value);
						
					
		}
			public static void revString(String str){
				String reverse="";
				System.out.println(str.length());
				int len=str.length();
				System.out.println("Length of the string is:"+len);
				for(int i=len; i>=0; i-- ){
					reverse=reverse+str.charAt(i);
					
			}
				System.out.println("Reverse of"+str+"is:"+reverse);

}
}
