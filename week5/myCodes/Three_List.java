package myCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_List {
    public static void main(String[] args) {
        //declaration and initialization
        String[] arr = new String[5];
        arr[0] = "Hello";
        arr[1] = "World";
        arr[2] = "Java";
        arr[3] = "Programming";
        arr[4] = "Language";

        String[] arr2 = {"Hello", "World", "Java", "Programming", "Language"};
        
        
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        List<String> list2 = new ArrayList<>(Arrays.asList("Hello", "World", "Java", "Programming", "Language"));

        
        //Get elements
        System.out.println("Print Array elements: ");
        System.out.println(arr[0]);
        System.out.println(arr2[0]);

        System.out.println("Print List elements: ");
        System.out.println(list.get(0));
        System.out.println(list2.get(0));

        //Get size
        System.out.println("Getting the size of the array and list: ");
        System.out.println(arr.length);
        System.out.println(list.size());

        //Set elements
        System.out.println("Setting elements in the array and list: ");
        arr[0] = "Hi";
        list.set(0, 30);
        System.out.println(arr[0]);
        System.out.println(list.get(0));

        //Remove elements
        // You cannot remove an item in array
        System.out.println("Removing elements in the list: ");
        list2.remove(0);
        System.out.println(list2.get(0));
        list2.remove("World");
        System.out.println(list2.get(0));

        //Print all elements
        System.out.println("Printing all elements in the array and list: ");
        System.out.println(Arrays.toString(arr));
        System.out.println(list);



    }
}
