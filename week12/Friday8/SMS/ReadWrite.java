import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;



public class ReadWrite {

    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        ArrayList<Student> students = new ArrayList<>();
        
        Student s1 = new Student("John Doe", 3.8);
        System.out.println("Creation of Objects");
        System.out.println(s1.toString());
        students.add(s1);

        Student s2 = new Student("Leo Tolstoy", 3.9);
        System.out.println(s2.toString());
        students.add(s2);

        File file = new File("studentsdata.ser");

        //writing objects to file
        save(file, students);

        ArrayList<Student> stus = load(file);

        System.out.println("Reading of Objects");

        if (stus == null) {
            System.out.println("Students list is empty");
        }
        else{
            for (Student s : stus) {
                System.out.println(s.toString());
            }
        }        
    }

    public static void save(File file, ArrayList<Student> students) throws FileNotFoundException, IOException {
        
        try(FileOutputStream f = new FileOutputStream(file);
            ObjectOutputStream o = new ObjectOutputStream(f)) {

            o.writeObject(students);


        }
    }

    public static ArrayList<Student> load(File file) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        
        if(file.exists()) {
            try(FileInputStream fi = new FileInputStream("studentsdata.ser");
                ObjectInputStream oi = new ObjectInputStream(fi)) {
                
                ArrayList<Student> stus = (ArrayList<Student>) oi.readObject();                
                Student.idGenerator = stus.get(stus.size()-1).studnetID;
                return stus;
            }
        } 
        else {
            Student.idGenerator = 0;
            System.out.println("File does not exist");
        }
        
        return new ArrayList<Student>();
    }


}