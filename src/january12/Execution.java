package january12;

public class Execution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student amol= new Student("Amol",123,"Wadia College","Electrical");
		amol.attendsLecture();
		amol.appersForExam();
		
		Student pradeep = new Student("pradeep",456,"computers");
		pradeep.appersForExam();
		pradeep.attendsLecture();
		
		}
}
