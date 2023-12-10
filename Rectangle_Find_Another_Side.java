// The length of one side S (in cm) of a rectangle and its perimeter P (in cm) are
// passed as the input. The program must print the length of another side of the
// rectangle with the precision up to two decimal places as the output.

// Formula:
// Perimeter of a rectangle = 2 x (length + breadth)

// Boundary Condition(s):
// 1 <= S < P <=10^8

// Input Format:
// The first line contains S and P separated by a space.

// Output Format:
// The first line contains the length of another side of the rectangle.

// Example Input/Output 1:
// Input:
// 4 18

// Output:
// 5.00

// Example Input/Output 2:
// Input:
// 3 15

// Output:
// 4.50

import java.util.*;
public class Rectangle_Find_Another_Side{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sideLength = scanner.nextInt();
        int perimeter = scanner.nextInt();
        double otherSideLength = (double) (perimeter - 2 * sideLength) / 2;
        System.out.printf("%.2f", otherSideLength);
    }
}