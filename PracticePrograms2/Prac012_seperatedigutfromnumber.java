package PracticePrograms2;

public class Prac012_seperatedigutfromnumber {
    public static void main(String[] args) {
        int num = 34875;
        int digit;
        while(num!=0)
        {
            digit = num%10;
            num = num/10;
            System.out.print(digit);
        }

    }
}
