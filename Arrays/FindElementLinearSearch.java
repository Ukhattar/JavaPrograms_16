package Arrays;

public class FindElementLinearSearch {
    public static void main(String[] args) {
        // find the elemnet using linear search
        int a[] = {10,20,50,40,30,20};
        int key = 60;
        boolean flag = false;
        for(int i =0;i<=a.length-1;i++) {
            if (a[i] == key) {
                System.out.println("Element fount at position: " + i);
                flag = true;
                break; // to find the element on first place
            }
        }
        if(flag == false)
        {
            System.out.println("Element not found");
        }
    }
}
