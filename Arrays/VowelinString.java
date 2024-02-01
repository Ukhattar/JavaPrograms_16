package Arrays;

import java.util.Scanner;

public class VowelinString {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int count =0;

        char[] ca = name.toCharArray();

        for(char c : ca)
        {
            switch (c)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count ++;
                    break;

            }
        }
        System.out.println("Number of vowels available in String: "+ count);
    }
}
