package ArrayPractice;

import java.sql.SQLOutput;
import java.util.Arrays;

public class AnagramStringcheck {

    public static void main(String[] args) {
        String str1 = "Urja";
        String str2 = "ajur";
        boolean result;
        result = anagramcheck(str1,str2);

            if(result == true)
            {
                System.out.println("String is anagram");
            }
            else
            {
                System.out.println("String is not an anagram");
            }



    }

    public static boolean anagramcheck(String str1, String str2) {
        //convert both strings in lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();


        //converting String to characterArray
        char[] chartostring1 = str1.toCharArray();
        char[] chartostring2 = str2.toCharArray();

        Arrays.sort(chartostring1);
        Arrays.sort(chartostring2);

       return Arrays.equals(chartostring1,chartostring2);

    }
}



