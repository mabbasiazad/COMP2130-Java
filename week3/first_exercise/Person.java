//purpose: create a class 
//exercise 1: create a class named Person with the following attributes:
//name: String
//age: int
//create a constructor that initializes the attributes
//create a method named display() that prints the name and age of the person

package first_exercise;
public class Person {
    public String name;
    public int age;

    //write your code for constructor ???
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }

}