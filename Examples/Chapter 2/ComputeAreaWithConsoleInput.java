package Chapter_2;

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius :- ");
		double radius = input.nextDouble();
		double area = 3.1416 * radius * radius;
		System.out.println("The area of the circle with radius " + radius + " is :- " + area);
	}
}
