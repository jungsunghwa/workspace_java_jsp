package _20180427_phone;

public class iPhone extends Phone{
	
	public iPhone(String owner) {
		// TODO Auto-generated constructor stub
		super(owner);
	}
	public iPhone() {
		super();
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("���÷ΰ� �ѱ�");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("���÷ΰ� ����");
	}

	@Override
	public void internetSearch() {
		// TODO Auto-generated method stub
		System.out.println("���ĸ� ���ͳݰ˻�");
	}
	
}
