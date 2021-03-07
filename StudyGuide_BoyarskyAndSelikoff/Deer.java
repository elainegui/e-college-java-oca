package eCollegeJavaOCA.StudyGuide_BoyarskyAndSelikoff;
/*What is the output of the following code?
		A. DeerReindeer,false
		B. DeerReindeer,true
		C. ReindeerDeer,false
		D. ReindeerDeer,true
		E. DeerAgeReindeer,false
		F. DeerAgeReindeer,true
		G. The code will not compile because of line 7.
		H. The code will not compile because of line 12.*/

public class Deer {
	public Deer() {
		System.out.print("Deer");
	}

	public Deer(int age) {
		System.out.print("DeerAge");
	}

	private boolean hasHorns() {
		return false;
	}

	public static void main(String[] args) {

		Deer deer = new Reindeer(5);

		System.out.println("," + deer.hasHorns());

	}
}

class Reindeer extends Deer {

	public Reindeer(int age) {
		System.out.print("Reindeer");
	}

	public boolean hasHorns() {
		return true;
	}
}