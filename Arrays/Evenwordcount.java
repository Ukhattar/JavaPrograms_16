package Arrays;

public class Evenwordcount {
    public static void main(String[] args) {
        String str = "Hell Word Count";
        for (String s : str.split(" "))
        {
            if (s.length()%2==0)
            {
                System.out.println(s);
            }
        }
    }
}
