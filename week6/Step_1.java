//Inheritance
//Inheritance supports (1) code reuse and (2) polymorphism.

// Superclass and subclass 
//1. A subclass inherits all the non-private members (methods and fields) of the superclass.


// Subclass (Child) inheriting from Animal
class Animal {
    int age;
    String name;

    Animal() {}
    
    Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass
class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}

public class Step_1 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Inherited method
        myDog.bark(); // Method from Dog class
    }
}
