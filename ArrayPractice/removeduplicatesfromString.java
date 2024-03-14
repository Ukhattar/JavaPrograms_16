package ArrayPractice;

import java.util.HashSet;

public class removeduplicatesfromString {
    public static void main(String[] args) {

        String str = "programming language is java";


        removeduplicatesfromString re = new removeduplicatesfromString();
        System.out.println(re.removeduplicates(str));


    }

    public String removeduplicates(String str)
    {
        HashSet<Character> charset = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<=str.length()-1;i++)
        {
            char c = str.charAt(i);
            if(charset.add(c))
            {
                sb.append(c);
            }
        }
return sb.toString();
    }
}
