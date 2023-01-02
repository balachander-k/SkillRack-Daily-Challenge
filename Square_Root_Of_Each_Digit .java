// The program must accept an integer N as the input. The program must print the square root of each digit in N with the precision up to 2 decimal places as the output.

// Boundary Condition(s);
// 1<= N <=10^7

// Input Format:
// The first line contains the integer N.

// Output Format:
// The first line contains the square of root of each digit in N with the precision up to 2 decimal places separated by a space.

// Example Input/Output 1:
// Input:
// 23578

// Output:
// 1.41 1.73 2.24 2.65 2.83

// Explanation:
// The square root of the digit 2 is 1.41
// The square root of the digit 3 is 1.73
// The square root of the digit 5 is 2.24
// The square root of the digit 7 is 2.65
// The square root of the digit 8 is 2.83
// Hence the output is 1.41 1.73 2.24 2.65 2.83

// Example Input/Output 2:
// Input:
// 149

// Output:
// 1.00 2.00 3.00



import java.util.*;
public class Square_Root_Of_Each_Digit 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] b=a.toCharArray();
        double val,square;
        for(int i=0;i<a.length();i++)
        {
            val=Double.parseDouble(String.valueOf(b[i]));
            System.out.printf("%.2f",Math.sqrt(val));
            System.out.print(" ");
        }
    }
}