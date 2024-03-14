package ArrayPractice;

import java.util.Scanner;

public class CountthewordsinString {
    public static void main(String[] args) {
        String name = "Welcome to Java Programming";
        int count =0;

        if(!name.isEmpty())
        {
            count++;
        }

        for(int i =0; i< name.length()-1; i++)
        {
            if(name.charAt(i) ==' ' && name.charAt(i+1)!=' ')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
