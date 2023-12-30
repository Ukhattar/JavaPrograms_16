package src2;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        //program to write reverse a number
        int num = 6754;
        int rev = 0;
        while(num!=0)
        {
            rev = rev * 10 + num%10;
            num = num/10;

        }
        System.out.println("Reversed number is " +rev);

        //method 2 - using StringBuffer class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 4 or more digit number");
        int n1 = sc.nextInt();
//        StringBuffer str = new StringBuffer(String.valueOf(n1)); // n1 is now converted to string
//        StringBuffer reverse = str.reverse();
//        System.out.println(reverse);

        //method 3 - Using Stringbuilder class
        StringBuilder sb = new StringBuilder();
        sb.append(n1);
        System.out.println(sb.reverse());



    }
}
