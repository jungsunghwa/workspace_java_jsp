package _20180511_interface3;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV¸¦ ÄÕ´Ï´Ù.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV¸¦ ²ü´Ï´Ù.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.print("ÇöÀç TVº¼·ý : ");
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
