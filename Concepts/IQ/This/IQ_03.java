package Concepts.IQ.This;

public class IQ_03 {
    //Constructorchaining using this keyword
    int age,id;
    String name, address;
    IQ_03(int age)
    {
        this.age = age;
    }

    IQ_03(int age, int id)
    {
        this(age);
        this.id = id;

    }
    IQ_03(int age, int id, String name)
    {
        this(age,id);
        this.name = name;
    }

    IQ_03(int age, int id, String name, String address)
    {
        this(age,id,name);
        this.address = address;
    }

    public void displaydetails()
    {
        System.out.println(this.id + " " + " "+ this.age + " "+ this.name +" "+ this.address);
    }

    public static void main(String[] args) {
        IQ_03 iq03 = new IQ_03(24,01,"Urja","Palwal");
        iq03.displaydetails();
        IQ_03 iq031 = new IQ_03(25,0, "Mritunjay");
        iq031.displaydetails();
    }


}
