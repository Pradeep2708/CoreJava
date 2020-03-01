package Assignment;

public class Car {
	String color;
	String name;
	int year;
	static int noOfGear=5;
	
	Car(String name,String color, int year){
		this.name= name;
		this.color= color;
		this.year=year;
		this.displayDetails();
	}
	void displayDetails(){
		System.out.println("The name of the car is:"+name);
		System.out.println("The color of the car is:"+color);
		System.out.println("The year of make is:"+year);
		System.out.println("The car has"+noOfGear+"gears");
		
	}
	void changeGear(int gearNo){
		System.out.println("Changing to Gear:"+gearNo);
	}
	int accelerate(){
		int speed=20;
		return speed;
	}
	static void applyBrakes(){
		System.out.println("Reducing speed");
	}

}
