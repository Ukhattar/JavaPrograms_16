package ArrayPractice;

public class FindmissingelementinArray {
    public static void main(String[] args) {
        int a[] = {3,5,6,7};
        int missingelement;
        int sum1= 0;
        int sum2= 0;
     for(int i =0; i<=a.length-1;i++)
     {
         sum1 = sum1 + a[i];
     }
     for(int i =3; i<=7;i++)
     {
         sum2 = sum2 + i;
     }
     missingelement = sum2 - sum1;
        System.out.println(missingelement);


    }
}
