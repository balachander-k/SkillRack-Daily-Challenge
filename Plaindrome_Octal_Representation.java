// The program must accept an integer N as the input. The program must print YES if the octal
// representation of N is a palindrome. Else the program must print NO as the output.

// Boundary Condition(s):
// 1 <= N <=IO^9

// Input Format:
// The first line contains the value of N.

// Output Format:
// The first line contains either YES or NO.

// Example Input/Output 1:
// Input:
// 657

// Output:
// YES

// Explanation:
// The octal representation of 657 is 1221.
// Here 1221 is a palindrome.
// Hence the output is YES

// Example Input/Output 2:
// Input:
// 1699

// Output:
// NO

// Explanation:
// The octal representation of 1699 is 3243.
// Here 3243 is not a palindrome.
// Hence the output is NO


import java.util.*;
public class Plaindrome_Octal_Representation
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        String b=Integer.toOctalString(a);
        int c=Integer.parseInt(b);
        int temp=c,rem=0,rev=0;
        while(c!=0)
        {
            rem=c%10;
            rev=(rev*10)+rem;
            c=c/10;
        }
        if(temp==rev)System.out.print("YES");
        else System.out.print("NO");
    }
}