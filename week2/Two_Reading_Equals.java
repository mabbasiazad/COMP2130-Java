public class Two_Reading_Equals {
    public static void main(String[] args) {
    int a = 10;
    int b = 10;
    
    if(a == b){
        System.out.println("a and b are equal");
    }
    else{
        System.out.println("a and b are not equal");
    }

    // Note == operator is used to compare primitive data types:
    //boolean, byte, char, short, int, long, float, double
    System.out.println("String comparison with == operator");
    
    String str1 = "hello";
    String str2 = "hello";
    
    // == operator is not reliable for comparing strings/objects:
    //so the following comparison with == may not work as expected ALL the time
    if(str1 == str2){
        System.out.println("str1 and str2 are equal");
    }
    else{
        System.out.println("str1 and str2 are not equal");
    }

    //Note: use equals method to compare strings/objects
    System.out.println();
    System.out.println("String comparison with equals method");

    if(str1.equals(str2)){
        System.out.println("str1 and str2 are equal");
    }
    else{
        System.out.println("str1 and str2 are not equal");
    }
    }


}
