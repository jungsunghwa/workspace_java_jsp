package _20180511_interface3;

public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	default void setMute(boolean mute) {
		if(mute)
			System.out.println("����ó��");
		else
			System.out.println("��������");
	}
	static void changeBattery() {
		System.out.println("������ ��ȯ");
	}
}
