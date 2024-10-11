class Person {
    String name;
    int age;

    // Constructor for Person class
    public Person(String name, int age) {
        this.name = name; // Initialize name
        this.age = age;   // Initialize age
        System.out.println("Person constructor called: " + name + ", Age: " + age);
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }
}

class Student extends Person {
    String major;

    // Constructor for Student class
    public Student(String name, int age, String major) {
        super(name, age); // Call the superclass constructor to initialize name and age
        this.major = major; // Initialize the major for the student
        System.out.println("Student constructor called: " + name + ", Major: " + major);
    }

    @Override 
    public void introduce() {
        super.introduce();
        System.out.println("I'm studying " + major);
    }

}

class Teacher extends Person {
    
    String subject;
    public Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void introduce(){
        super.introduce();
        System.out.println("I'm teaching " + subject);
    }
}

//creat a subclass for Teacher with `String subject` attribute
//teacher has a subject to teach
//your code here

public class Step_6 {
    public static void main(String[] args) {
        //create student name: "Alice", age: 20, major: "Computer Science" and call introduce;
        Student student =  new Student("Ali", 20, "Computer Science");
        student.introduce();

        Teacher teacher = new Teacher("Alex", 30, "Java");
        teacher.introduce();
    }
}
