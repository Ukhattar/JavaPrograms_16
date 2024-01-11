package PracticePrograms2;

public class Prac003_ArmstrongNumber {
    public static void main(String[] args) {
        int num = 371;
        int sum = 0;
        int temp = num;
        while (num != 0) {
            sum = sum + ((num % 10) * (num % 10) * (num % 10));
            num = num / 10;
        }
        if (temp == sum) {
            System.out.println("Armstrong Number");
            System.out.println(sum);
        }
        else {
            System.out.println("not Armstrong");
        }
    }
}
