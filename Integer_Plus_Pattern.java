The program must accept an integer N as the input. The program must print the
desired pattern as shown in the Example Input/Output section.
Note: N is always an odd integer.

Boundary Condition(s):
3 <= N <= 25

Input Format:
The first line contains N.

Output Format:
The lines containing the desired pattern as shown in the Example Input/Output
section.

Example Input/Output 1:
Input:
5

// Output:
// 5 4 3 2 1 2 3 4 5
// 4 4 3 2 1 2 3 4 4
// 3 3 3 2 1 2 3 3 3 
// 2 2 2 2 1 2 2 2 2
// 1 1 1 1 1 1 1 1 1
// 2 2 2 2 1 2 2 2 2
// 3 3 3 2 1 2 3 3 3
// 4 4 3 2 1 2 2 4 4 
// 5 4 3 2 1 2 3 4 5

// Example Input/Output 2:
// Input:
// 3

// Output:
// 3 2 1 2 3
// 2 2 1 2 2
// 1 1 1 1 1
// 2 2 1 2 2 
// 3 2 1 2 3 

import java.util.*;
public class Integer_Plus_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),t=(N*2)-1,r=N;
        ArrayList<String> list=new ArrayList<String>();
        for(int i=1;i<=r-1;i++)
        {
            String temp="";
            for(int j=1;j<=i;j++)
                temp+=String.valueOf(N)+" ";
            for(int j=r-i;j>=1;j--)
                temp+=String.valueOf(j)+" ";
            for(int j=2;j<=r-i;j++)
                temp+=String.valueOf(j)+" ";
            for(int j=1;j<=i;j++)
                temp+=String.valueOf(N)+" ";
            list.add(temp);
            N--;
        }
        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));
        System.out.println(String.valueOf("1 ").repeat(t));
        for(int j=list.size()-1;j>=0;j--)
            System.out.println(list.get(j));
    }
}