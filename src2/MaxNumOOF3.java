package src2;

public class MaxNumOOF3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 240;
        int c = 30;
        if(a>b && a>c)
        {
            System.out.println("Greater number is a: "+a );
        }
        else if(b>c)
        {
            System.out.println("Greater number is b:" +b);
        }
        else
        {
            System.out.println("Greater number is c:" +c);
        }

        //print 1 to 10
        System.out.println("Counting of number from 1 to 10 using for loop");
        for(int i=1; i<=10;i++)
        {
            System.out.println(i);
        }
        //using while loop
        System.out.println("Counting of number from 1 to 10 using while loop");
        int s=1;
        while(s<=10)
        {
            System.out.println(s);
            s++;
        }
        //print even numbers only upto 10
        System.out.println("Even numbers");
        int num;
        for(int j =1; j<=10;j++)
        {
            if(j%2==0)
            {
                System.out.println(j);
            }
        }
        //print number 1 to 50 divisble by 5 and 3
        for(int k=1;k<=50;k++)
        {
            if(k%5==0 && k%3==0)
                System.out.println(k);
        }

    }
}
