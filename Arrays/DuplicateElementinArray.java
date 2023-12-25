package Arrays;

import java.util.HashSet;

public class DuplicateElementinArray {
    public static void main(String[] args) {
        //Aproach1
        //Using HashSet - It will consider only unique values
        boolean flag = false;
        String arr[] = {"Java","C++","C","Python","Java"};
        HashSet <String> langs = new HashSet();
//        System.out.println(langs.add("Java")); -- provide true
//        System.out.println(langs.add("Java")); -- it wll not add same element
//        System.out.println(langs); -- prints only one true value
        for(String l: arr)
        {
            if(langs.add(l)==false)
            {
                System.out.println("Array has an duplicate element:" + l);
                flag = true;
            }
        }
     if(flag == true)
     {
         System.out.println("Consist of duplicate element");
     }
     else
     {
         System.out.println("Not Duplicate");
     }

    }
}
