package Arrays;

import java.util.Scanner;

public class CountthewordsinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Welcome to Java Program";
        int count = 1;
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) ==' ' && s.charAt(i + 1) != ' ')
            {
                count++;
            }
        }
        System.out.println("Number of words in a String are: "+count);
    }
}