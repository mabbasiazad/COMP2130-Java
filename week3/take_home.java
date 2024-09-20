class Person_ {
    private String name;
    private int birthYear;
    public static int currentYear = 2024;

    // Constructor to initialize the person's name and birth year
    public Person_(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    // Public method: Introduce the person
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + calculateAge() + " years old.");
    }

    // Private method: Calculate the age based on birth year
    private int calculateAge() {
        return currentYear - birthYear;
    }
}

public class take_home {
    public static void main(String[] args) {
        // Create a new Person object
        Person_ person = new Person_("John", 1990);

        // Call the public method introduce, which internally uses the private method
        person.introduce();


        //change the current year and call the introduce method again
        //your code here
    }
}