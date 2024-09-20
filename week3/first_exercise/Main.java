
//create a main class that creates a person object (name: John, age: 30) 
// and get access to the attributes using the dot operator
// and calls the display() method

package first_exercise;
public class Main {
    public static void main(String[] args) {
        //creat a new person object
        // creat an object called person_1 from the class called Person
        // instantiate of a class
        
        // Person person_1 = new Person();
        // person_1.name = "Ali";
        // person_1.age = 22;

        // person_1.display();

        // Person person_2 = new Person();
        // person_2.name = "Sara";
        // person_2.age = 24; 

        // person_2.display();

        Person person_3 = new Person("Alice", 28);
        person_3.display();
    }
}
