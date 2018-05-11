package _20180427_phone;

public abstract class Phone {
	public String owner;
	public Phone(String owner) {this.owner = owner;}
	public Phone() {}
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void internetSearch();
}
