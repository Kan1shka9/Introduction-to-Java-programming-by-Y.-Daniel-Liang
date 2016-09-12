package Chapter_3;

import java.util.*;

public class SimpleIfDemo {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter an integer :- ");
		int input = obj.nextInt();
		
		if ( input % 5 == 0 )
			System.out.println("HiFive");
		
		if ( input % 2 == 0 )
			System.out.println("HiEven");	

	}

}
