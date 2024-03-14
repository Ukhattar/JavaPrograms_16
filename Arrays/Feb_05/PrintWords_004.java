package Arrays.Feb_05;

import java.util.Map;
import java.util.TreeMap;

public class PrintWords_004 {
    public static void main(String[] args) {
        PrintWords_004 p = new PrintWords_004();
        String str = "My Name is URJA KHATTAR!! YEAH bingo";
       p.getvowelcount(str);
       p.frequency(str);
    }

    public void getvowelcount(String s)
    {
        int wordcount =1;
        int vowelcount =0;
        int uppercount =0;


        for(int i =0;i< s.length();i++)
        {
            char c = s.charAt(i);

            switch(c)
            {
                case ' ':
                case '.':
                    wordcount++;
            }

            switch (c)
            {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelcount++;
            }
            if(c>=65 && c<=90)
            {
                uppercount++;
            }

        }
        System.out.println("Word Count: "+wordcount);
        System.out.println("Vowel Count: "+vowelcount);
        System.out.println("UpperCase Count: "+uppercount);
    }
 public void frequency(String str) {
            TreeMap<Character, Integer> map = new TreeMap<>();

            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                Integer frequency = map.get(currentChar);

                if (frequency == null) {
                    map.put(currentChar, 1);
                } else {
                    map.put(currentChar, frequency + 1);
                }
            }

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                System.out.println("Character: " + entry.getKey());
                System.out.println("Frequency: " + entry.getValue());
            }
        }
    }

