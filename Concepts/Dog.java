package Concepts;

public class Dog {
    //Instance Variable
    int ageofdog;
    String nameofDog;

    Dog()
    {
        System.out.println("I am Urja's Dog");
    }
    //if i want to intialize object of dog with name and age, parameterized cons
    Dog(int age, String name)
    {
      //age dependes on the instance, therefore it must be declared as instance variable not a local variable
       this.ageofdog=age ;
       this.nameofDog =name;
    }
     void bark()
     {
         System.out.println(nameofDog + "of age" + ageofdog + "barks a lot");
     }

}
