package Concepts;

public class Overriding_Vehicle {
    //Parent class
    //restricted modifiers can not be used, protected modifier will provide compile time error
    //main method can not be overridden because it is static
    // static methods can not be overridden, because they are inbound to class area
    //and it is a run time polymorphism in which object bounds to heap area
    //The method must have the same name and parameter as in the parent class

    void run()
    {
        System.out.println("Vehicle is running");
    }

}
