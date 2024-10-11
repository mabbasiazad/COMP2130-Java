
// create two classes: Bird and Fish, which both extend the Animal class. 
// Add a method unique to each subclass (fly() for Bird and swim() for Fish).
//Instantiate Bird and Fish class inside Step_2 class and call the method from super/sub class
class Bird extends Animal {
    public void fly(){
        System.out.println("Birds fly");
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("\"The bird pecks at food.\"");
    }
}

class Fish extends Animal {
    public void swim() {
        System.out.println("Fish swim");
    }
}

public class Step_2 {
    public static void main(String[] args) {

        Bird bird = new Bird();
        Fish fish = new Fish();

        bird.fly();
        bird.eat();

        Animal bird_2 = new Bird();
        Animal fish_2 = new Fish();

        bird_2.eat();
        
        ((Bird) bird_2).fly();


    


        
    }
}
