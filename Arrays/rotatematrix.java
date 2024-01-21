package Arrays;

import java.util.Scanner;

public class rotatematrix {
    public static void main(String[] args) {
        int[][] originalMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] rotatedMatrix = rotate90Degrees(originalMatrix);

        // Print the rotated matrix
        for (int i = 0; i < rotatedMatrix.length; i++) {
            for (int j = 0; j < rotatedMatrix[i].length; j++) {
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] rotate90Degrees(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Transpose the matrix
        int[][] transposedMatrix = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        // Reverse each row of the transposed matrix to get the final result
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows / 2; j++) {
                int temp = transposedMatrix[i][j];
                transposedMatrix[i][j] = transposedMatrix[i][rows - 1 - j];
                transposedMatrix[i][rows - 1 - j] = temp;
            }
        }

        return transposedMatrix;
    }


}
