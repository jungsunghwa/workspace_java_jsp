package overriding_20180427;

public class Computer extends Calculator{
	@Override
	double areaCircle(double r) {
		System.out.println("Calculator areaCircle()");
		return Math.PI * r * r;
	}
}
