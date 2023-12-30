package src2;
public class CountEvenOddinDigit {
    public static void main(String[] args) {
        int num = 653408;
        int counteven = 0;
        int countodd = 0;
        int lastnum;
        while(num>0)
        {
           lastnum =  num%10;
           if (lastnum%2==0)
           {
               counteven++;
           }
           else
           {
               countodd++;
           }
           num = num/10;
        }
        System.out.println("Count of Even Numbers in a digit: "+ counteven);
        System.out.println("Count of Odd Numbers in a digit: "+ countodd);
    }
}
