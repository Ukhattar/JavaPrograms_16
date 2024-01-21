package Arrays;

public class ReversewordString {
    public static void main(String[] args) {
        String str = "Welcome To java Programing";
        String splitarray[] = str.split(" "); // splitarray - welcome,To,Java,programming
        for(int i = splitarray.length-1;i>=0;i--)
        {
            System.out.println(splitarray[i]);
        }
    }

}
