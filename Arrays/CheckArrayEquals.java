package Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class CheckArrayEquals {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,3,4,5};


        //Approach 2: firstly compare length and if lemgth is equal compare elements
 boolean flag = true;
        if(arr1.length == arr2.length)
        {
            for(int i=0;i<=arr1.length-1;i++)
            {
               if(arr1[i] != arr2[i])
               {
                 flag = false;
                 break;
               }
              }
        }
        else
        {
            flag = false;
        }

if(flag == true)
{
    System.out.println("Arrays are equal");
}
else
{
    System.out.println("Arrays are not equal");
}

        //Approach 1 - There is Array.equals method, you have import Arrays class from java.util
        // and it is of boolean type
//        boolean status = Arrays.equals(arr1,arr2);
//        if(status == true)
//        {
//            System.out.println("Arrays are equal");
//        }
//        else
//        {
//            System.out.println("Arrays are not equal");
//        }

    }
}
