package Assignment;

public class LogicalEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=20;
		int y=400;
		int z=500;
		
		/*if((x>y)&&(x>z)){
			System.out.println("X is greater");
		}
		if((z>y)&&(z>x)){
			System.out.println("Z is greater");
		}
		if((y>x)&&(y>z)){
			System.out.println("Y is greater");*/
		if((x>y)&&(x>z)){
			System.out.println("X is greater");
			
		}
		else if(y>z){
			System.out.println("Y is greater");
		}
		else{
			System.out.println("Z is greater");
		}
			


	}

}
