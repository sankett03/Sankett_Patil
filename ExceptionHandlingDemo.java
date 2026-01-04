/*
 Program: Demonstration of Exception Handling
 Author : MCA Student
 Description: This program illustrates try, catch, finally, and multiple exceptions.
*/

import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Take input from user
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            // May cause ArithmeticException
            int result = a / b;
            System.out.println("Result of division = " + result);

            // Example of ArrayIndexOutOfBoundsException
            int arr[] = {10, 20, 30};
            System.out.println("Accessing 4th element: " + arr[3]);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (Exception e) {
            System.out.println("General Exception: " + e);
        } finally {
            // Always executes
            System.out.println("Finally block executed. Closing resources...");
        }

        System.out.println("Program continues after exception handling...");
        sc.close();
    }
}
