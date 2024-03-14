package ArrayPractice;

public class OccurenceofcharString {
    public static void main(String[] args) {
        String str = "Programmingggg";
        String str1= str.replace("g","");
        int resulatntlength = str.length() - str1.length();
        System.out.println("Occurence of char g is :" + resulatntlength);
    }
}
