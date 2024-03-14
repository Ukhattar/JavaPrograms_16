package ArrayPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDatafromTxt {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\cci\\Test.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }

    }
}
