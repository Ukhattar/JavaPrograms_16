package PracticePrograms;

public class Prac001 {
    public static void main(String[] args) {
        //Reverse a Number
        //I/P - 98546 O/P - 64589
        int n = 98546;
        System.out.println("Print reverse of a number: "+n);
        int rev= 0;
        while(n!=0) {
            rev = rev *10 + n%10;
            n = n/10;
        }
        System.out.println("Reverse of a number is: " + rev);
    }

}
