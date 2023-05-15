// The program must accept N integers as the input. The program must print the
// output based on the following conditions.

// - If the number of even integers is greater than the number of odd integers then
// the program must print all the even integers in the reverse order followed by all
// the odd integers in the given order.
// - If the number of even integers is less than the number of odd integers then the
// program must print all the odd integers in the reverse order followed by all the
// even integers in the given order.
// - If the number of even integers is equal to the number of odd integers then the
// program must print all the integers in the reverse order.

// Boundary Condition(s):
// 1 <= N < = 100
// -10^8 < = Each integer value < = 10^8

// Input Format:
// The first line contains the value of N.
// The second line contains N integers separated by space(s).

// Output Format:
// The first line contains either N integers separated by a space or -1 based on the
// given conditions.


// Example Input/Output 1:
// Input:
// 7
// 21 14 11 13 29 24 15

// Output:
// 15 29 13 11 21 14 24
// Explanation:
// The number of odd integers is 5.
// The number of even integers is 2.
// Here 5 is greater than 2, so all the odd integers are printed in reverse order
// followed by all the even integers in the given order.
// Hence the output is 15 29 13 11 21 14 24

// Example Input/Output 2:
// Input:
// 4
// -12 45 78 -23
// Output:
// -23 78 45 -12


import java.util.*;
public class Reverse_Odd_Or_Even
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[] arr=new int[a];
        int even=0,odd=0;
        for(int i=0;i<a;i++)
        {
            arr[i]=obj.nextInt();
            if(arr[i]%2==0)
                even++;
            if(arr[i]%2!=0)
                odd++;
        }
        if(odd==even)
        {
            for(int i=a-1;i>=0;i--)
                System.out.print(arr[i]+" ");
        }
        if(odd>even)
        {
            for(int i=a-1;i>=0;i--)
            {
                if(arr[i]%2!=0)
                    System.out.print(arr[i]+" ");
            }
            for(int j=0;j<a;j++)
            {
                if(arr[j]%2==0)
                    System.out.print(arr[j]+" ");
            }
        }
        if(odd<even)
        {
            for(int i=a-1;i>=0;i--)
            {
                if(arr[i]%2==0)
                    System.out.print(arr[i]+" ");
            }
            for(int j=0;j<a;j++)
            {
                if(arr[j]%2==0)
                    System.out.print(arr[j]+" ");
            }
        }
    }
}