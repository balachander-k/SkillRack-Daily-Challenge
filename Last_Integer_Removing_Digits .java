// The program must accept an integer N as the input. The program must form
// the largest integer X by removing exactly one digit from the last three digits of N.
// Then the program must print the integer X as the output.

// Boundary Condition(s):
// 100 <= N <= 10^8

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains X.

// Example Input/Output 1:
// Input:
// 15742

// Output:
// 1574

// Explanation:
// If the unit digit 2 is removed, the integer becomes 1574.
// If the tenth digit 4 is removed, the integer becomes 1572.
// If the hundredth digit 7 is removed, the integer becomes 1542.
// Among these three integers, the largest integer is 1574.
// Hence the output is 1574

// Example Input/Output 2:
// Input:
// 6108

// Output:
// 618

import java.util.*;
public class Last_Integer_Removing_Digits 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String num=obj.next();
        int k=num.length()-1,max=Integer.MIN_VALUE;
        for(int i=1;i<=3;i++)
        {
            String temp="";
            for(int j=0;j<num.length();j++)
                if(j!=k)
                    temp=temp+num.charAt(j);
            int val=Integer.parseInt(temp);
            if(val>max)
                max=val;
        }
        System.out.print(max);
    }
}