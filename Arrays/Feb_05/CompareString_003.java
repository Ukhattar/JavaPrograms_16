package Arrays.Feb_05;

import java.sql.SQLOutput;

public class CompareString_003 {
    public static void main(String[] args) {
        String s1 = "Urja";
        String s2 = "Uuja";
        boolean flag = true;
        if(s1.length() == s2.length()) {
            for (int i = 0; i < s1.length() - 1; i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    flag = false;
                }
            }
        }
        else
        {
            flag = false;
        }


        if(flag == true)
        {
            System.out.println("Both the Strings are equal");
        }
        else
        {
            System.out.println("Strings are not equal");
        }
    }
}
