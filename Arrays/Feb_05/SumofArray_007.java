package Arrays.Feb_05;

import java.util.Arrays;

public class SumofArray_007 {
    public static void main(String[] args) {
        int a[] = {2,3,4,5};
        int sum =0;
   // Approach1
        for(int i =0;i<=a.length-1;i++)
        {
            sum = sum + a[i];
        }
        System.out.println(sum);

        //Approach2

        System.out.println(Arrays.stream(a).sum());
    }

}
