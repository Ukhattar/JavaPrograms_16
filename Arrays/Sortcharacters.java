package Arrays;

import java.util.Arrays;

public class Sortcharacters {
    public static void main(String[] args) {

        String str = "java";
        char sortarray[] = str.toCharArray();
        Arrays.sort(sortarray);
        String s = new String(sortarray);
        System.out.println(s);

    }


}
