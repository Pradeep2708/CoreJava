package Feb1;
/*Encapsulation-Binding variables and methods together*/

/*Access modifiers
 public-project level access
 private-cannot access a variable outside the class
 default-package level
 protected-package/outside package* 
 */
public class Car {
	private String name;
	private int year;
	private String color;
	
	void displayName(){
		System.out.println("Name is:"+name);
	}
	void setName(String input){
		name=input;
	}

}
