package Chapter_2;

public class Quiz {

	public static void main(String[] args) {
		System.out.println(2 * (5 / 2 + 5 / 2));
		System.out.println(2 * 5 / 2 + 2 * 5 / 2);
		System.out.println(2 * (5 / 2));
		System.out.println(2 * 5 / 2);
		System.out.println("25 / 4 is " + 25 / 4);
		System.out.println("25 / 4.0 is " + 25 / 4.0);
		System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);
		System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);
		System.out.println("2 ^ 3.5 is " + Math.pow(2, 3.5));
		int m, r;
		m = 18;
		r = 6;
		double ans =  m*(Math.pow(r,2));
		System.out.println("ans :- " + ans);
	}
}
