package Concepts;

public class Overloading_PlusMethod {

    //Main method can be overload but JVM will read only the String array as arguments only, refer javatpoint tutorial
    //Compile Time polymorphism

  static int plusmethod(int x, int y)
  {
      return x + y;
  }
  static double plusmethod(double x, double y)
  {
      return x + y;
  }

    public static void main(String[] args) {
      int num = plusmethod(2,3);
      double num1 = plusmethod(2.4,3.4);
        System.out.println(num);
        System.out.println(num1);

    }
}
