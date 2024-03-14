package Arrays.Feb_05;

import java.util.HashSet;

public class FindMissingNumberinArray005 {
    public static void main(String[] args) {
        Integer a[] = {0,2,5,6,7,8,9};
        missingnumber(a);

    }

    public static void missingnumber (Integer a[])
    {
        //Take the elements of array and put it in Hash Set
        HashSet<Integer> set = new HashSet<>();
        for(int num: a)
        {
            set.add(num); // all elements of a are now added to hashset
        }
        //iterate all elements from 0 to the length of array, and if set doesnot contains the element, print that

        int n = a.length+1;
        for(int i =0; i<n; i++)
        {
            if(!set.contains(i))
            {
                System.out.println(i);
            }
        }

    }
}
