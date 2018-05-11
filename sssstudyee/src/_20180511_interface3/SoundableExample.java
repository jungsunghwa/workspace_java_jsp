package _20180511_interface3;

public class SoundableExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(13);
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(50);
		rc.setMute(true);
		RemoteControl.changeBattery();
	}
}
