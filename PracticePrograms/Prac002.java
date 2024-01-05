package PracticePrograms;

public class Prac002 {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Reverse a number using String Buffer: " + num);
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();
        System.out.println(rev);
       // System.out.println(sb.reverse());
    }
}
