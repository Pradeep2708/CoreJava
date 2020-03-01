package Assignment;

public class Execution6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj= new Calculator(5,5);
		int result=obj.add(5,5);
		int result1=obj.sub(5,5);
		int result2=obj.mul(5,5);
		int result3=obj.div(5,5);
		System.out.println("Addition is:"+result);
		System.out.println("Subtraction is:"+result1);
		System.out.println("Multiplication is:"+result2);
		System.out.println("Division is:"+result3);

	}

}
