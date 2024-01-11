package PracticePrograms2;

public class Prac005_FibonacciSeries {
    public static void main(String[] args) {
        //Fibonacci series
        //0,1,1,2,3,5,8,13
        int n1 =0;
        int n2 = 1;
        int n3;
        int i =0 ;
        System.out.println(n1);
        System.out.println(n2);
        while (i<=5)
        {
           n3 = n2 + n1;
            System.out.println(n3);
           n1 = n2;
           n2 = n3;

           i++;
        }
    }
}
