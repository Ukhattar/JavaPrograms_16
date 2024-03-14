package ArrayPractice;

import java.util.Arrays;

public class Removeelemntfromaaray {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6};
        int element = 2;

        int[] arrayafterremovingelement = newarray(array,element);
        System.out.println(Arrays.toString(arrayafterremovingelement));


    }

    public static int[] newarray(int[] array, int element)
    {
        int newarray1[] = new int[array.length-1];
        int index =0;

        for(int i =0;i<=array.length-1;i++)
        {
            if(array[i]!=element) {
                newarray1[index] = array[i];
                index++;
            }
        }
        return newarray1;
    }
}
