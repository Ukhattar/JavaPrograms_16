package PracticePrograms;

public class Prac005 {
    public static void main(String[] args) {
        //Reverse a String using a character array
        String str = "Java Programming";
        String rev = " ";
        // convert this string into character array
        char a [] = str.toCharArray();
        for(int i = str.length()-1;i>=0;i--)
        {
             rev=rev + a[i];
        }
        System.out.println(rev);
    }
}
