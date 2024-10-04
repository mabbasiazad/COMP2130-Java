
import java.util.ArrayList;
import java.util.Arrays;
public class listprog {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 0;
        nums[1] = 10; 
        nums[2] = 30; 
        nums[3] = 40;
        nums[4] = 100;

        System.out.println(Arrays.toString(nums));

        ArrayList<Integer> list = new ArrayList<Integer>(); 
        list.add(10);

        System.out.println(list);

        list.add(30);
        list.add(50);
        list.add(58);

        System.out.println("The list before removing the 0th element");
        System.out.println(list);

        System.out.println("The list after removing the 0th element");
        list.remove(0);
        System.out.println(list);

        ArrayList<String> list_string = new  ArrayList<String>();
        list_string.add("Hi");
        list_string.add("Java");
        list_string.add("Programming");

        System.out.println(list_string);

        //pass both index or the name of string
        list_string.remove("Java");
        System.out.println(list_string);




    }
}
