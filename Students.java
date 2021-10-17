package week3.day1;

public class Students {
	public void getStudentInfo(int ID)
	{
		System.out.println("Student ID is "+ID);
	}
	
	public void getStudentInfo(int ID,String Name)
	{
		System.out.println("Student ID is "+ID);
		System.out.println("Student Name is "+Name);
	}

	public void getStudentInfo(String email, String Phone)
	{
		System.out.println("Student Email is "+email);
		System.out.println("Student Mobile number is "+Phone);
	}

	public static void main(String[] args) {
		Students obj = new Students();
		obj.getStudentInfo(123);
		obj.getStudentInfo(321,"Kriti");
		obj.getStudentInfo("sumi@gmail.com","9123456545");

	}

}
