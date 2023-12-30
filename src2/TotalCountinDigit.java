package src2;

public class TotalCountinDigit {
    public static void main(String[] args) {
        int num = 456309;
        int count = 0;
        while(num!=0)
        {
            num = num/10;
            count++;
        }
        System.out.println(count);
    }
}
