package Arrays;

public class ReverseWordsinaString {
    public static void main(String[] args) {
        //Input - Welcome To Java // Output //emocleW oT avaJ
        String str = "Welcome To Java";
        String words[] = str.split(" ");
        String reverseword = " ";
        for(String w: words)
        {
           // System.out.println(w);
          //  String reverseword = " ";
            for(int i = w.length()-1; i>=0;i--)
            {
              reverseword = reverseword + w.charAt(i);
            }
      //      reversestr = reversestr + reverseword;
        }
        System.out.println(reverseword);

    }

}
