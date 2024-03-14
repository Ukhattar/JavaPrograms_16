package Concepts.IQ.This;

public class IQ_01 {

    static int i =10;
    public IQ_01() // Constructor
    {
        System.out.println("Constructor is called");
        System.out.println(this.i); // this keyword can be used to refer static variables, but this is
        //unnecessary to use static variables via OOPS concept, not a good practice
    }
    public static void main(String[] args) {

        IQ_01 test = new IQ_01();
    }
}
