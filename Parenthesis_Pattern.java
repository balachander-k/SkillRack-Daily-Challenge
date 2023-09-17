// The program must accept a string S as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 1 <= Length of S <= 1000

// Input Format:
// The first line contains S.

// Output Format:
// The lines containing the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// SkillRack

// Output:
// (S)killRac(k)
// S(k)illRa(c)k
// Sk(i)llR(a)ck
// Ski(l)l(R)ack
// Skil(l)Rack

// Example Input/Output 2:
// Input:
// hide

// Output:
// (h)id(e)
// h(i)(d)e

import java.util.*;
public class Parenthesis_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] arr=obj.next().toCharArray();
        int i=0,j=arr.length-1;
        while(j>=i)
        {
            for(int k=0;k<arr.length;k++)
            {
                if(k==i || k==j)
                    System.out.print("("+arr[k]+")");
                else 
                    System.out.print(arr[k]);
            }
            System.out.println();
            i++;
            j--;
        }
    }
}