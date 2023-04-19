// The program must accept an integer N as the input. The program must remove al
// the occurrences of the unit digit of N in the integer N. Then the program mus
// print the modified value of N as the output. If all the digits in N are removed the
// the program must print -1 as the output.

// Boundary Condition(s)
// 1<= N < = 10^9
// Input Format:
// The irst line ontains he value of N

// Output Format.
// The first line contains the modified value of N or -1
// Example In ut/Out ut 1
// Input:
// 480454 

// Output:
// 805

// Explanation:
// The unit digit of N is 4.
// So all the occurrences of 4 are removed in the integer 480454
// Hence the output is 805

// Example Input/Output 2:
// Input:
// 1005201

// Output:
// 520

// Example Input/Output 3:
// Input:
// 6666

// Output:
// -1

import java.util.*;
public class Remove_All_Occurrences_Unit_Digit
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine(),val="";
        long count=0;
        char b=a.charAt(a.length()-1);
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)!=b)
            {
                count++;
                val=val+a.charAt(i);
            }
        }
        if(count==0)System.out.print("-1");
        else System.out.print(Long.parseLong(val));
    }
}