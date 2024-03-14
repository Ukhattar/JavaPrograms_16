package Arrays.Feb_05;

public class SplitaString_001 {
    public static void main(String[] args) {
    String s = "91-9896636916";
     String str[] = s.split("-");
     printstring(str , "using split method" );
    }

    public static void printstring(String str[], String approach)
    {
        System.out.println("Split the string: " + approach);
        for(String string : str)
        {
            System.out.println(string);
        }
    }
}
