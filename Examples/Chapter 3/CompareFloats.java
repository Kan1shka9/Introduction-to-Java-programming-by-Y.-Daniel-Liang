/**
 * Comparing two values of the double type -> 1E-14
 * Comparing two values of the float type -> 1E-7
 */

package Chapter_3;

public class CompareFloats {

	public static void main(String[] args) {
		final double EPSILON = 1E-14;
		double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
		if (Math.abs(x - 0.5) < EPSILON)
		System.out.println(x + " is approximately 0.5");
	}

}