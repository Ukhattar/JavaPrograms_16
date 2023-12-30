package src2;

public class Sumof1To10 {
    public static void main(String[] args) {
//        //1+2+3+4+5---
//        int sum=0;
//        for(int i=1;i<=10;i++)
//        {
//         sum = sum +i;
//         //0 = 0+1 =1;
//        //1= 1+2 = 3;
//        //3 = 3+2 = 5;
//        }
//        System.out.println(sum);
//
//        System.out.println("Print sum of even number");
//        int summa = 0;
//        for (int j=0; j<=10;j++)
//        {
//            if(j%2==0)
//            {
//                summa = summa + j;
//            }
//        }
//        System.out.println(summa);

        //summation of 1+2-3+4+5-6+7+8-9+10
        //subtracting (summation of 3)
        int summa =0;
        int sum =0;
        for (int i=1;i<=10;i++)
        {
            if(i%3==0)
            {
                sum = sum - i;
            }
            else
            {
                sum = sum + i;
            }
        }
        System.out.println(sum);

        //print from 10 to 1
        for (int j=10;j>=1;j--)
        {
            System.out.println(j);
        }
        //print 5! = 5*4*3*2*1
        //sum = sum + i
        //mul = mul * i
        int mul =1;
        for (int k =5; k>=1;k--)
        {
            mul = mul * k;
        }
        System.out.println(mul);
    }
}
