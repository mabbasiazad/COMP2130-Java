import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadWriteSimple {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1 = new Student("John", 3.5);
        Student s2 = new Student("Jane", 3.7);
        Student s3 = new Student("Bob", 3.9);

        System.out.println("Print after creating objects");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //three steps to prepare to write objects to a file
        File file = new File("studentsdata.ser");
        
        //resource management
        try (FileOutputStream f = new FileOutputStream(file); ObjectOutputStream o = new ObjectOutputStream(f)) {
            //write objects to file
            o.writeObject(s1);
            o.writeObject(s2);
            o.writeObject(s3);
        }
                    

        try (FileInputStream fi = new FileInputStream(file); ObjectInputStream oi = new ObjectInputStream(fi)) {
            Student s1_read = (Student) oi.readObject();
            Student s2_read = (Student) oi.readObject();
            Student s3_read = (Student) oi.readObject();

            System.out.println("\nPrint after reading objects");
            System.out.println(s1_read);
            System.out.println(s2_read);
            System.out.println(s3_read);

        }






    



        
    }
    
}
