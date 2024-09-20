//purpose: public class vs private class


package second_exercise;

import first_exercise.Person;

// import the Person class from the first_exercise package 
//what happens?
//how can i make it work?
// import first_exercise.Person;

public class Main {
    public static void main(String[] args) {
            //creat an object form imported calss
    Person person_3 = new Person("Alexis", 20);

    //display the object
    person_3.display();
    }
}
