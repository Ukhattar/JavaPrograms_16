package Patterns;

public class Pattern2_LeftTriangleStar {
    public static void main(String[] args) {
        //for spaces and then left triangle

        for(int i = 1; i<=4;i++)
        {
            //for space
            for(int j = 3;j>=i;j--)
            {
                System.out.print("  "); // print three times space
            }
            //first it prints space then star
            for(int k =1; k<=i;k++)
            {
                System.out.print("*"); // one time star
            }
            System.out.println();
        }
    }
}
