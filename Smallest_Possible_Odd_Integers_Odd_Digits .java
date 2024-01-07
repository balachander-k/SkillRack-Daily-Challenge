// The program must accept a positive integer N as the input. The program must
// print the smallest possible odd integer S that can be formed with all the odd digits
// in N as the output. If it is not possible to form such an odd integer, the program
// must print -1 as the output.

// Boundary Condition(s):
// 1 <= N <= 10^8

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains S or -1.

// Example Input/Output 1:
// Input:
// 786541

// Output:
// 157

// Explanation:
// The smallest odd integer formed by the odd digits in 786541 is 157.
// Hence the output is 157

// Example Input/Output 2:
// Input:
// 406682

// Output:
// -1

// Example Input/Output 3:
// Input:
// 70009

// Output:
// 79

import java.util.*;
public class Smallest_Possible_Odd_Integers_Odd_Digits 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] N=obj.next().toCharArray();
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<N.length;i++)
        {
            int t=Integer.valueOf(N[i])-48;
            if(t%2!=0)
                list.add(t);
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++)
            System.out.print(list.get(i));
        if(list.isEmpty())
            System.out.print("-1");
    }
}