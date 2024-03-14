package ArrayPractice;

import java.util.Arrays;

public class ReverseStringArray {
    public static void main(String[] args) {
        String s = "My name is Urja";
        String[] reversestring = s.split(" ");
        for(int i=reversestring.length-1;i>=0;i--)
        {
            System.out.println(reversestring[i]);
        }
    }
}
