package Assignment;

public class Execution4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car ciaz= new Car("Maruti Ciaz","Grey",2019);
		ciaz.displayDetails();
		ciaz.changeGear(2);
		Car.noOfGear=5;
		int speed=ciaz.accelerate();
		System.out.println("Accelerating speed by:"+speed+"km/hour");
		Car.applyBrakes();
		
	}

}
