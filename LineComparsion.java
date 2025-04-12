package linecomparison;

import java.util.Scanner;

class LineComparison {

	public static void main(String[] args) {


		System.out.println("Welcome to Line Comparison Computation");

		Scanner sc = new Scanner(System.in);

		// Input for Line 1
		System.out.println("Enter coordinates for Line 1:");
		System.out.print("x1: ");
		int x1 = sc.nextInt();
		System.out.print("y1: ");
		int y1 = sc.nextInt();
		System.out.print("x2: ");
		int x2 = sc.nextInt();
		System.out.print("y2: ");
		int y2 = sc.nextInt();

		// Input for Line 2
		System.out.println("Enter coordinates for Line 2:");
		System.out.print("a1: ");
		int a1 = sc.nextInt();
		System.out.print("b1: ");
		int b1 = sc.nextInt();
		System.out.print("a2: ");
		int a2 = sc.nextInt();
		System.out.print("b2: ");
		int b2 = sc.nextInt();

		// Calculate lengths using Double for object comparison
		Double lengthLine1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		Double lengthLine2 = Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));

		System.out.println("Length of Line 1: " + lengthLine1);
		System.out.println("Length of Line 2: " + lengthLine2);

		// Compare lengths using compareTo
		int result = lengthLine1.compareTo(lengthLine2);

		if (result == 0) 
		{
			System.out.println("Both lines are equal in length.");
		} 
		else if (result > 0) 
		{
			System.out.println("Line 1 is longer than Line 2.");
		}
		else 
		{
			System.out.println("Line 1 is shorter than Line 2.");
		}

		sc.close();
	}
}
