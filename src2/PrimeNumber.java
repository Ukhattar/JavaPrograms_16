package src2;

public class PrimeNumber {
    public static void main(String[] args) {
//        //prime number 2,3,5,7,11 -- divisor 1, same number , only two divisor should be there
//        int num =11;
//        int count = 0;
//        //I need to check if it is divided by 1,2,3,4,5,6,7
//        for(int i=1;i<=num;i++)
//        {
//            if(num%i==0)
//            {
//                count ++;
//            }
//        }
//        if(count ==2)
//        {
//            System.out.println("Number is prime: "+ num);
//        }
//        else
//        {
//            System.out.println("number is not prime");
//        }
        //Print divisor of number
        int num =6;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.println(i);
            }
        }
    }
}
