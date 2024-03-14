package ArrayPractice;

public class OddevenfromArr {
    public static void main(String[] args) {

        int a[] = {2,3,5,6,8,910,56,34,75};
// we can also use String builder to append the elements
        StringBuilder evenele = new StringBuilder();
        StringBuilder oddele = new StringBuilder();
        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i]%2==0)
            {
                evenele.append(a[i]).append(" ");
            }
            else
            {
                oddele.append(a[i]).append(" ");
            }
        }
        System.out.println("Even elements in array are: "+evenele);
        System.out.println("Odd elements in array are: "+oddele);
    }
}
