package Feb1;

public class NotString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String name="pune";
		System.out.println(name.toUpperCase());
		System.out.println(name);*/
		NotString obj=new NotString();
		obj.startsWithNot("pradeep");

	}
	public void startsWithNot(String value){
		boolean result=value.startsWith("not");
		if(result){
			System.out.println("String starts with not:"+value);
		}else{
			System.out.println("String does not starts with not:"+value);
			System.out.println("not"+value);
		}
	}

}
