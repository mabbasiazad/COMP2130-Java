import java.util.ArrayList;

public class exercise {
    public static void main(String[] args) {
        double[][] info = {{80, 1.6}, {92, 1.7}, {88, 1.75}, {50, 1.6}};

        ArrayList<Double> BMIs = new ArrayList<Double>();

        double BMI;
        for (double[] person: info) {
            BMI = person[0] / (person[1] * person[1]);
            BMIs.add(BMI);
        }

        System.out.println(BMIs);
        //print BMIs list
    }
}
