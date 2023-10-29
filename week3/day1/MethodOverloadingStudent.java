package week3.day1;

public class MethodOverloadingStudent {

	
	public void getStudentInfo(int id)
	{
		System.out.println("id: "+id);
	}
	
	public void getStudentInfo(int id, String name)
	{
		System.out.println("id: " +id);
		System.out.println("name: "+name);
	}
	
	public void getStudentInfo(String email, int phoneNumber)
	{
	System.out.println("email: " + email);
	System.out.println("phoneNumber: " + phoneNumber);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingStudent m = new MethodOverloadingStudent();
		m.getStudentInfo(123);
		m.getStudentInfo(123, "Prathibha");
		m.getStudentInfo("prathiru2016@gmail.com",1234567890);
		
		
		m.getStudentInfo(124);
		m.getStudentInfo(124, "Deepa");
		m.getStudentInfo("deepa@gmail.com",909090990);
		
		m.getStudentInfo(125);
		m.getStudentInfo(125, "Sakthi");
		m.getStudentInfo("sakthi@gmail.com",1010101010);
	}

}
