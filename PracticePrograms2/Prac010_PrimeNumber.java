package PracticePrograms2;

public class Prac010_PrimeNumber {
    public static void main(String[] args) {
        //Number is prime when it is divisible by 1 or itself
        int num = 9;
        int count =0;
        for(int i =1;i<=num;i++)
        {
            if(num%i ==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("Number is Prime: "+ num);
        }
        else
        {
            System.out.println("Number is not prime: "+ num);
        }
    }
}
