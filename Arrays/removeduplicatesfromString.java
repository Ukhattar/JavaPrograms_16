package Arrays;

import java.util.HashSet;

public class removeduplicatesfromString {
    public static void main(String[] args) {
        String str = "Programming";
        //O/p - Progamin
        System.out.println(removeduplicates(str));

    }

    public static String removeduplicates(String str){

        HashSet<Character> charSet = new HashSet<>();
        StringBuffer sb = new StringBuffer();

        for(int i =0;i<=str.length()-1;i++)
        {
            char c = str.charAt(i);
           if(charSet.add(c))
           {
               sb.append(c);
           }

        }


        return sb.toString();
    }

}
