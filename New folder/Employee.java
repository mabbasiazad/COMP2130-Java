import java.io.Serializable;

// Serializable interface make the class serializable that can be used
// for de/serialization of object from/to binary
public class Employee implements Serializable {

    static private int idGenerator;
    private int empID; // AutoIncrement and set from zero
    private String empName;
    private double empSalary;

    public static void setIdGenerator(int idGenerator) {
        Employee.idGenerator = idGenerator;
    }

    public Employee(String empName, double empSalary) {
        this.empName = empName;
        this.empSalary = empSalary;
        this.empID = ++idGenerator;

    }

    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }
}
