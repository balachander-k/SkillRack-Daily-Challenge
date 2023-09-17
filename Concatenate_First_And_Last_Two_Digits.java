// The program must accept two integers X and Y as the input. The program must
// form an integer N by concatenating the last two digits of X and the first two digits
// of Y. Then the program must print the integer N as the output.

// Boundary Condition(s):
// 10 <=X,Y <=10^7

// Input Format:
// The first line contains X and Y separated by a space.

// Output Format:
// The first line contains N.

// Example Input/Output 1:
// Input:
// 2390 1278

// Output:
// 9012

// Explanation:
// The last two digits of the first integer 2390 are 9 and O.
// The first two digits of the second integer 1278 are 1 and 2.
// The integer which is formed by concatenating 90 and 12 is 9012.
// Hence the output is 9012

// Example Input/Output 2:
// Input:
// 2000 901

// Output:
// 90

import java.util.*;
public class Concatenate_First_And_Last_Two_Digits
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] f=obj.next().toCharArray();
        char[] s=obj.next().toCharArray();
        String con=String.valueOf(f[f.length-2])+String.valueOf(f[f.length-1])+String.valueOf(s[0])+String.valueOf(s[1]);
        System.out.print(Integer.parseInt(con));

    }
}