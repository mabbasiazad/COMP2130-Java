//import the Person class from the first_exercise
//creat an array of 5 objects from the Person class
//print the name attribute of objects in for loops
/**
 * fifth_exercise
 */
import first_exercise.Person;
public class fifth_exercise {

    public static void main(String[] args) {
        Person p0 = new Person("John", 10);
        Person p1 = new Person("Doe", 20);
        Person p2 = new Person("Sarah", 30);
        Person p3 = new Person("Mehdi", 40);
        Person p4 = new Person("Alex", 50);

        Person[] persons = new Person[5];
        persons[0] = p0;
        persons[1] = p1;
        persons[2] = p2;
        persons[3] = p3;
        persons[4] = p4;

        for (Person person : persons) {
            System.out.println(person.name);
        }
    }
}