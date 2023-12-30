package src2;

public class ForloopNumbers {
    public static void main(String[] args) {
        //print 1,10,2,9,3,8,4,7,5,6
        int j=10;
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
            System.out.println(j);
            j--;
        }
        //print table of 5
        System.out.println("Print table of 5");
        int num =5;
        for(int k=1;k<=10;k++)
        {
            System.out.println(num*k);
        }
    }
}
