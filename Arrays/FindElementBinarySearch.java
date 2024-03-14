package Arrays;

public class FindElementBinarySearch {
    public static void main(String[] args) {
        // prerequisite for binary search, elements should in sorted order
        // if key > mid  l = mid -1
        // if key < mid  h = mid -1
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 4;
        int l = 0;
        int h = a.length-1;
        boolean flag = false;
        while (l<=h) // this will run until lowervalue less than equals to igh value
        {
       int mid = (l+h)/2;
       if(a[mid] == key)
       {
           System.out.println("Element found");
           flag = true;
           break;
       }
       else if (a[mid] < key)
       {
           l = mid +1;
       }
       else
       {
           h = mid -1;
       }
        }
        if(flag == false)
        {
            System.out.println("Element not found: ");
        }

    }



}
