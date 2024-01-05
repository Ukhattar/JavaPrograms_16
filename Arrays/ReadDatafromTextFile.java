package Arrays;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadDatafromTextFile {
    public static void main(String[] args) throws FileNotFoundException {
        //Approach 1
        File file = new File("C:\\Users\\cci\\Test.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }

    }
}
