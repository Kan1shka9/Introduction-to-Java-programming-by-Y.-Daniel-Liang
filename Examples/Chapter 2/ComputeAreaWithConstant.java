package Chapter_2;

import java.util.Scanner;

public class ComputeAreaWithConstant {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius :- ");
		double radius = input.nextDouble();
		final double PI = 3.1416;
		double area = PI * radius * radius;
		System.out.println("The area of the circle with the radius " + radius + " is :- " + area);
	}
}
