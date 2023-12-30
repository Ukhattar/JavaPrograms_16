package src2;


import java.util.Random;

public class GenerateRandomNum {
    public static void main(String[] args) {
        Random random = new Random ();
        int num = random.nextInt(10);
        //print value between 0 to 9
        System.out.println(num);


    }
}
