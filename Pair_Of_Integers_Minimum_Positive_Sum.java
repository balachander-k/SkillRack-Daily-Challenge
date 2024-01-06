// The program must accept a list of integers as the input. The program must print
// the pair of integers having the minimum positive sum among the given list of
// integers. If more than one pair has the same minimum positive sum, the program
// must print the first occurring one as the output. If there is no such pair, the
// program must print -1 as the output.

// Boundary Condition(s):
// -10^5 < = Each integer value <= 10^5

// Input Format:
// The first line contains a list of integers separated by a space.

// Output Format:
// The first line contains the integer value(s) as per the given conditions.

// Example Input/Output 1:
// Input:
// 12 6 9 4

// Output:
// 6 4

// Explanation:
// The sum of 12 and 6 is 18.
// The sum of 12 and 9 is 21.
// The sum of 12 and 4 is 16.
// The sum of 6 and 9 is 15.
// The sum of 6 and 4 is 10.
// The sum of 9 and 4 is 13.
// Here the minimum positive sum is 10, so 6 and 4 are printed as the output.

// Example Input/Output 2:
// Input:
// 10 35 4-5 1

// Output:
// 10 -5

// Example Input/Output 3:
// Input:
// -3 -2 -4 0

// Output:
// -1

import java.util.*;
public class Pair_Of_Integers_Minimum_Positive_Sum
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        while(obj.hasNext())
            list.add(obj.nextInt());
        int f=0,l=0,min=Integer.MAX_VALUE;
        for(int i=0;i<list.size();i++)
        {
            int sum=0;
            for(int j=i+1;j<list.size();j++)
            {
                sum=list.get(i)+list.get(j);
                if(sum<min && sum>0)
                {
                    f=list.get(i);
                    l=list.get(j);
                    min=sum;
                }
            }
        }
        System.out.print((f!=0 || l!=0)?(f+" "+l):"-1");
    }
}