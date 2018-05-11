package _20180427_overriding2;

import java.beans.Transient;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = new SnowTire();
		snowTire.run();
		tire.run();
	}
}
