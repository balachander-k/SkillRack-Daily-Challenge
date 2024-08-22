// The program must accept a string S and an integer N as the input. The string S contains
// only 0s and Is. The program must print YES if the string S contains the binary
// representation of each integer from 1 to N as a substring. Else the program must print NO
// as the output.

// Boundary Condition(s):
// 1 <= Length of S <= 1000
// 1 <= N <= 100

// Input Format:
// The first line contains S.
// The second line contains N.

// Output Format:
// The first line contains either YES or NO.

// Example Input/Output 1:
// Input:
// 110
// 3

// Output:
// YES

// Explanation:
// Here S = 110 and N = 3.
// The binary representation of 1 is 1.
// The binary representation of 2 is 1O.
// The binary representation of 3 is 11.
// Here the string S contains the binary representation of each integer from 1 to 3 as a
// substring.
// So YES is printed as the output.

// Example Input/Output 2:
// Input:
// 01001101
// 7

// Output:
// NO
import java.util.*;
public class Binary_SubString
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String val=obj.next();
        int n=obj.nextInt(),count=0;
        for(int i=1;i<=n;i++)
        {
            String bin=Integer.toBinaryString(i);
            if(val.contains(bin))count++;
        }
        System.out.print((count==n)?"YES":"NO");
    }
}