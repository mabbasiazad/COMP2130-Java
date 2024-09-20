
//create a main class that creates a person object (name: John, age: 30) 
// and get access to the attributes using the dot operator
// and calls the display() method

package first_exercise;
public class Main {
    public static void main(String[] args) {
        //creat a new person object
        // key word: new
        // class : blue print
        // object: specific for one case
        // Person p1 = new Person();
        // p1.name = "John";
        // p1.age = 25;

        // p1.display();

        Person p2 = new Person("John", 25);
        p2.display();

        p2.name = "Mehdi";
        p2.display();

    }

}
