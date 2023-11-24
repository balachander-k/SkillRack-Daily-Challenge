// The program must accept N integers as the input. The program must print the
// sum of integers which are having odd number of digits as the output.

// Boundary Condition(s):
// 1 <= N <= 100
// 1 <= Each integer value <=10^8

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains an integer as per the given condition.

// Example Input/Output 1:
// Input:
// 5
// 13 888 1005 102 8

// Output:
// 998

// Explanation:
// The integers which are having odd number of digits are 888, 102 and 8.
// So their sum 998 is printed as the output.

// Example Input/Output 2:
// Input:
// 4
// 12 4568 32 745678

// Output:
// 0


import java.util.*;
public class Sum_Odd_Number_Of_Digits
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt(),sum=0;
        for(int i=0;i<size;i++)
        {
            int temp=obj.nextInt(),len=(int)Math.log10(temp)+1;
            if(len%2!=0)
                sum=sum+temp;
        }
        System.out.print(sum);
    }
}