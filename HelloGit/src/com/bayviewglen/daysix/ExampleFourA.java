package com.bayviewglen.daysix;

import java.util.Scanner;

public class ExampleFourA {

	public static void main(String[] args) {
		String outer, inner;
		String combined;
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter a four character string: ");
		outer = scanner.nextLine();
		System.out.print("Please enter a word: ");
		inner = scanner.nextLine();
		
		// We need to start with a "" or it will treat the chars as the ints and add them as ints - Remember ASCII
		combined = "" + outer.charAt(0) + outer.charAt(1) + inner + outer.charAt(2) + outer.charAt(3);
		
		System.out.println("The new string you created is: " + combined);
 		
		scanner.close();

	}

}
