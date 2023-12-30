package src2;

public class SwapTwonumbers {
    public static void main(String[] args) {
        int a=10;
        int b = 20;
//        int c;
//        c=b;
//        b=a;
//        a=c;
//        System.out.println(a);
//        System.out.println(b);

        //swap two numbers without third variable
        a = a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
