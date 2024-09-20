//purpose_1: privte and public members
//purpose_2: override toString() method

// Read the code 
//look at the modifications:
//1. toString() method is overridden
//2. make the age attribute private -  return the age attribute using a getAge() method
//2. private method validateAge() is added and used in the constructor to validate the age
//Answer the following question:
// Question: what is a private method? what is the purpose of a private method?

package third_exercise;

class Person_Modified {
    public String name;
    private int age;

    public Person_Modified(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        if (validateAge(age)) {
            System.out.println("The age is valid");
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getAge() {
        return age;
    }

    private boolean validateAge(int age) {
        return age >= 0 && age <= 120;  // Age must be between 0 and 120
    }

    @Override
    public String toString() {
        return "Person{name = " + name + "}";
    }
}
