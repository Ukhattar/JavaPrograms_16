package ArrayPractice;

import java.util.HashSet;

public class DuplicateElementusingHashset {

    public static void main(String[] args) {

        String [] arr = {"Java", "C", "C++", "Python", "Java","C++"};
        HashSet<String> set = new HashSet<>(); // Hashset is empty

        for(String strarr:arr)
        {
            if(set.add(strarr) == false) //if it is false that means it cannot add elements in HashSet
            {
                System.out.println("Array is duplicate: "+strarr);
            }
        }

    }
}
