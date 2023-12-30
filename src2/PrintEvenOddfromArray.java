package src2;

public class PrintEvenOddfromArray {
    public static void main(String[] args) {
        int a[] = {1,3,2,5,4,8,9};
        for(int i =0;i<=a.length-1;i++) {
            if (a[i] % 2 == 0) {
                System.out.println("Even numbers are: " + a[i]);
            }
        }

//            if(a[i]%2==1)
//            {
//                System.out.println("Odd Numbers are: "+ a[i]);
//            }
//        }
    }
}
