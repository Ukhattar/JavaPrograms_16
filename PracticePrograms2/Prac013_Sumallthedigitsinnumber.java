package PracticePrograms2;

public class Prac013_Sumallthedigitsinnumber {
    public static void main(String[] args) {
        int num = 1234;
        int sum =0;
        while(num!=0)
        {
            //sum = sum +i // last digit = num %10
            sum = sum + num%10 ;
            num = num/10;
        }
        System.out.println(sum);
    }
}
