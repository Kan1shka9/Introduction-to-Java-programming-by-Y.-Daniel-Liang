package Chapter_2;

import java.util.Scanner;

public class ComputeAverage {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 numbers :- ");
		double in1 = input.nextDouble();
		double in2 = input.nextDouble();
		double in3 = input.nextDouble();
		
		double avg = ( in1 + in2 + in3 ) / 3;
		System.out.println("The average of the numbers " + in1 + ", " + in2 + ", " + in3 + " is :- " + avg);
	}
}
