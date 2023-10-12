// The program must accept two integers X and Y as the input. The program must
// print all the palindromic integers from X to Y as the output. If there is no
// palindromic integers from X to Y then the program must print -1 as the output.

// Boundary Condition(s):
// 1 <= X,Y <=10^5

// Input Format:
// The first line contains X and Y separated by a space.

// Output Format:
// The first line contains the palindromic integers from X to Y separated by a space or -1

// Example Input/Output 1:
// Input:
// 120 191

// Output:
// 121 131 141 151 161 171 181 191

// Example Input/Output 2:
// Input:
// 455 463

// Output:
// -1

import java.util.*;
public class Plaindromic_Integers 
{
    public static boolean isPlaindrome(int x)
    {
        int temp=x,rev=0;
        while(temp!=0)
        {
            int rem=temp%10;
            rev=(rev*10)+rem;
            temp=temp/10;
        }
        if(x==rev)
            return true;
        return false;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt(),y=obj.nextInt(),count=0;
        for(int i=x;i<=y;i++)
        {
            if(isPlaindrome(i))
            {
                count++;
                System.out.print(i+" ");
            }
        }
        if(count==0)
            System.out.print(-1);
    }
}