package Arrays;

public class RemoveSpecialcharfromString {
    public static void main(String[] args) {
        String s = "$!@&^!#*()**@!&@!* (@*(_!@#)_     &^    aadgey bd23hff sv";
        //s.replaceall is a function to replace characters// regex is used
        //alphanumeic is replaced with null
      //  s = s.replaceAll("[a-zA-Z0-9]","");
        System.out.println(s);

        // to ignore special characters and print alphanumeric

//       s = s.replaceAll("[^a-zA-Z0-9]","");
//        System.out.println(s);
        //remove white space in string
        s = s.replaceAll("\\s", "");
        System.out.println(s);
    }
}

