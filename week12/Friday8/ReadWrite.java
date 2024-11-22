import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ReadWrite {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        ArrayList<Student> studentList = new ArrayList<>();

        Student s1 = new Student("John", 3.5);
        Student s2 = new Student("Jane", 3.7);
        Student s3 = new Student("Bob", 3.9);

        System.out.println("Print after creating objects");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        //three steps to prepare to write objects to a file
        File file = new File("studentsdata.ser");
        
        //resource management
        save(file, studentList);


        ArrayList<Student> studnetList = load(file);
        System.out.println("\nPrint after reading objects");
        for (Student student : studnetList) {
            System.out.println(student);
        }

        Student newStudent = new Student("John", 3.5);

        System.out.println(newStudent);
                   
       
        
    }

    public static void save(File file, ArrayList<Student> studentList) throws FileNotFoundException, IOException {
        try (FileOutputStream f = new FileOutputStream(file); ObjectOutputStream o = new ObjectOutputStream(f)) {
            //write objects to file
            o.writeObject(studentList);

        }
    }

    public static ArrayList<Student> load(File file) throws FileNotFoundException, IOException, ClassNotFoundException{
        if (file.exists()) {
            try (FileInputStream fi = new FileInputStream(file); ObjectInputStream oi = new ObjectInputStream(fi)) {
                
                ArrayList<Student> studnetList = (ArrayList<Student>) oi.readObject();

                Student.idGenerator = studnetList.size();

                return studnetList;


            }
        } else {
            System.out.println("File does not exist");
            Student.idGenerator = 0;
            return new ArrayList<Student>();
        }
    }
    
}
