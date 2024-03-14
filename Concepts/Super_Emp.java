package Concepts;

public class Super_Emp extends Super_Person{
    float salary;
    Super_Emp(int id, String name, float salary) {
        super(id, name);
        this.salary = salary;
    }

    void display()
    {
        System.out.println(name + id + salary);
    }
}
