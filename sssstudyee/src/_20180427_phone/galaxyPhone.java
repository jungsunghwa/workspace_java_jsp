package _20180427_phone;

public class galaxyPhone extends Phone{
	
	public galaxyPhone(String owner) {
		// TODO Auto-generated constructor stub
		super(owner);
	}
	public galaxyPhone() {
		super();
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("�Ｚ�ΰ� �ѱ�");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("�Ｚ�ΰ� ����");
	}

	@Override
	public void internetSearch() {
		// TODO Auto-generated method stub
		System.out.println("ũ�� ���ͳݰ˻�");
	}
}
