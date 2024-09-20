//play with Person_Modified class
package third_exercise;

public class Main {
    public static void main(String[] args) {
        Person_Modified new_person = new Person_Modified("Mehdi", 20);
        System.out.println(new_person.getAge());  
        new_person.display();

        System.out.println();
        System.out.println(new_person);

    }
    
}
