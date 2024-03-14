package ArrayPractice;

public class DuplicateeleinString {
    public static void main(String[] args) {
        String[] str1 = {"java","C++","C","C++","python","java"};

        for(int i =0; i<=str1.length -1; i++) {//0
            for (int j = i + 1; j <= str1.length - 1; j++) //1,2,3,4
            {
                if (str1[i].equals(str1[j])) {
                    System.out.println("Duplicate Array: " + str1[i]);
                    //  break;
                }
            }


        }

    }

}
