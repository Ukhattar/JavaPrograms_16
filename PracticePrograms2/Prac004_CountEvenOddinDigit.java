package PracticePrograms2;

public class Prac004_CountEvenOddinDigit {
    public static void main(String[] args) {
        int num = 2378999;
        int last_digit;
        int counteven =0;
        int countodd = 0;

        while(num!=0)
        {
            last_digit = num % 10;
            if(last_digit%2==0)
            {
                counteven++;
            }
            else
            {
                countodd++;
            }
            num = num/10;
        }
        System.out.println("Number of even Digits are: " + counteven);
        System.out.println("Number of odd digits are: "+ countodd);
    }
}
