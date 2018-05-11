package _20180427_overriding;

public class Computer extends Calculator{
	@Override
	double areaCircle(double r) {
		System.out.println("Calculator areaCircle()");
		return Math.PI * r * r;
	}
}
