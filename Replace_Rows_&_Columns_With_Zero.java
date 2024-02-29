// The program must accept an integer matrix of size RxC as the input. If any cell is O
// in the matrix, the program must replace the entire row and column of the cell with
// zero. Finally, the program must print the modified matrix as the output.

// Boundary Conditon(s):
// 2 <= R,C <=50
// 0 <= Each integer value <= 1000

// Input Format:
// The first line contains R and C separated by a space.
// The next R lines, each containing C integers separated by a space.

// Output Format:
// The first R lines, each containing C integers separated by a space.

// Example Input/Output 1:
// Input:
// 2 3 
// 1 0 1
// 1 1 1

// Output:
// 0 0 0 
// 1 0 1

// Explanation:
// In the given 2x3 matrix, the 0 is present in the first row and second column.
// So the entire first row and the entire second column are replaced with zero. Now,
// the matrix becomes
// 0 0 0 
// 1 0 1


// Example Input/Output 2:
// Input:
// 3 8 3 8
// 0 5 7 8
// 6 0 4 8

// Output:
// 0 0 3 8
// 0 0 0 0
// 0 0 0 0


import java.util.*;
public class Replace_Rows_&_Columns_With_Zero{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (zeroRows[i] || zeroCols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
