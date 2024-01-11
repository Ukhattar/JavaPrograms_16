package PracticePrograms;

public class Prac014 {
    public static void main(String[] args) {
        boolean result = ispalindrome("namanrata");
        if(result == true)
        {
            System.out.println("String is Palindrome");
        }
        else
        {
            System.out.println("String is not Palindrome");
        }
    }

    public static boolean ispalindrome(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();

        return str.equalsIgnoreCase(reversed);
    }

}
