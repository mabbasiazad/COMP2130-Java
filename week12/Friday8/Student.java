//sample class - I'm going to save some objects of this class in a file
import java.io.Serializable;

class Student implements Serializable {
    String name;    
    double gpa;
    int studnetID;
    static int idGenerator = 0;


    public Student(String name, double gpa) {
        this.name = name;
        this.studnetID = ++idGenerator;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student [Student ID=" + studnetID + 
            ", Name=" + name + 
            ", GPA=" + gpa + "]";
    }
}