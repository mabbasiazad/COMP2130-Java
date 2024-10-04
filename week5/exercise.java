import java.util.Arrays;
import java.util.ArrayList;

public class exercise {

    public static void main(String[] args) {
        
        double[] nums = {1, 4, 6, 3, 7, 8};
        //iteration through 1D array
        for(double elem : nums) {
            System.out.println(elem);
        }
        
        double[][] infos = {{80, 1.6}, {92, 1.7}, {88, 1.75}, {50, 1.6}}; //Array of arrays


        ArrayList<Double> person1 = new  ArrayList<Double>();
        person1.add(80.0);
        person1.add(1.6);
        //[80, 1.6]

        ArrayList<Double> person2 = new  ArrayList<Double>();
        person2.add(92.0);
        person2.add(1.7);

        ArrayList<Double> person3 = new  ArrayList<Double>();
        person3.add(88.0);
        person3.add(1.75);

        ArrayList<Double> person4 = new  ArrayList<Double>();
        person4.add(50.0);
        person4.add(1.6);

        //[[80, 1.6], [92, 1.7], [88, 1.75], [50, 1.6]] //list of list
        ArrayList<ArrayList<Double>> infos_list = new ArrayList<ArrayList<Double>>();
        infos_list.add(person1);
        infos_list.add(person2);
        infos_list.add(person3);
        infos_list.add(person4);

        System.out.println("Infos list printing: " + infos_list);

        for(ArrayList<Double> elem : infos_list){
            System.out.println("this is an elem of list: " + elem);
        }





        //print this 2D array
        System.err.println(Arrays.toString(infos));

        // iterate through 2D array
        for(double[] elem: infos){
            System.out.println(Arrays.toString(elem));
        }

        ArrayList<Double> BMIs = new ArrayList<Double>();

        double bmi;

    
        for(double[] elem: infos) {
            bmi = elem[0] / (elem[1] * elem[1]);
            BMIs.add(bmi);
        }

        System.out.println(BMIs);

        ArrayList<Integer> classes = new ArrayList<Integer>();
        int cls;

        for(double elem : BMIs){
            if (elem < 18.5) {
                cls = 0;
            } else if (elem >= 18.5 && elem < 24.9 ){
                cls = 1;
            } else if (elem > 25 && elem < 29.9) {
                cls = 2;
            }else {
                cls = 3;
            }

            classes.add(cls);


        }

        System.out.println(classes);
        
    }
}
