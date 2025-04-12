package linecomparison;

import java.util.Scanner;

class LineComparison {

    public static void main(String[] args) {

        // Displaying a welcome message
        System.out.println("Welcome to Line Comparison Computation");

        Scanner sc = new Scanner(System.in);

        // taking the user input for length 1
        System.out.println("Enter x1 coordinate: ");
        int x1 = sc.nextInt();
        System.out.println("Enter y1 coordinate: ");
        int y1 = sc.nextInt();
        System.out.println("Enter x2 coordinate: ");
        int x2 = sc.nextInt();
        System.out.println("Enter y2 coordinate: ");
        int y2 = sc.nextInt();

        // taking the user input for length 2
        System.out.println("Enter a1 coordinate: ");
        int a1 = sc.nextInt();
        System.out.println("Enter b1 coordinate: ");
        int b1 = sc.nextInt();
        System.out.println("Enter a2 coordinate: ");
        int a2 = sc.nextInt();
        System.out.println("Enter b2 coordinate: ");
        int b2 = sc.nextInt();

        // calculating lengths
        Double lengthOfLine1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        Double lengthOfLine2 = Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));

        System.out.println("Length of Line 1: " + lengthOfLine1);
        System.out.println("Length of Line 2: " + lengthOfLine2);

        // using equals() method to compare
        if (lengthOfLine1.equals(lengthOfLine2)) {
            System.out.println("The lengths of the two lines are equal.");
        } else {
            System.out.println("The lengths of the two lines are not equal.");
        }

        sc.close();
    }
}
