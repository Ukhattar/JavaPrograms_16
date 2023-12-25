package Arrays;

public class MinMaxinArray {
    public static void main(String[] args) {
        int arr[] = {3,4,5,67,8,2};
        int max = arr[0];
        int min = arr[0];
        for (int i =0; i<=arr.length-1;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("Maximum number in Array is: " +max);
        for (int i =0; i<=arr.length-1;i++)
        {
            if(arr[i]<min)//1. 3 >3, 6>3, 2<3
            {
               min = arr[i];
            }
        }
        System.out.println("Minimum number in Array is: " +min);
    }
}
