package _20180511_interface3;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.print("���� TV���� : ");
		if(volume>MAX_VOLUME) {
			System.out.println("10");
		}
		else if(volume<MIN_VOLUME) {
			System.out.println("0");
		}
		else {
			System.out.println(volume);
		}
	}

}
