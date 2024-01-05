package PracticePrograms;

public class Prac004 {
    public static void main(String[] args) {
        //Reverse a String
        // Input = Welcome To Java // Output = avaJ oT emocleW
        String str = "Welcome To Java";
        String rev = " ";
        // How Can I reverse it? by breaking the string into characters and then callout the reversed characters
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i); // rev = null + a // rev = a+j // rev = aj // and so on
        }
        System.out.println(rev);
    }
}

