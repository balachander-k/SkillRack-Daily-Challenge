// The program must accept an integer N and a digit D as the input. The program
// must print YES if the sum of every two digits in N is a multiple of D. Else the
// program must print NO as the output.
// Note: The number of digits in N is always even.

// Boundary Condition(s):
// 1<= 10 <= 10^17

// Input Format:
// The first line contains N.
// The second line contains D.

// Output Format:
// The first line contains YES or NO.

// Example Input/Output 1:
// Input:
// 2417
// 2

// Output:
// YES

// Explanation:
// Here N = 2417 and D = 2.
// The sum of 2 and 4 is 6, which is the multiple of 2.
// The sum of 1 and 7 is 8, which is the multiple of 2.
// Here the sum of every two digits in 2417 is the multiple of 2, so YES is printed.

// Example Input/Output 2:
// Input:
// 99562403
// 3

// Output:
// NO



import java.util.*;
public class Multiples_Every_Two_Digits 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] N=obj.next().toCharArray();
        int digit=obj.nextInt(),d=N.length/2,h=0,sum=0,count=0;
        for(int i=0;i<d;i++)
        {
            sum+=(Integer.valueOf(N[h])-'0')+(Integer.valueOf(N[h+1])-'0');
            h+=2;
            if(sum%digit==0)count++;
            sum=0;
        }
        System.out.print((count==d)?"YES":"NO");
    }
}