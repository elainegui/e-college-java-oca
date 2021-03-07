package eCollegeJavaOCA;

public class Assignment2_6 {

	public static void main(String[] args) {
		int x = 11;
		int y = 11;
		System.out.println(x++ > y & ++y > x);
		System.out.print(x + " " + y);
		System.out.println("\n");
		int a = 11;
		int b = 11;
		System.out.println(a++ > b && ++a > b);
		System.out.print(a + " " + b);
		System.out.println("\n");
		int c = 11;
		int d = 11;
		System.out.println(c++ > d | ++c > ++d);
		System.out.print(c + " " + d);
		System.out.println("\n");
		int e = 11;
		int f = 11;
		System.out.println(++e > f || ++e > ++f);
		System.out.print(e + " " + f);
		System.out.println("\n");
		int g = 11;
		int h = 11;
		System.out.println(g++ > h ^ ++g > ++h);
		System.out.print(g + " " + h);

	}

}
