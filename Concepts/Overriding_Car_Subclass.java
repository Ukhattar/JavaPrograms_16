package Concepts;

public class Overriding_Car_Subclass extends Overriding_Vehicle {

    void run()
    {
        System.out.println("Car is Running");
    }
    public static void main(String[] args) {

        Overriding_Car_Subclass car = new Overriding_Car_Subclass();
        car.run();
    }
}
