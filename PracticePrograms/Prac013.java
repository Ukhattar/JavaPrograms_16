package PracticePrograms;

public class Prac013 {
    public static void main(String[] args) {
        //Palindrome number
        int num = 136318;
        int temp = num;
        int rev = 0;
        while (num!=0)
        {
            rev = rev * 10 + (num%10);
            num = num/10;
        }
        if (temp == rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }
}


