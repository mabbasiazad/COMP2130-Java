public class Five_Exercise_CalculateGPA {
 public static void main(String[] args) {
    // we want to calculate the gpa of a student based on the credits
    int[] courseMarks = {90, 87, 65, 78};
    int[] credits = {3, 4, 2, 3};

   double gpa = 0.0;
   int totalCredits = 0;
   double totalWeightedMarks = 0.0;

    // use weighted average formula to calculate the gpa
    // gpa = (mark1*credit1 + mark2*credit2 + mark3*credit3 + mark4*credit4) / (credit1 + credit2 + credit3 + credit4)
    for (int i = 0; i < courseMarks.length; i++) {
        totalWeightedMarks += courseMarks[i] * credits[i];
        totalCredits += credits[i];
    }

   gpa = totalWeightedMarks / totalCredits;
   System.out.println("GPA: " + gpa);
 }   
}
