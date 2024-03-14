package ArrayPractice;

import java.util.Arrays;

public class SortcahracterinString {
    public static void main(String[] args) {
        String s = "java";
        char[] chararray = s.toCharArray();
        Arrays.sort(chararray);
        String str = new String(chararray);
        System.out.println(str);
    }
}
