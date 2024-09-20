//import the Person class from the first_exercise
//creat an array of 5 objects from the Person class
//print the name attribute of objects in for loops

/**
 * fifth_exercise
 */
import first_exercise.Person;
public class fifth_exercise {
    public static void main(String[] args) {
        //your code here
        Person p1 = new Person("John", 20);
        Person p2 = new Person("Sara", 21);
        Person p3 = new Person("Ben", 22);
        Person p4 = new Person("Ali", 23);
        Person p5 = new Person("Alice", 24);

        Person[] persons = new Person[5];
        persons[0] = p1;
        persons[1] = p2;
        persons[2] = p3;
        persons[3] = p4;
        persons[4] = p5;

        for (Person person : persons) {
            System.out.println(person.name);
            
        }

        
       
    }
    
} 