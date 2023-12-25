package Arrays;

public class FindMissinngElement {
    public static void main(String[] args) {
        //To find the missing elements, there are few pointers to keep in mind
        //Array should not contain duplicate values
        //Array no need to be in sorted order
        //Important: values should be in range

        int arr[] = {5,8,9,7};
        // doum sum of range - sum of arrays element provides you missing value
        int sum1 =0;
        int sum2 = 0;
         for(int i =0; i<=arr.length-1;i++)
         {
             sum1 = sum1 + arr[i];
         }

         for(int i = 5; i<=9;i++)
         {
             sum2 = sum2 + i;
         }
         int missing_element = sum2 - sum1;
        System.out.println("Missing element in Array is: "+missing_element);
    }
}
