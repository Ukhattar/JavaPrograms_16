package PracticePrograms;

import java.util.Random;

public class Prac010 {
    public static void main(String[] args) {
        //Generate Random Numbers
        Random random = new Random();
        int num = random.nextInt(100);
        System.out.println(num);
    }
}
