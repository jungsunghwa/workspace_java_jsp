package _20180608_MVC;

public class MVCPatternDemo {
	public static void main(String[] args) {
		Student model = retriveStudentFromDatabase();
		stuView view = new stuView();
		StuController controller = new StuController(model, view);
		controller.updateView();
		controller.setStudentName("John");
		controller.updateView();
	}

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
}
