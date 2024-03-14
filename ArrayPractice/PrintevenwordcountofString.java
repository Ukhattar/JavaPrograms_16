package ArrayPractice;

public class PrintevenwordcountofString {

    public static void main(String[] args) {
        String s = "Hi urja How are you?";
               String[] str= s.split(" ");
        for(int i=0;i<=str.length-1;i++)
        {
          if(str[i].length()%2==0)
          {
              System.out.println(str[i]);
          }
        }
    }
    }
