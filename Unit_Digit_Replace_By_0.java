// The program must accept an integer N as the input. The program must replace all
// the occurrences of the unit digit of N by O in the integer N. Finally, the program
// must print the modified value of N as the output.

// Boundary Condition(s):
// 1 <= 10^8

// Input Format:
// The first line contains the value of N.

// Output Format:
// The first line contains the modified value of N.

// Example Input/Output 1:
// Input:
// 1021

// Ouput:
// 20

// Explanation:
// The unit digit of 1021 is 1.
// So after replacing all the occurrence of 1 by 0, the integer becomes 0020.
// Hence the output is 20

// Example Input/Output 2:
// Input:
// 202202

// Ouput:
// 0

import java.util.*;
public class Unit_Digit_Replace_By_0
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int num=obj.nextInt(),digit=num%10;
        String s="";
        while(num!=0)
        {
            int rem=num%10;
            if(rem==digit)
                s=String.valueOf(0)+s;
            else 
                s=String.valueOf(rem)+s;
            num=num/10;
        }
        System.out.print(Integer.parseInt(s));
    }
}