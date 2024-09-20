
//create a main class that creates a person object (name: John, age: 30) 
// and get access to the attributes using the dot operator
// and calls the display() method

package first_exercise;
public class Main {
    public static void main(String[] args) {
        //creat a new person "object" from my "Class"
        // Person p1 = new Person();
        // p1.name = "Medi";
        // p1.age = 41;

        // p1.display();

        Person p2 = new Person("John", 50);
        p2.display();

        p2.age = 30;
        p2.display();


    }

}
