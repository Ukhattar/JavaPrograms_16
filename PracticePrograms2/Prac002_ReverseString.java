package PracticePrograms2;

public class Prac002_ReverseString {
    public static void main(String[] args) {
        //ReverseString
        String name = "Urja";
        String reverse = " ";
//        char a[]= name.toCharArray();
//        for(int i =a.length-1;i>=0;i--)
//        {
//            reverse = reverse + a[i];
//        }
//        System.out.println(reverse);
        for (int i = name.length()-1;i>=0;i--)
        {
            reverse = reverse + name.charAt(i);
        }
        System.out.println(reverse);

    }
}
