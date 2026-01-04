// Demonstration of Inner Class and Static Fields
class OuterClass {
    
    // Static field (shared by all objects of OuterClass)
    static int objectCount = 0;

    // Constructor
    OuterClass() {
        objectCount++; // Increase count every time an object is created
    }

    // Inner class (non-static)
    class InnerClass {
        void displayMessage() {
            System.out.println("Hello from Inner Class!");
        }
    }

    // Method to show static field
    void showObjectCount() {
        System.out.println("Number of OuterClass objects created: " + objectCount);
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        
        // Create OuterClass objects
        OuterClass obj1 = new OuterClass();
        OuterClass obj2 = new OuterClass();

        // Access static field using method
        obj1.showObjectCount(); // Shows 2 because two objects created

        // Create InnerClass object
        OuterClass.InnerClass inner = obj1.new InnerClass();
        inner.displayMessage(); // Calling method of inner class
    }
}
