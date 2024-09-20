//purpose: static and non-static members of a class in java
// read the code and try to undesrtand it
// what is the difference between static and non-static members of a class in java?
// create a static variable countCar that counts the number of car objects created
class Car {
    // Static variable: belongs to the class, not to any specific object
    static int numberOfWheels = 4;

    //your code here (define a static variable countCar)

    // Non-static variable: each Car object has its own color
    String color;
    String model;

    public Car() {
        //you code here
    }

    // Static method: belongs to the class, not to objects
    static void displayWheels() {
        System.out.println("All cars have " + numberOfWheels + " wheels.");
    }

    // Non-static method: belongs to an object, can access both static and non-static members
    void displayColor() {
        System.out.println("This car's color is " + color);
    }

    void displayModel() {
        System.out.println("This car's model is " + model);
    }
}

public class fourth_exercise {
    public static void main(String[] args) {
        // Access static method and variable without creating an object
        Car.displayWheels();

        // Create objects to access non-static members
        Car car1 = new Car();
        car1.color = "Red";
        car1.displayColor();
        car1.model = "Ford";
        car1.displayModel();

        Car car2 = new Car();
        car2.color = "Blue";
        car2.displayColor();
        car2.model = "Mazda";
        car2.displayModel();

        // your code here (for printng carCount)
    }
}