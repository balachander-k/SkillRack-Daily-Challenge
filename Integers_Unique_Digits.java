// The program must accept two integers X and Y as the input. The program must
// print the integers from X to Y which are having unique digits. If there is no such
// integer from X to Y then the program must print -1 as the output.

// Boundary Condition(s):
// 1 <= X <= Y <= 10^8

// Input Format:
// The first line contains X and Y separated by a space.

// Output Format:
// The first line contains the integers from X to Y which are having unique digits
// separated by a space or -1.

// Example Input/Output 1:
// Input:
// 10 15

// Output:
// 10 12 13 14 15

// Explanation:
// The integers from 10 to 15 are 10 11 12 13 14 and 15.
// Here 11 does not have unique digits (as 1 is repeated).
// Hence the output is 10 12 13 14 15

// Example Input/Output 2:
// Input:
// 110 119

// Output:
// -1

import java.util.*;
public class Integers_Unique_Digits 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt(),y=obj.nextInt(),len=0,c=0;
        for(int i=x;i<=y;i++)
        {
            String value=String.valueOf(i);
            int count=0;
            for(int j=0;j<value.length();j++)
            {
                for(int k=j+1;k<value.length();k++)
                {
                    if(value.charAt(j)==value.charAt(k))
                        count++;
                }
                if(count!=0)
                    len++;
            }
            if(len==0)
            {
                System.out.print(i+" ");
                c++;
            }
            len=0;
        }
        if(c==0)
            System.out.print("-1");
    }
}