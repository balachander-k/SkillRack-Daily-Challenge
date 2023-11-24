// The program must accept a string S as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.
// Note: The length of S is always odd.

// Boundary Condition(s):
// 5 <= Length of S <=99

// Input Format:
// The first line contains S.

// Output Format:
// The lines containing the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 12345

// Output:
// **1**
// *2*2*
// 34543

// Example Input/Output 2:
// Input:
// abcdefg

// Output:
// ***a***
// **b*b**
// *c***c*
// defgfed

// Example Input/Output 3:
// Input:
// skillrack

// Output:
// ****s****
// ***k*K***
// **i***i**
// *l*****l*
// Irackcarl

import java.util.*;
public class String_Triangle_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        int l=(s.length/2)+1,t=1,c=0,y=0;
        for(int i=1;i<=l;i++)
        {
            for(int j=l;j>i;j--)
                System.out.print("*");
            if(i!=l)
            {
                for(int j=1;j<=3;j++)
                {
                    if(j==2)
                        for(int k=1;k<t-1;k++)
                            System.out.print("*");
                    else 
                    {
                        if(j==3 && i==1)
                            continue;
                        else 
                            System.out.print(s[i-1]);
                    }
                }
                for(int j=l;j>i;j--)
                    System.out.print("*");
            }
            if(i==l)
            {
                for(int j=l-1;j<s.length;j++)
                {
                    System.out.print(s[j]);
                    c++;
                }
                for(int j=s.length-2;j>=0;j--)
                {
                    if(y==c-1)
                        break;
                    System.out.print(s[j]);
                    y++;
                }
            }
            t=t+2;
            System.out.println();
        }
    }
}