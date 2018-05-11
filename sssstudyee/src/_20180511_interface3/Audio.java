package _20180511_interface3;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio¸¦ ÄÕ´Ï´Ù.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio¸¦ ²ü´Ï´Ù.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		System.out.print("ÇöÀç Audioº¼·ý : ");
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
