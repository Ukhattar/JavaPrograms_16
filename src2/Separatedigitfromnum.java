package src2;

public class Separatedigitfromnum {
    public static void main(String[] args) {
//        int num =123;
//        while(num !=0)
//        {
//            System.out.println(num % 10);
//            num = num/10;
//        }
        //Count number of digit in a given number
        //input - 12345 o/p should be 5
        //num = num/10 used to take the last digit, take last digit and count it
//        int num = 127458;
//        int count =0;
//        while(num!=0)
//        {
//            num = num/10;
//            count ++;
//        }
//        System.out.println(count);
        //Program to find sum of each number
        //3456 = 3456 = 6
        //sum = sum +i // num%10 - to print last digit
        int sum =0;
        int num = 1111;
        while(num!=0)
        {
            sum =sum + (num%10);
            num = num/10;
        }
        System.out.println(sum);
   }
}

