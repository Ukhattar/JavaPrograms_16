package PracticePrograms2;

public class Prac0001 {
    public static void main(String[] args) {
        //Reverse a number
        //I/p = 3456 O/P = 6543
        int num = 3456;
        int rev = 0;
        while (num!=0)
        {
          rev = rev*10+num%10;
          num = num/10;
        }
        System.out.println(rev);
    }
}
