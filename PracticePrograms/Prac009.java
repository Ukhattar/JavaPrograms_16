package PracticePrograms;

public class Prac009 {
    public static void main(String[] args) {
        //Fibonacci Series
        //1,1,2,3,5,8
        //n1 = 0, n2 = 1, n3 = n1 + n2 = 0+1 =1
        int n1 = 0;
        int n2 = 1;
        int n3;
        int i = 0;
        System.out.println(n1);
        System.out.println(n2);
        while (i <= 10) {
            n3 = n1 + n2;
            System.out.println(n3);
            //n3 = 0+1 = 1
            n1 = n2; //
            n2 = n3;

            i++;
        }

    }

}
