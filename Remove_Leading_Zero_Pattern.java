// The program must accept an integer N as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 10 <= N <=10^16

// Input Format:
// The first line contains N.

// Output Format:
// The lines containing the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 9165

// Output:
// 9165
// 165
// 65
// 5

// Example Input/Output 2:
// Input:
// 108004

// Output:
// 108004
// 8004
// 8004
// 4
// 4
// 4


import java.util.*;
public class Remove_Leading_Zero_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] val=obj.next().toCharArray();
        int u=0;
        for(int i=0;i<val.length;i++)
        {
            String v="";
            for(int j=u;j<val.length;j++)
                v=v+val[j];
            System.out.println(Long.parseLong(v));
            u++;
        }
    }
}