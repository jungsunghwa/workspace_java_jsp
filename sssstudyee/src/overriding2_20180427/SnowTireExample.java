package overriding2_20180427;

import java.beans.Transient;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = new SnowTire();
		snowTire.run();
		tire.run();
	}
}
