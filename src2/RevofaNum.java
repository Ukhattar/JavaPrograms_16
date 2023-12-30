package src2;

public class RevofaNum {
    public static void main(String[] args) {
        int num = 87659834;
        int rev = 0;
        while(num!=0)
        {
           rev = rev *10 + num%10; // rev = 0 + 5 = 5// 50+6 = 56//56-
            num = num/10; // num = 876
        }
        System.out.println(rev);
    }
}
