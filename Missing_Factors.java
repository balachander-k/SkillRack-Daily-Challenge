// The program must accept an integer N and a list of integers representing the
// factors of N as the input. At least one factor of N is always missing the given list of
// integers. The program must find and print those missing factors of N in ascending
// order as the output.

// Boundary Condition(s):
// 2 <= N <= 10^8

// Input Format:
// The first line contains N.
// The second line contains a list of integers representing the factors of N separated
// by a space.

// Output Format:
// The first line contains the missing factors of N in ascending order separated by a
// space.

// Example Input/Output 1:
// Input:
// 100
// 2 100 1 10 50

// Output:
// 45 20 25

// Explanation:
// The factors of 100 are 1 2
// 10
// 50 and 100.
// The missing factors are printed in ascending order 4 5 20 25.
// Hence the output is 4 5 20 25

// Example Input/Output 2:
// Input:
// 4
// 1 4

// Output:
// 2

import java.util.*;
public class Missing_Factors 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        ArrayList<Integer> fact=new ArrayList<Integer>();
        ArrayList<Integer> miss=new ArrayList<Integer>();
        while(obj.hasNext())
            fact.add(obj.nextInt());
        for(int i=1;<=n;i++)
        {
            if(n%i==0)
            {
                int count=0;
                for(int j=0;j<fact.size();j++)
                    if(fact.get(j)==i)
                        count++;
                if(count!=0)
                    miss.add(i);
            }
        }
        for(int i=0;i<miss.size();i++)
            System.out.print(miss.get(i)+" ");
    }
}