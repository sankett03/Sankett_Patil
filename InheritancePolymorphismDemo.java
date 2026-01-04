// Base class (Parent class)
class Animal {
    // Method in parent class
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class (Child class) - Inheriting Animal
class Dog extends Animal {
    // Method Overriding - same method as parent but different behavior
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Another derived class (Child class)
class Cat extends Animal {
    // Method Overriding - provides its own version of sound()
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class InheritancePolymorphismDemo {
    public static void main(String[] args) {
        
        // Polymorphism Example:
        // Parent class reference pointing to child class object
        Animal a1 = new Dog();  
        Animal a2 = new Cat();  
        
        // Calls the overridden method from child classes (runtime polymorphism)
        a1.sound();  // Output: Dog barks
        a2.sound();  // Output: Cat meows

        // Normal object creation of parent class
        Animal generic = new Animal();
        generic.sound(); // Output: Animal makes a sound
    }
}
