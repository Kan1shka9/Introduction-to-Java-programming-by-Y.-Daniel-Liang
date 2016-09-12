package Chapter_2;

import java.util.*;

public class FahrenheitToCelsius {
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the degree of fahrenheit :- ");
		double fahrenheit = obj.nextDouble();
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
	}
}