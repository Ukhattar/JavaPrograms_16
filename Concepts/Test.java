package Concepts;

public class Test {

    int test_a;
    int test_b;
     Test(int a, int b)
     {
this.test_a =a;
this.test_b=b;
     }

     void display()
     {
         System.out.println("Value of a: "+this.test_a+"Value of b: "+this.test_b);
     }

    public static void main(String[] args) {

         Test test = new Test(10,20);
         test.display();
    }



}
