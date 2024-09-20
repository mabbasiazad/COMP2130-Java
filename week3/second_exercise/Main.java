//purpose: public class vs private class

package second_exercise;
// import the Person class from the first_exercise package 
//what happens?
//how can i make it work?

import first_exercise.Person;


public class Main {
    public static void main(String[] args) {
                //creat an object form imported calss
        Person person = new Person("Sarah", 29);
        person.display();
        //display the object
    }
}
