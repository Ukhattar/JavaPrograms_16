package src2;

public class SumofArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int sum = 0;
        //indexing of array starts from a[0]
//        for(int i =0; i<=a.length-1;i++)
//        {
//            sum = sum + a[i];
//        }
//        System.out.println(sum);

        //extraordinary for loop
        for(int value: a)
        {
            sum = sum + value;
        }
        System.out.println(sum);
    }
}
