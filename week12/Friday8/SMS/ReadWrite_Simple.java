import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;




public class ReadWrite_Simple {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        Student s1 = new Student("John Doe", 3.8);
        System.out.println("Creation of Objects");
        System.out.println(s1.toString());

        Student s2 = new Student("Leo Tolstoy", 3.9);
        System.out.println(s2.toString());

        File file = new File("studentsdata.ser");

        //writing objects to file
        try(FileOutputStream f = new FileOutputStream(file);
            ObjectOutputStream o = new ObjectOutputStream(f)) {

            o.writeObject(s1);
            o.writeObject(s2);

        }


        //reading objects from file
        if(file.exists()) {
            try(FileInputStream fi = new FileInputStream(file);
                ObjectInputStream oi = new ObjectInputStream(fi)) {
                    
                Student st1 = (Student) oi.readObject();
                Student st2 = (Student) oi.readObject();

                System.out.println("Reading of Objects");
                System.out.println(st1.toString());
                System.out.println(st2.toString());
            }
        }


        

    }


}