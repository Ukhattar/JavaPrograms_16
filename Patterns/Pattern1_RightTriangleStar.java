package Patterns;

public class Pattern1_RightTriangleStar {
    public static void main(String[] args) {
        //to print * pattern we require row and column and thus two loops, one for row and onr for column
        for(int i = 1; i<=4;i++) // 1 // 2
        {
            for(int j =1; j<=i;j++) //1 // 1 //
            {
                System.out.print("*"); //* at 11 // * at 21 and 22
            }
            System.out.println();
        }
    }
}
