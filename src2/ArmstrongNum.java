package src2;

public class ArmstrongNum {
    public static void main(String[] args) {
        //Armstrong Number is 153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        // sum = sum +i
        // in place of i there will be while loop take last digit from num%10
        int num = 153;
        int temp = num;
        int sum =0;
        while (num!=0)
        {
            sum = sum + (num%10)*(num%10)*(num%10);
                    num = num/10;
        }
        System.out.println(sum);
        if(temp == sum)
        {
            System.out.println("This is an Armstrong number");
        }
        else
        {
            System.out.println("This is not an Armstrong number");
        }
    }
}
