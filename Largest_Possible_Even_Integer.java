// The program must accept an integer N as the input. The program must
// print the largest possible integer containing all the even digits of N as
// the output. If it is not possible to form such integer then the program
// must print -1 as the output.

// Boundary Condition(s):
// 1 <=  N <= 10^8

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the largest possible integer containing all the even
// digits of N or -1.

// Example Input/Output 1:
// Input:
// 748009

// Output:
// 8400

// Explanation:
// The even digits in 748009 are 4 8 0 and O. So the largest possible integer
// from those even digits is 8400.
// Hence the output is 8400

// Example Input/Output 2:
// Input:
// 12846

// Output:
// 8642

// Example Input/Output 3:
// Input:
// 5719

// Output:
// -1

import java.util.*;
public class Largest_Possible_Even_Integer
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int value=obj.nextInt(),count=0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        while(value!=0)
        {
            int rem=value%10;
            if(rem%2==0)
            {
                list.add(rem);
                count++;
            }
            value=value/10;
        }
        Collections.sort(list);
        for(int i=list.size()-1;i>=0;i--)
            System.out.print(list.get(i));
        if(count==0)
            System.out.print("-1");
    }
}