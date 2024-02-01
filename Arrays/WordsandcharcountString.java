package Arrays;

public class WordsandcharcountString {
    public static void main(String[] args) {
        String name = "Hello Worldyth Urja";

        String[] words = name.split(" ");
        for(String str: words)
        {
           // char[] ca = str.toCharArray();
            int length = str.length();
            System.out.println(str + " length of characters: " + length);
        }
    }
}
