import java.util.Arrays;

/**
 * exercise_1
 */
public class One_Exercise_SearchSort {

    public static void main(String[] args) {
        //1. declare and create an array of type double and size 5
        //your code here
        double[] my_array = new double[5];

        //assign values to the array with index 0, 1, 2, 3, 4 
        //and values 1.1, 2.2, 3.3, 4.4, 5.5 respectively
        //your code here
        my_array[0] = 1.1;
        my_array[1] = 2.2;
        my_array[2] = 3.3;
        my_array[3] = 4.4;
        my_array[4] = 5.5;

        //print the array
        //your code here (use printArray method)
        System.out.println("my_array: double array");
        printArray(my_array);

        //2. declare and assign the array right after declaration with int values 1, 2, 3, 4, 5
        //your code here
        int[] my_array2 = {1, 2, 3, 4, 5};
        System.out.println("my_array2: int array");
        printArray(my_array2);

        //anonymous array
        System.out.println("Anonymous array");
        printArray(new int[]{1, 2, 3, 4, 5});

        //3.sorting an array
        int[] nums = {5, 4, 3, 7, 0, 2, 1, -1, 6};
        System.out.println("nums array before sorting");
        printArray(nums);
        //sort the array: use Arrays.sort method from java.util.Arrays
        Arrays.sort(nums);
        //your code here
        System.out.println("nums array after sorting");
        printArray(nums);

        //4. binary search
        //search for 3 in the array nums and print the index
        int index = Arrays.binarySearch(nums, 4);
        System.out.println("index of 4 " + index);
        //use Arrays.binarySearch method from java.util.Arrays

        System.out.println("print nums with toString method");
        System.out.println(Arrays.toString(nums));


    }


    private static void printArray(int[] nums) {
        System.out.print("[");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("]");
    }

    private static void printArray(double[] nums) {
        System.out.print("[");
        for (double num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("]");
    }
}