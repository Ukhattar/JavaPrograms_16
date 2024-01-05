package PracticePrograms;

public class Prac007 {
    public static void main(String[] args) {
        //Armstrong number
        //153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        // seperate each digit, get cube, and then add
        int num = 256;
        int sum =0;
        int temp = num;
        while(num!=0)
        {
           sum = sum + (num % 10)* (num%10) * (num%10);
           num = num/10;
        }
        if(temp == sum)
        {
            System.out.println("Number is Armstrong" + temp);
        }
        else
        {
            System.out.println("Number is not Armstrong" + temp);
        }

    }
}
