package myCodes;
//Generic Classes - ArrayList
// DRY =

// Generics + Inheritence = Polymorphism (OOPs)
class PrintInteger{

    public void print(int n) {
        System.out.println(n);
    }
}

class PrintDouble{

    public void print(double n) {
        System.out.println(n);
    }
}

class PrintString{

    public void print(String n) {
        System.out.println(n);
    }
}

class Print <T> {
    public void print(T n){
        System.out.println(n);
    }
}

public class friday10 {
    public static void main(String[] args) {
        PrintInteger p1 = new PrintInteger();
        PrintDouble p2 = new PrintDouble();
        PrintString p3 = new PrintString(); 

        p1.print(10);
        p2.print(10.4);
        p3.print("Hi Java");

        Print<Integer> p4 = new Print<Integer>();
        p4.print(3);

        Print<String> p5 = new Print<String>();
        p5.print("Java Programming");
    }
}
