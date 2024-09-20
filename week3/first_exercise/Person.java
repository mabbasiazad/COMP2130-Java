//purpose: create a class + private and public attributes
//exercise 1: create a class named Person with the following attributes:
//name: String
//age: int
//create a constructor that initializes the attributes
//create a method named display() that prints the name and age of the person

package first_exercise;
class Person {
    public String name;
    public int age;

    //your code here- user defined constructor
    Person(String specific_name, int specific_age){
        this.name = specific_name;
        this.age = specific_age;
    }
    public void display(){
        System.out.println("name: " + name + " age: " + age);
    }

}