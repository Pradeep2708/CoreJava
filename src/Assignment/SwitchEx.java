package Assignment;

public class SwitchEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		String calculate="add";
		
	switch(calculate){
	case "add" :System.out.println("addition is:"+(a+b));
	break;
	case "sub" :System.out.println("subtraction is:"+(a-b));
	break;
	case "mul" :System.out.println("Multiplication is:"+(a*b));
	break;
	case "Div" :System.out.println("Division is:"+(a/b));
	break;
/*	case "Thursday" :System.out.println("day 5 of week is Thursday");
	break;
	case "Friday" :System.out.println("day 6 of week is Friday");
	break;
	case "Saturday" :System.out.println("day 7 of week is Saturday");
	break;*/
	default : System.out.println("Invalid Input");
}
}
}