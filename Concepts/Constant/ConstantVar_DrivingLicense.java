package Concepts.Constant;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ConstantVar_DrivingLicense {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int min_age = 18;

        int[] list = new int[5];
        System.out.println("Enter the ages");
        for(int i =0;i< list.length;i++)
        {
            list[i] = sc.nextInt();
        }
        System.out.println("Check whether the age is eligilble or not");

        for(int i = 0;i<list.length;i++)
        {
            if(list[i] > min_age)
            {
                System.out.println(list[i] +  "is elligilble");
            }
            else
            {
                System.out.println(list[i] + "is not eligilble");
            }
        }

    }
}
