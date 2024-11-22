import java.io.Serializable;

class Student implements Serializable {
    String name;    
    double GPA;
    int studnetID;
    static int idGenerator = 0;


    public Student(String name, double GPA) {
        this.name = name;
        this.studnetID = ++idGenerator;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student [Student ID=" + studnetID + ", Name=" + name + ", GPA=" + GPA + "]";
    }
}