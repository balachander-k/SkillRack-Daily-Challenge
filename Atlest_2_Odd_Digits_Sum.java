// The program must accept N integers as the input. The program must print the
// sum of integers containing at least two odd digits among the N integers as the
// output.

// Boundary Condition(s):
// 1 <= N <= 10^4
// 1 <= Each integer value <= 10^4

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains the sum of integers containing at least two odd digits.

// Example Input/Output 1:
// Input:
// 5
// 78 549 123 877 214

// Output:
// 1549

// Explanation:
// In the given 5 integers, 549 123 and 877 are having at least 2 odd digits.
// So the sum of those integers is 1549.
// Hence the output is 1549

// Example Input/Output 2:
// Input:
// 4
// 124 4266 184 42

// Output:
// 0


import java.util.*;
public class Atlest_2_Odd_Digits_Sum
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt(),sum=0;
        for(int i=0;i<size;i++)
        {
            int val=obj.nextInt(),temp=val,odd=0;
            while(temp!=0)
            {
                int rem=temp%10;
                if(rem%2!=0)
                    odd++;
                temp=temp/10;
            }
            if(count>=2)
                sum=sum+val;
        }
        System.out.print(sum);
    }
}