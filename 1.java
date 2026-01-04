// Demonstration of Java Program Structure with Arithmetic and Logical Operators
class ProgramStructureDemo {

    // main method - entry point of the program
    public static void main(String[] args) {
        
        // Arithmetic implementation
        int a = 21, b = 7;   // variables
        int sum = a + b;     // addition
        int diff = a - b;    // subtraction
        int product = a * b; // multiplication
        int quotient = a / b; // division
        int remainder = a % b; // modulus

        System.out.println("Arithmetic Operations:");
        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + diff);
        System.out.println("a * b = " + product);
        System.out.println("a / b = " + quotient);
        System.out.println("a % b = " + remainder);

        // Logical implementation
        boolean condition1 = (a > b);     // true
        boolean condition2 = (a < 20);    // false

        System.out.println("\nLogical Operations:");
        System.out.println("a > b AND a < 20: " + (condition1 && condition2)); // AND
        System.out.println("a > b OR a < 20: " + (condition1 || condition2));  // OR
        System.out.println("NOT (a > b): " + (!condition1));                   // NOT
    }
}