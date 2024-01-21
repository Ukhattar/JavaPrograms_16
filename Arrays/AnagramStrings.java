package Arrays;

import java.util.Arrays;

public class AnagramStrings {
    public static void main(String[] args) {
        String str1 = "guava";
        String str2 = "java";
        boolean result;

       result = anagramcheck(str1,str2);
       if(result == true)
       {
           System.out.println("String is Anagram");
       }
       else
       {
           System.out.println("String is not Anagram");
       }

    }

    public static boolean anagramcheck(String str1, String str2)
    {
        char[] chararraystring1 = str1.toCharArray();
        char[] chararraystring2 = str2.toCharArray();
        Arrays.sort(chararraystring1);
        Arrays.sort(chararraystring2);
      return Arrays.equals(chararraystring1,chararraystring2);
    }
}
