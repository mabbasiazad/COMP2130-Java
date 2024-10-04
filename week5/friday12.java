
//Generc Class + Inheritence = Polymorphism
class Print <V> {
    public void print(V n){
        System.out.println(n);
    }
}

public class friday12 {
    public static void main(String[] args) {

        Print<Integer> p2 = new Print<Integer>();
        p2.print(37);

        Print<String> p3 = new Print<String>();
        p3.print("Hi Java");
        
    }
}
