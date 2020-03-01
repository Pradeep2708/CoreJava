package january12;

public class Student {
	String name;
	int id;
	String collegename;
	String department;
	
	Student(String iname,int iid,String icollege,String idepartment){
		
		name=iname;
		id=iid;
		collegename=icollege;
		department=idepartment;
		}
	
	Student(String iname,int iid, String idepartment)
	{
		name = iname;
		id=iid;
		collegename="wadia college";
		department= idepartment;
	}
	Student(String iname, int iid)
	{
		name = "sagar";
		id=iid;
	}
	void attendsLecture()
	{
		System.out.println(name+"attends lecture");
	}
	void appersForExam(){
		System.out.println(name+"attends exam with Id" +id);
	}
	void studiesInDepartment(){
		System.out.println(name+"Studies in department"+department);
	}
		void studiesInCollege(){
			System.out.println(name+"studies in college"+collegename);
	}

}
