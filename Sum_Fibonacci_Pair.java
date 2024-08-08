// The program must accept an integer N as the input. The program must print a pair of
// Fibonacci integers whose sum is equal to N. If two or more such pairs which give the sum N,
// the program must print the first occurring pair as the output. If there is no such pair, the
// program must print -1 as the output.

// Note: The integers in the pair must be sorted in ascending order.
// Boundary Condition(s):
// 1 <= N <= 10 ^8

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains a pair of Fibonacci integers or -1 as per the given conditions.

// Example Input/Output 1:
// Input:
// 254

// Output:
// 21 233

// Explanation:
// The only possible pair of Fibonacci integers whose sum is equal to 254 is (21, 233).
// Hence the output is
// 21 233

// Example Input/Output 2:
// Input:
// 3

// Output:
// 0 3

// Explanation:
// The two possible pairs of Fibonacci integers which give the sum 3 are given below.
// Here (O, 3) is the first occurring pair.
// Hence the output is
// 0 3

// Example Input/Output 3:
// Input:
// 25

// Output:
// -1


import java.util.*;
public class Sum_Fibonacci_Pair 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        int N=obj.nextInt(),f=0,l=1;
        list.add(0);list.add(1);
        while(true)
        {
            int next=f+l;
            if(next>N)break;
            list.add(next);
            f=l;
            l=next;
        }
        for(int i=0;i<list.size();i++)
        {
            for(int j=i;j<list.size();j++)
            {
                if(list.get(i)+list.get(j)==N)
                {
                    System.out.print(list.get(i)+" "+list.get(j));
                    return;
                }
            }
        }
        System.out.print(-1);
        
    }
}