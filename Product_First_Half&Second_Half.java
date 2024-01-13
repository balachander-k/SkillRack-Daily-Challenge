// The program must accept an integer N as the input. The program must print the
// product P of the first half of the digits in N and the second half of the digits in N
// as the output.

// Note: The number of digits in N is always even.

// Boundary Condition(s):
// 10 <= N <=10^8

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains P.

// Example Input/Output 1:
// Input:
// 5418

// Output:
// 972

// Explanation:
// The first half of the digits in 5418 is 54.
// The second half of the digits in 5418 is 18.
// So their product 972 (54 * 18) is printed as the output.

// Example Input/Output 2:
// Input:
// 150050

// Output:
// 7500


import java.util.*;
public class Product_First_Half&Second_Half
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        int len=s.length/2;
        String t="",r="";
        for(int i=0;i<s.length;i++)
        {
            if(i<len)
                t+=String.valueOf(s[i]);
            else 
                r+=String.valueOf(s[i]);
        }
        System.out.print(Integer.parseInt(t)*Integer.parseInt(r));
        
        
    }
}