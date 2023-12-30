package src2;

public class FibonacciSeries {
    public static void main(String[] args) {
        //0,1,1,2,3,5,8
        int n1 = 0;
        int n2 = 1;
        int sum = 0;
        System.out.print(n1 + ", ");
        System.out.print(n2 + ", ");
        for(int i =1;i<=7; i++)
        {
            sum = n1 + n2;
            System.out.print(sum + ", ");
            n1 = n2;
            n2 = sum;
        }

    }
}

