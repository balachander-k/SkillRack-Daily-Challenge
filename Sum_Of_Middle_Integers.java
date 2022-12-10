// The program must accept N integers as the input. If N is even, the program must print the sum of middle four integers among N integers as the output. Else the program must print the sum of middle three integers among N integers as the output.

// Boundary Condition(s);
// S<= N <=100
// 1<= Each Integer Value <=999

// Input Format:
// The first line contains the integer N.
// The second line contains N integer separated by space(s).

// Output Format:
// The first line contains either the sum of the middle four integers or the sum of middle three integers among N integers.

// Example Input/Output 1:
// Input:
// 5
// 2 3 5 7 6

// Output:
// 15

// Explanation:
// Here N=5 which is odd.
// So the middle integers are 3,5 and 7.
// The sum of the middle three integers is 15(3+5+7).
// Hence the output is 15

// Example Input/Output 2:
// Input:
// 6
// 23 47 63 52 77 56

// Output:
// 239


import java.util.*;
public class Sum_Of_Middle_Integers
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[] b=new int[a];
        for(int i=0;i<a;i++)
            b[i]=obj.nextInt();
        int mid=a/2,sum=0;
        if(a%2!=0)
            sum=b[mid-1]+b[mid]+b[mid+1];
        else 
            sum=b[mid-2]+b[mid-1]+b[mid]+b[mid+1];
        System.out.print(sum);
    }
}