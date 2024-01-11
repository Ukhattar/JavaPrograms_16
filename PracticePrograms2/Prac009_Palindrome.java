package PracticePrograms2;

public class Prac009_Palindrome {
    public static void main(String[] args) {
        String name = "NAMAN";
        String temp = name;
        String rev = "";
//        char a[] = name.toCharArray();
//        for (int i = name.length() - 1; i >= 0; i--) {
//            rev = rev + a[i];
//        }
        for(int i = name.length() - 1; i >= 0; i--)
        {
            rev = rev + name.charAt(i);
        }

        if (rev.equals(temp)) {
            System.out.println("String is Palindrome");

        }
    }
}
