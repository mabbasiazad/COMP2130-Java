import java.util.Arrays;
public class Four_Reading_Multidimension {
    public static void main(String[] args) {
        // multi dimensional array

        int[][] matrix = new int[2][3];
        //fill the matrix as 
        // [1 2 3
        //  2 3 4]
        //your code here
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 2;
        matrix[1][1] = 3;
        matrix[1][2] = 4;

        //print the matrix
        //your code here
        printMatrix(matrix);

        //print the matrix.length - what does it print?
        //your code here
        System.out.println("matrix length: the number of rows in the matrix");
        System.out.println(matrix.length);

        //print matrix[0] and matrix[1] - what does it print?
        //matrix[0] is an array of first row
        //use Arrays.toString method :  System.out.println(Arrays.toString(matrix[0]));
        //your code here
        System.out.println("matrix[0] is an array of first row");
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println("matrix[1] is an array of second row");
        System.out.println(Arrays.toString(matrix[1]));

        // the other way to create 2d array
        // declaration, creation and initialization
        int[][] matrix2 = {
                {2, 3, 4},
                {3, 6, 8},
                {1, 0, 9}
        };

    }    //print the matrix2
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static void printMatrix2(int[][] matrix2) {
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
