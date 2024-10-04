import java.util.Arrays;
import java.util.ArrayList;

public class listprog {

    public static void main(String[] args) {
        double[] nums = new double[3];
        nums[0] = 0;
        nums[1] = 10; 
        nums[2] = 20;

        System.out.println(nums[1]);

        System.out.println("Array: " + Arrays.toString(nums));

        // array  ==== arraylist
        ArrayList<Double> list = new ArrayList<Double>();
        list.add(34.7);
        list.add(45.6);
        list.add(98.0);


        System.out.println("List: " + list);
        list.remove(1);
        System.out.println("List: " + list);

        System.out.println(list.get(1));





  
    }
}
