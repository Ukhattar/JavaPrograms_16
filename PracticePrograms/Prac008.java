package PracticePrograms;

import java.sql.SQLOutput;

public class Prac008 {
    public static void main(String[] args) {
        //Count Even and odd in a digit
        //I/p 345623458 O/P = Even Digits = 5 && Odd Digits = 4
        int num = 345623458;
        int counteven =0;
        int countodd = 0;
        while (num!=0)

        {
            if((num%10)%2==0)
            {
                counteven++;
            }
            else
            {
                countodd++;
            }
            num = num/10;
        }
        System.out.println("Even Digit Count: "+counteven);
        System.out.println("Odd Digit Count: " + countodd);
    }
}
