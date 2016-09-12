/**
 * Write an if statement that increases pay by 3% if score is greater than 90.
 */

package Chapter_3;

import java.util.*;

public class If2 {
	public static void main(String args[]){
		int score;
		double pay = 10000;
		
		System.out.print("Enter your score :- ");
		Scanner obj = new Scanner(System.in);
		score = obj.nextInt();
		
		if (score == 90){
			pay = ((3.0/100) * pay ) + pay;
			System.out.println("Updated pay :- " + pay);
		}
	} 
}