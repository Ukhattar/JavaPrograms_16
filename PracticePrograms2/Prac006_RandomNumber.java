package PracticePrograms2;

import java.util.Random;

public class Prac006_RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10);
        System.out.println(num);
    }
}
