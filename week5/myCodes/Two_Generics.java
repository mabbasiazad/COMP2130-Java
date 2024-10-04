package myCodes;
class Print <T> {
    public void print(T input){
        System.out.println(input);
    }
}

/**
 * Generics
 */
public class Two_Generics {

    public static void main(String[] args) {
        Print<Integer> printinteger = new Print<>();
        printinteger.print(10);

        Print<Double> printdouble = new Print<>();
        printdouble.print(10.5);

        Print<String> printstring = new Print<>();
        printstring.print("Hello World");
    }
}