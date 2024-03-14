package Arrays.Feb_05;

public class Recurssive_String_002 {
    public static void main(String[] args) {
        System.out.println(recurssivestring("Sandy"));

    }
    public static String recurssivestring(String s) {

        if(s==null || s.length()<=1) {
            return s;
        }
        return recurssivestring(s.substring(1))+s.charAt(0);

    }
}
