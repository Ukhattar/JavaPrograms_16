package ArrayPractice;

public class Rotate2DArray {

    public static void main(String[] args) {
        int[][] orginialmatrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] rotatedmatrix = rotatematrix90degree(orginialmatrix);

        //print rotated matrix
        for(int i =0; i<rotatedmatrix.length;i++)
        {
            for (int j =0;j< rotatedmatrix[0].length;j++)
            {
                System.out.print(rotatedmatrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] rotatematrix90degree(int[][] matrix)
    {
        int row = matrix.length;
        int col = matrix[0].length ;

        //creation of transposedmatrix
        int[][] transposedmatrix = new int[row][col];

        //transpose matrix
         for(int i =0;i< row; i++ )
         {
             for(int j =0; j< col; j++)
             {
                 transposedmatrix[j][i] = matrix[i][j];
             }
         }

         //reverse first and last column (00 -> 02, 10 -> 12, 20 ->22)
        for(int i =0;i< col; i++)
        {
            for(int j =0;j<row/2;j++)
            {
              int temp = transposedmatrix[i][j]; //swap logic
                transposedmatrix[i][j] = transposedmatrix[i][row-1-j];
                transposedmatrix[i][row-1-j]= temp;
            }
        }
        return transposedmatrix;


    }
}
