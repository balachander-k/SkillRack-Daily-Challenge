// The program must accept an integer N with leading zeros as the input. The
// program must remove all the leading zeros T from the integer N. Then the
// program must append T zeros as trailing zeros to the integer N. Finally, the
// program must print the modified integer N as the output.
// Note: At least one nonzero digit is present in integer N.

// Boundary Condition(s):
// 2 <= Number of Digits in N <= 18

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains modified N.

// Example Input/Output 1:
// Input:
// 00054

// Output:
// 54000

// Explanation:
// There are 3 leading zeros in 00054. So, the 3 leading zeros are removed from
// 00054.
// Now the integer becomes 54.
// After adding 3 trailing zeros to 54, the integer becomes 54000.
// Hence the output is 5400

// Example Input/Output 2:
// Input:
// 0101900

// Output:
// 1019000

import java.util.*;
public class Leading_Zeros_Trailing_Zeros
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String N=obj.next();
        int index=0;
        for(int i=0;i<N.length();i++)
            if(N.charAt(i)!='0')
            {
                index=i;
                break;
            }
        for(int i=index;i<N.length();i++)
            System.out.print(N.charAt(i));
        for(int i=index-1;i>=0;i--)
            System.out.print(N.charAt(i));
    }
}