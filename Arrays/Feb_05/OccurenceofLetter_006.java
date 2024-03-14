package Arrays.Feb_05;

import java.util.HashMap;
import java.util.Map;

public class OccurenceofLetter_006 {
    public static void main(String[] args) {
        String s = "Banana";

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length()-1;i++)
        {
            char c = s.charAt(i);
            Integer occurence = map.get(c);

            if(occurence==null)
            {
                map.put(c,1);
            }
            else
            {
                map.put(c,occurence+1);
            }
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            System.out.println("Character: "+entry.getKey());
            System.out.println("Frequency: " +entry.getValue());
        }
    }

}
