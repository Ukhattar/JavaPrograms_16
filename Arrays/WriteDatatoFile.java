package Arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDatatoFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\cci\\Test.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hi, Welcome to the programming world");
        bw.write("Okay");
        System.out.println("Finished!!");
        bw.close();

    }
}
