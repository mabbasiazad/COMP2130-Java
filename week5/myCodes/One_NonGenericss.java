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

class PrintString {
    public void print(String s) {
        System.out.println(s);
    }
}

public class One_NonGenericss {
    public static void main(String[] args) {
        PrintInteger printinterger = new PrintInteger();
        printinterger.print(10);

        PrintDouble printdouble = new PrintDouble();
        printdouble.print(10.5);

        PrintString printstring = new PrintString();
        printstring.print("Hello World");
    }

}
