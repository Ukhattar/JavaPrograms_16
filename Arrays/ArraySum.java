package Arrays;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        // I have sum the array elements
        int sum = 0;
        for(int i =0; i<=arr.length-1; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("Sum of elements in array is: " + sum);
    }
}
