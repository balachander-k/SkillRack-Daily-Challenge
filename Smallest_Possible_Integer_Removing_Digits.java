// The program must accept an integer N as the input. The program must form the
// smallest possible integer X by removing exactly one digit from the last three digits
// of N. Then the program must print the integer X as the output.

// Boundary Condition(s):
// 100 <= N <= 10^8

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains X.

// Example Input/Output 1:
// Input:
// 7654

// Output:
// 754

// Explanation:
// If the unit digit 4 is removed, the integer becomes 765.
// If the tenth digit 5 is removed, the integer becomes 764.
// If the hundredth digit 6 is removed, the integer becomes 754.
// The smallest number of the three numbers above is 754.
// Hence the output is 754

// Example Input/Output 2:
// Input:
// 987987

// Output:
// 98787


import java.util.*;
public class Smallest_Possible_Integer_Removing_Digits 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] val=obj.next().toCharArray();
        int r=val.length-1,min=Integer.MAX_VALUE;
        for(int i=1;i<=3;i++)
        {
            String t="";
            for(int j=val.length-1;j>=0;j--)
                if(j!=r)
                    t=val[j]+t;
            r--;
            int u=Integer.valueOf(t);
            if(u<min)
                min=u;
        }
        System.out.print(min);
    }
}