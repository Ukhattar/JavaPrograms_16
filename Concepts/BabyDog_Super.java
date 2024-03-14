package Concepts;

public class BabyDog_Super extends Dog{

    BabyDog_Super()
    {
        System.out.println("I am deafult Baby Dog Constructor");
    }
    String colour = "Brown";

    void printcolour()
    {
        System.out.println("Colour of BabyDog is: "+colour);
       String DogColour = super.colour;
        System.out.println("Colour of Parent is: " +DogColour);
    }

    void eat()
    {
        System.out.println("My Dog Eats");
        //Parent method
        //Basically if my method is overridden and I want attain the parent method, there I can use super.ethodname

        super.eat();
    }


    public static void main(String[] args) {
        BabyDog_Super babydog = new BabyDog_Super();
        babydog.printcolour();
        babydog.eat();


    }
}

