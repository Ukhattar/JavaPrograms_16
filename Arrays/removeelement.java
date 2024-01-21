package Arrays;

import java.util.Arrays;

public class removeelement {
    public static void main(String[] args) {
        int[] originalarray = {4,3,6,7,8,0};
        int removele = 6;

        removeelement re = new removeelement();

        int[] NewArray = re.remove(originalarray,removele);
        System.out.println(Arrays.toString(NewArray));

    }

    public int[] remove(int[] array, int ele){
        int[] newarray = new int[array.length-1];
        int index = 0;
        for(int i =0;i<= array.length-1;i++)
        {
            if(array[i]!=ele)
            {
                newarray[index] = array[i];
                index++;
            }
        }
        return newarray;
    }

}


