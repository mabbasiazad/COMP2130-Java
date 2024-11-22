import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class SMS {
    //your main list
    static ArrayList<Student> studentList = new ArrayList<>();
    static Scanner keyboard = new Scanner(System.in);
    static File file = new File("smsdata.ser");
    
    //method to add student
    public static void addStudent() throws FileNotFoundException, IOException {
        //code to add student
        System.out.println("Enter the name of student : ");
        String name = keyboard.nextLine();
        System.out.println("Enter the GPS of student : ");
        double gpa = Double.parseDouble(keyboard.nextLine()); // ?
        Student s = new Student(name, gpa);
        studentList.add(s);
        System.out.print(s);
        System.out.println(" is added!");
        ReadWrite.save(file, studentList);
    }


    //method to modify student information
    public static void editStudent() throws FileNotFoundException, IOException {
        //code to modify student information
        //ask for the id of the student and then change the name and gpa
        System.out.println("Enter the Student ID: ");
        int id = Integer.parseInt(keyboard.nextLine());

        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).studnetID == id){
                System.out.println("Employee Found! ");
                System.out.println("Enter the name of student : ");
                String name = keyboard.nextLine();
                System.out.println("Enter the GPS of student : ");
                double gpa = Double.parseDouble(keyboard.nextLine()); // ?
                studentList.get(i).name = name;
                studentList.get(i).GPA = gpa;
                System.out.println("Student information updated!");
                break;
            } 
        }    
            
        ReadWrite.save(file, studentList);        

    }

    public static void viewAllStudents() {
        //code to view all students
        for (Student s:studentList) {
            System.out.println(s);

        }
    }
    
    
    //method to view student list
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
        
        studentList = ReadWrite.load(file);
        String choice;
        
        while (true) {
            System.out.println("----Student Management System---");
            System.out.println("1 - Add Student to system");
            System.out.println("2 - View All the students");
            System.out.println("3 - Edit Specific student information");
            System.out.println("4 - Exit");

            choice = keyboard.nextLine();
            if (choice.equals("1")) {
                addStudent();
            }
            else if (choice.equals("2")) {
                viewAllStudents();
            }
            else if (choice.equals("3")) {
                editStudent();
            }
            else if (choice.equals("4")) {
                break;
            }
            else {
                System.out.println("Invalid Choice");
            }
        }
        
    }
}
