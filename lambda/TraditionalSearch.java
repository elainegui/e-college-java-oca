package eCollegeJavaOCA.lambda;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>(); // list of animals
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));

		print(animals, new CheckIfHopper()); // pass class that does check
	}

	private static void print(List<Animal> animals, CheckTrait checker) {
		for (Animal animal : animals) {
			if (checker.test(animal)) // the general check
				System.out.print(animal + " ");
		}
		System.out.println();
	}
}


// if we want to print the animals that canSwim() we have to write another class
// checkIfSwims()

// or we can replace line 14 with lambda

// print(animals, a -> a.canSwim()); //animals that can swim
// print(animals, a -> ! a.canSwim()); // animals that cannot swim


// LAMBDA SYNTAX
// 3 parts: parameter, arrow and body

// a -> a.canHop()

// (Animal a) -> { return a.canHop(); }
// Parameter type, arrows, return and semicolon

// The parenthesis can only be omitted if there is a single parameter and its
// type is not explicitly stated.


// when we have just one statement we can ommit the braces

// Java doesn’t require you to type return or use a semicolon when no braces are
// used

// print(() -> true) // 0 parameters

// print(a -> a.startsWith("test")); // 1 parameter

// print((String a) -> a.startsWith("test")); // 1 parameter

// print((a, b) -> a.startsWith("test")); // 2 parameters

// print((String a, String b) -> a.startsWith("test")); // 2 parameters

// print(a, b -> a.startsWith("test")); // DOES NOT COMPILE

// print(a -> { a.startsWith("test"); }); // DOES NOT COMPILE

// print(a -> { return a.startsWith("test") }); // DOES NOT COMPILE

// (a, b) -> { int a = 0; return 5;} // DOES NOT COMPILE

// (a, b) -> { int c = 0; return 5;}


// PREDICATES

// we created and interface CheckTrait with one method:
// boolean test(Animal a);

// these are called FUNCTIONAL INTERFACES

// we have to create lots of these interfaces each time we want to test some
// object

// java provides this interface for us
// it is in the package java.util.function

/*
 * public interface Predicate<T> {
 * boolean test(T t);
 * }
 */

// type T is the syntax for Generics (ex. when we create an ArrayList)

// so instead of creating the inerface we can use Predicate interface

/*
 * private static void print(List<Animal> animals, Predicate<Animal> checker) {
 * for (Animal animal : animals) {
 * if (checker.test(animal))
 * System.out.print(animal + " ");
 * }
 * System.out.println();
 * }
 */

// Java 8 even integrated the Predicate interface into some existing classes.
// There is only
// one you need to know for the exam. ArrayList declares a removeIf() method
// that takes a
// Predicate.

// bunnies.removeIf(s -> s.charAt(0) != 'h');

// It has one method named test that returns a boolean and takes any type