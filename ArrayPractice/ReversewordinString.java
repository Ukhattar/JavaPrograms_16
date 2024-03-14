package ArrayPractice;

public class ReversewordinString {
    public static void main(String[] args) {
        String s = "welcome to Java";
        String[] str = s.split(" ");
        String reverseword = " ";
        for (String word : str) {
            String reversestr = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversestr = reversestr + word.charAt(i);
            }
            reverseword = reverseword + reversestr;

        }
        System.out.println(reverseword);
    }
}
