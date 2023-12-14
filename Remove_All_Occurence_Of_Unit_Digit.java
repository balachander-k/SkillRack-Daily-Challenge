// The program must accept an integer N as the input. The program must remove all
// the occurrences of N's unit digit in the same integer N. Then the program must
// print the modified integer N as the output. If all the digits of N are the same, the
// program must print -1 as the output.

// Boundary Condition(s):
// 1 <= N <=10^18

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the modified integer N or -1.

// Example Input/Output 1:
// Input:
// 121671

// Output:
// 267

// Explanation:
// The unit digit of 121671 is 1. So all the occurrences of 1 are removed from the
// integer 121671.
// So the modified integer is 267

// Example Input/Output 2:
// Input:
// 800180708

// Output:
// 1070

// Example Input/Output 3:
// Input:
// 333

// Output:
// -1

import java.util.*;
public class Remove_All_Occurence_Of_Unit_Digit
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] n=obj.next().toCharArray();
        int count=0;
        String t="";
        for(int i=0;i<n.length;i++)
        {
            if(n[i]!=n[n.length-1])
            {
                count++;
                t=t+n[i];
            }
        }
        System.out.print((count==0)?"-1":Integer.parseInt(t));
    }
}