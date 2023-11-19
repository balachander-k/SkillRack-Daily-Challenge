// The program must accept an integer N (where the number of digits in N is always
// divisible by 3) as the input. The program must split the integer N into three-digit
// integers (every three consecutive digits). Then the program must print the sum S
// of those three-digit integers as the output.

// Boundary Condition(s):
// 100 <= N <= 999999999

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains S.

// Example Input/Output 1:
// Input:
// 210045

// Output:
// 255

// Explanation:
// Here N = 210045.
// The first three-digit integer of 210045 is 210.
// The last three-digit integer of 210045 is 045.
// So their sum 255 (210 + 045) is printed as the output.

// Example Input/Output 2:
// Input:
// 100100

// Output:
// 200

import java.util.*;
public class Sum_Of_Three_Digit_Integers 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char [] N=obj.next().toCharArray();
        int sum=0,count=0;
        String temp="";
        for(int i=0;i<N.length;i++)
        {
            if(count<=3)
            {
                temp=temp+N[i];
                count++;
            }
            if(count>=3)
            {
                sum=sum+Integer.valueOf(temp);
                count=0;
                temp="";
            }
        }
        System.out.print(sum);
        
    }
}