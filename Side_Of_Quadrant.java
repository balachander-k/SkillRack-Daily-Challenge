// The program must accept the area of a square A (in cm2) as the input. The
// program must divide the square into four equal squares. Then the program must
// print the side (in cm) of any one of the squares with the precision up to two
// decimal places as the output.

// Formula: Area of a square = side * side

// Boundary Condition(s):
// 1 <= A <=10^4

// Input Format:
// The first line contains A.

// Output Format:
// The first line contains the area of the side with the smallest square.

// Example Input/Output 1:
// Input:
// 16

// Output:
// 2.00

// Example Input/Output 2:
// Input:
// 14

// Output:
// 1.87


import java.util.*;
public class Side_Of_Quadrant
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt();
        double temp=Math.sqrt(num);
        System.out.format("%.2f",temp/2);
    }
}