//import the Person class from the first_exercise
//creat an array of 5 objects from the Person class
//print the name attribute of objects in for loops

import first_exercise.Person;
/**
 * fifth_exercise
 */
public class fifth_exercise {

    public static void main(String[] args) {
        Person p0 = new Person("aa", 10);
        Person p1 = new Person("bb", 20);
        Person p2 = new Person("cc", 30);
        Person p3 = new Person("dd", 40);
        Person p4 = new Person("ee", 50);

        Person[] persons = new Person[5];
        persons[0] = p0;
        persons[1] = p1;
        persons[2] = p2;
        persons[3] = p3;
        persons[4] = p4;

        
        // System.out.println(persons[0].name);
        // System.out.println(persons[0].age);
        // persons[0].display();

        System.out.println("---------------------------");
        for (int i = 0 ; i < persons.length; i++){
            //System.out.println(persons[i].name);
            persons[i].display();
        }

        //comment: array persons should be full in this case 
        //error if I have null elements
        System.out.println("======================");
        for (Person person : persons){
            System.out.println(person.name);
        }
        
    }
}
