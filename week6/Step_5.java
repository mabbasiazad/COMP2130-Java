// Interface 
// you must implement all the methods in the interface
// you can use public, static, final attributes

// exercise: change the Vehicle form interface to Class and use extend it by Tesla

interface Vehicle {
    void start();
}

interface Electric {
    String VEHICLE_TYPE = "Electric Vehicle"; // This is a public static final attribute
    void charge();
}

class Tesla implements Vehicle, Electric {
    @Override
    public void start() {
        System.out.println("Tesla starts silently.");
    }

    @Override
    public void charge() {
        System.out.println("Tesla is charging.");
    }
}

public class Step_5 {
    public static void main(String[] args) {
        Tesla myTesla = new Tesla();
        myTesla.start();
        myTesla.charge();

        // Accessing the constant from the Vehicle interface
        System.out.println("Vehicle Type: " + Electric.VEHICLE_TYPE);
    }
}
