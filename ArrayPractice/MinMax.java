package ArrayPractice;

public class MinMax {
    public static void main(String[] args) {

        int a[] = {6,2,3,4,56,3,1,45};
        int max = a[0];
        int min = a[0];

        for(int i =0; i<=a.length-1;i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }
        System.out.println("Maximum number is: " + max);

        for(int i =0; i<=a.length-1;i++)
        {
            if(a[i]<min)
            {
                min = a[i];
            }

        }
        System.out.println("Minimum number is: " + min);

    }
}
