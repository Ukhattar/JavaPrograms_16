package Concepts.IQ.Super;

class Person{

    int id, age;
    String name;
    Person(int id, String name, int age)
    {
        this.id = id;
        this.name= name;
        this.age = age;
    }

}

class Employee extends Person {
    String address;

    Employee(int id, String name, int age, String address) {
        super(id,name,age);
        this.address = address;

    }
  void printdetails()
  {
      System.out.println(super.name + super.id + super.age + this.address);
  }
}


public class SuperChaning {
    public static void main(String[] args) {

        Employee employee = new Employee(213,"Urja", 35, "Palwal");
       employee.printdetails();

    }
}
