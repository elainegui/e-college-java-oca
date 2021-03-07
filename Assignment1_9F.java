package eCollegeJavaOCA;

public class Assignment1_9F {
	public static void main(String[] args) {

		double i = 10.1 % 5;
		System.out.println(i);
		Plum p1 = new Plum();
		Plum p2 = new Plum();
		Plum p3 = p1;
		if (p1 != p2)
			if (p1 == p3)
				System.out.println(true);
	}
}

class Plum {}
