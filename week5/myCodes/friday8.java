package myCodes;

class PrintInteger {
    public void print(int i) {
        System.out.println(i);
    }
}

class PrintDouble {
    public void print(double d) {
        System.out.println(d);
    }
}

class PrintString{
    public void print(String s){
        System.out.println(s);
    }

}

class Print <V> {
    public void print(V n) {
        System.out.println(n);
    }
}

public class friday8 {

    public static void main(String[] args) {

        Print<Integer> p4 = new Print<Integer>();
        p4.print(20);

        Print<String> p5 = new Print<String>();
        p5.print("Hi Prigramming");

        Print<Double> p6 = new Print<Double>();
        p6.print(30.5);
        
        // PrintInteger p1 = new PrintInteger();
        // p1.print(10);

        // PrintDouble p2 = new PrintDouble();
        // p2.print(10.5);

        // PrintString p3 = new PrintString();
        // p3.print("Hello Java");

        
    }
}