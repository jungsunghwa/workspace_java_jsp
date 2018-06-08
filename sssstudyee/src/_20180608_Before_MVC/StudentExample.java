package _20180608_Before_MVC;

public class StudentExample {
	
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setRollNo("10");
		stu.setName("Robert");
		System.out.println(stu.getName() + " " + stu.getRollNo());
	}
}
