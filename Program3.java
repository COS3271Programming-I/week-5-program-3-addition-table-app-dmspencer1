// Dalila Spencer
// 2026-02-16

package dms_week5;

import java.util.Scanner;

public class Program3 {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException {
		
		int num_entries, row, column, sum; 
		
		num_entries = 0;
		
		do {System.out.println("Enter a number for the size of the addition table (3-20): ");
		num_entries = userinput.nextInt();
		} while (num_entries > 20 || num_entries < 3);
		
		
		
		System.out.println("\nAddition Table of Numbers up to " + num_entries + ": \n");
		
		for (row = 0; row < num_entries + 1; row++)
		{
			for (column = 0; column < num_entries + 1; column++)
			{
				sum = row + column; 
				
				if (sum == 0) {System.out.print(" + ");}
				
				else System.out.format("%2d ", sum);
				
				
			} // End column loop
			
			System.out.println("\n");
			Thread.sleep(200);
			
		} // End row loop
		
		System.out.println("Program Ended.");

	} // End main line

} // End class
