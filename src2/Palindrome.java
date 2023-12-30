package src2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //first rev and check if it is palindrome
        //12321 - palindrome number
//        int num = 12321;
//        int rem = 0;
//        int temp = num;
//        while (num!=0)
//        {
//            rem = rem * 10 + num%10;//1 // 10 + 2 = 12 // 120+3 = 123 //1230+2=1232//12320+1=12321
//            num = num/10; //1232 // 123 //12//1//0
//        }
//        if(temp==rem)
//        {
//            System.out.println("No is Palindrome " + temp);
//        }
//        else
//        {
//            System.out.println("number is not Palidrome" + temp);
//        }
        //if string a palindrome or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String to check if it is palindrome or not");
        String str = sc.next();
        String reverse = "";
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        if (str.equals(reverse))
        {
            System.out.println("String is Palidrome " + str);
        }

        else
        {
            System.out.println("String is not a Palidrome" + str);
        }
    }
}


