package ArrayPractice;

public class SumofanArray {

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int sum = 0;
        for(int i=0;i<=a.length-1;i++)
        {
            sum = sum + a[i];
        }
        System.out.println("sum of an array is: "+sum);
    }
}
