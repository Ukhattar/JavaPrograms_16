package PracticePrograms2;

public class Prac014_sumsequence {
    // 1/2 + 2/3 + 3/4
    public static void main(String[] args) {
        float sum =0;
        for(int i =0;i<=8;i++)
        {
            sum = sum + (float) i/(i+1);
        }
        System.out.println(sum);
    }
}
