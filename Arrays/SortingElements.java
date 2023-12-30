package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortingElements {
    public static void main(String[] args) {
        //Approach 1 using Arrays.sort
        int a[] = {10,30,60,20,40};
        System.out.println(Arrays.toString(a));
//        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));
        //Approach 2 using parallel sort
//        Arrays.parallelSort(a);
//        System.out.println(Arrays.toString(a));

        //Approach 3 - Reverse Array
        Integer b[] = {10,30,20,50,70,30};
        System.out.println(Arrays.toString(b));
        Arrays.sort(b, Collections.reverseOrder());
        System.out.println(Arrays.toString(b));



    }
}

