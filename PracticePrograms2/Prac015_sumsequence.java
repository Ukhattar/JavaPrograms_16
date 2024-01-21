package PracticePrograms2;

public class Prac015_sumsequence {
    public static void main(String[] args) {
        int sum = 0;
        // 1 *1 + 2*2
        for(int i =1;i<=5;i++)
        {
            sum = sum + (i*i);
        }
        System.out.println(sum);
    }
}
