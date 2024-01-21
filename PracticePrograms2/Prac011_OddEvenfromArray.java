package PracticePrograms2;

public class Prac011_OddEvenfromArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,8,6};
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i] % 2 ==0)
            {
                System.out.println("number is even" +a[i]);
            }
            else
            {
                System.out.println("number is odd" + a[i]);
            }
        }
    }
}
