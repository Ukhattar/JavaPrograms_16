package ArrayPractice;

public class LinearSearch {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8};
        int key =5;
        boolean flag = false;
        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i] == key)
            {
                System.out.println("Element found: "+key);
                flag = true;
                break;
            }
        }
        if(flag == false)
        {
            System.out.println("Element not found");
        }
    }
}
