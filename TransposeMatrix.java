public class TransposeMatrix {
    public static void main(String[] args) {
        // Original 2D array
        int[][] original = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Dimensions of the original matrix
        int rows = original.length;
        int cols = original[0].length;

        // Create a new array to store the transposed matrix
        int[][] transposed = new int[cols][rows];

        // Transpose the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = original[i][j];
            }
        }

        // Display the original matrix
        System.out.println("Original Matrix:");
        printMatrix(original);

        // Display the transposed matrix
        System.out.println("\nTransposed Matrix:");
        printMatrix(transposed);
    }

    // Helper method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
