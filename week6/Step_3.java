// //Override - polymorphism - super keyword

// I defined the super class Animal and supclass Dog in Step_1
class Cat extends Animal {
    
    String foodPreference; 
    Cat() {}

    //exercise you can use super here show how? remove duplication 
    Cat(int age, String name, String foodPreference) {
        super(age, name);
        this.foodPreference = foodPreference;
    }
    @Override
    public void eat() {
        super.eat();
        System.out.println("The cat " + name +  " eats cat food.");
    }

    public void sound(){
        System.out.println("The can makes mew sound");
    }
}


public class Step_3 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        
        Cat cat_2 = new Cat(4, "Tommy", "brandA");
        cat_2.eat();

    }
}

