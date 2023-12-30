package src2;

public class ReverseString {
    public static void main(String[] args) {
        //Reverse String
        //Just like we reverse number, we have to reverse String
        //There is charAt method used to take last character of string, take all characters and then add them
        String str = "URJA";
        String rev = "";
        //have to take last character from first -> for loop in decrement
        //As the indexing will start from 0, so length will go length-1 to 0
        for(int i = str.length()-1; i>=0;i--)
        {
            rev = rev + str.charAt(i); // charAt(3)// A
                                       // CharAT(2) // A + J = AJ
        }
        System.out.println(rev);

     //Using StringBuffer
        StringBuffer str1 = new StringBuffer(str);
        System.out.println(str1.reverse());

      //using Stringbuilder
      StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());

      //using character array -> convert string to char array
        String sum = "";
        char a[] = str.toCharArray(); // this method is used to store value in array
        //now iterate it using for loop in reverse and add the characters
        for (int i = a.length-1; i>=0;i--)
        {
            sum = sum + a[i];

        }
        System.out.println(sum);
    }
}
