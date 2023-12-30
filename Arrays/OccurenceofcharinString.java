package Arrays;

public class OccurenceofcharinString {
    public static void main(String[] args) {
        String str = "Java Programming Automation";
        int total_len = str.length();
       // System.out.println(total_len);
        str = str.replace("a","");
        int removechar_len = str.length();
        //System.out.println(removechar_len);
        //Occurence of a character in an array represented by total len-removed a length
        int result = total_len - removechar_len;
        System.out.println("Occurence of character 'a' in a string is: "  + result);

    }
}
