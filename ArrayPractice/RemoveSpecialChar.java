package ArrayPractice;

public class RemoveSpecialChar {
    public static void main(String[] args) {
        String s = "$!@&^!#*()**@!&@!* (@*(_!@#)_     &^    aadgey bd23hff sv";
        s= s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
    }
}
