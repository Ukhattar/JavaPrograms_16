package Concepts;

import java.lang.reflect.Constructor;

public class Contructor {

    //default constructor
    String name;
    Contructor()
    {
        System.out.println("I am default constructor");
    }
    Contructor(String n)
    {
       this.name = n;
        System.out.println("Hi, I am parameterized constructor: " + n);
    }

    public static void main(String[] args) {
        //Constructor used to intialize object, wherenver the object is created, constructor called automatically
        // invokation is not required
        //same name as class name but no returntype, no access specifier is required(final,static)
        //it can have the access modifier
        //https://www.edureka.co/blog/constructor-in-java/#whatisaconstructor
        Contructor c = new Contructor();
        Contructor cs = new Contructor("urja");


    }
}
