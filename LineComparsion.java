package linecomparison;

import java.util.Scanner;

class LineComparison 
{

    public static void main(String[] args) 
    {

        // Displaying a welcome message
    	 System.out.println("Welcome to Line Comparison Computation (Using OOP)");

         Scanner sc = new Scanner(System.in);

         // Read Line 1
         System.out.println("Enter coordinates for Line 1:");
         Point p1 = new Point(sc.nextInt(), sc.nextInt());
         Point p2 = new Point(sc.nextInt(), sc.nextInt());
         Line line1 = new Line(p1, p2);

         // Read Line 2
         System.out.println("Enter coordinates for Line 2:");
         Point q1 = new Point(sc.nextInt(), sc.nextInt());
         Point q2 = new Point(sc.nextInt(), sc.nextInt());
         Line line2 = new Line(q1, q2);

         // Display lengths
         System.out.println("Length of Line 1: " + line1.getLength());
         System.out.println("Length of Line 2: " + line2.getLength());

         // Check equality
         if (line1.equals(line2)) 
         {
             System.out.println("The two lines are equal in length.");
         }
         else 
         {
             System.out.println("The two lines are not equal in length.");
         }

         // Use compareTo to determine greater/smaller
         int result = line1.compareTo(line2);
         if (result == 0)
         {
             System.out.println("Line 1 is equal to Line 2.");
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
