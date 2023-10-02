// The program must accept an integer N as the input. The program must form an
// integer X by removing exactly one digit from N so that X is divisible by 8. The
// program must print YES if it is possible to form the integer X. Else the program
// must print NO as the output.

// Boundary Condition(s):
// 10 <= N <= 10^8

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains YES or NO.

// Example Input/Output 1:
// Input:
// 3454

// Output:
// YES

// Explanation:
// After removing the tenth digit 5, the integer becomes 344.
// Here, the integer 344 is divisible by 8.
// So YES is printed as the output.

// Example Input/Output 2:
// Input:
// 79

// Output:
// NO

import java.util.*;
public class Remove_One_Digit_Divisble_By_8
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] n=obj.next().toCharArray();
        int count=0;
        for(int i=0;i<n.length;i++)
        {
            String temp="";
            for(int j=0;j<n.length;j++)
                if(i!=j)
                    temp=temp+n[j];
            int num=0;
            for(int j=0;j<temp.length();j++)
                num=(num*10)+temp.charAt(j)-48;
            if(num%8==0 && num!=0)
            {
                System.out.print("YES");
                count++;
                break;
            }
        }
        if(count==0)System.out.print("NO");
    }
}