package _20180608_MVC;

import java.awt.Dialog.ModalExclusionType;

public class StuController {
	private Student model;
	private stuView view;
	public StuController(Student model, stuView view) {
		this.model = model;
		this.view = view;
	}
	public void setStudentName(String name) {
		model.setName(name);
	}
	public String getStudentName(){
		return model.getName();
	}
	
	public void setStudentRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}
	public String getStudentRollNo(){
		return model.getRollNo();
	}
	public void updateView() {
		view.printStudentDetails(model.getName(), model.getRollNo());
	}
	
}
