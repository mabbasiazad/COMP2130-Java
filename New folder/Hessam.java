import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

// Files ---> 1) Text Files
// Input/Output ----> Strings
// 2) Binary Files (00101010101)
// Arrays, Object...
// Serialization : Converting complex(any) data to binary sequence
// and store it in a file
// De-serialization : converting back the binary sequence to its
// original forms!
public class Hessam {

    static Scanner keyboad = new Scanner(System.in);
    static ArrayList<Employee> employeeList = new ArrayList<>(); // can hold list

    public static void save() throws IOException {
        // Save information on a file  using serialization
        // 1) converting the object into series of 00101001101001
        // 2) stream that sequence into a file
        // Create/Open file
        FileOutputStream fos = new FileOutputStream("employee.data");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(employeeList);
        /*
        oos.writeObject(4);
        oos.writeObject(new int[] {3, 4, 5,5});
        oos.writeObject(3.45);
        oos.writeObject(true);
        oos.writeObject(new Employee("dummy",0));

         */

        oos.flush();
        fos.close();


    }
    public static void load() throws IOException, ClassNotFoundException {
        //

        Path p = Paths.get("employee.data");

        if(Files.exists(p)) {

            FileInputStream fio = new FileInputStream("employee.data");
            ObjectInputStream fis = new ObjectInputStream(fio);
            employeeList = (ArrayList<Employee>) fis.readObject();

            Employee.setIdGenerator(
                    employeeList.get(
                            employeeList.size()-1).getEmpID());

            fio.close();
        }
        else{
            Employee.setIdGenerator(0);
        }


    }
    public static String menu(){
        System.out.println("----Employee Management System---");
        System.out.println("1 - Add Employee to system");
        System.out.println("2 - View All the employee");
        System.out.println("3 - Edit Specific Employee information");
        System.out.println("4 - Exit");
        return keyboad.nextLine();

    }
    private static void addEmployee() throws IOException {
        System.out.println("Enter the name of employee : ");
        String name = keyboad.nextLine();
        System.out.println("Enter the salary of employee : ");
        double salary = Double.parseDouble(keyboad.nextLine()); // ?
        Employee e = new Employee(name, salary);
        employeeList.add(e);
        System.out.print(e);
        System.out.println(" is added!");
        save();



    }
    private static void viewAllEmployee(){

        for (Employee e:employeeList) {
            System.out.println(e);

        }
    }
    private static void editEmployee() throws IOException {
        System.out.println("Enter the Employee ID: ");
        int id = Integer.parseInt(keyboad.nextLine());

        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmpID() == id){
                System.out.println("Employee Found! ");
                System.out.println(employeeList.get(i));
                System.out.println("Enter 1 for changing the name, 2 for changing Salary, 3 for both!");
                String input = keyboad.nextLine();
                if(input.equals("1")){
                    System.out.println("Enter the new name : ");
                    employeeList.get(i).setEmpName(keyboad.nextLine());
                }
                else if(input.equals("2")){
                    System.out.println("Enter the new Salary : ");
                    employeeList.get(i).setEmpSalary(Double.parseDouble(keyboad.nextLine()));
                }
                else if (input.equals("3")){
                    System.out.println("Enter the new name : ");
                    employeeList.get(i).setEmpName(keyboad.nextLine());
                    System.out.println("Enter the new Salary : ");
                    employeeList.get(i).setEmpSalary(Double.parseDouble(keyboad.nextLine()));

                }
                else{
                    System.out.println("Bad input! start over!");
                }
                save();

        }

        }






    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // run the program and handle possible errors and exceptions

        load();
        String choice;
       while (true){
           choice = menu();
           if (choice.equals("1")) addEmployee();
           else if (choice.equals("2")) viewAllEmployee();
           else if (choice.equals("3")) editEmployee();
           else if (choice.equals("4")) break;
           else System.out.println("Invalid Input!");

       }


    }


}