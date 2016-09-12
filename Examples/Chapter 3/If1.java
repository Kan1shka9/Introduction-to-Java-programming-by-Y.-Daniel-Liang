/**
 * Write an if statement that assigns 1 to x if y is greater than 0.
 */

package Chapter_3;

import java.util.Scanner;

public class If1 {
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a value for y :- ");
		int y = obj.nextInt();
		
		if ( y == 0 ){
			int x = 1;
			System.out.println("Value of x: - " + x);
		}
	}

}
