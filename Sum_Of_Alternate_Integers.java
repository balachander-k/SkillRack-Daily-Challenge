// The program must accept N integers as the input where N is even. The program
// must print the sum of the ISt and Nth integer, 2nd and (N-l)th integer, 3rd and (N-
// 2)th integer and so on.

// Boundary Condition(s):
// 2 <= N 1 <= 10^5

// Input Format:
// The first line contains the integer N.
// The second line contains N integers separated by space(s).

// Output Format:
// The first line contains the sum of the ISt and Nth integer, 2nd and (N-l)th
// integer, 3rd and (N-2)th integer and so on.

// Example Input/Output 1:
// Input:
// 10
// 1 3 5 6 10 2 4 5 90 100

// Output:
// 101 93 10 10 12


// Explanation:
// The ISt and 10th integers are 1 and 100 and their sum value is 101. So 101 is
// printed.
// The 2nd and 9th integers are 3 and 90 and their sum value is 93. So 93 is printed.
// The 3rd and 8th integers are 5 and 5 and their sum value is 10. So 10 is printed.
// The 4th and 7th integers are 6 and 4 and their sum value is 10. So 10 is printed.
// The 5th and 6th integers are 10 and 2 and their sum value is 12. So 12 is printed.

// Example Input/Output 2:
// Input:
// 6
// 5 20 15 25 10 45
// Output:
// 50 30 40

import java.util.*;
public class Sum_Of_Alternate_Integers
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),f=0,l=a-1;
        int[] arr=new int[a];
        for(int i=0;i<a;i++)
            arr[i]=obj.nextInt();
        for(int i=0;i<a/2;i++)
        {
            System.out.print((arr[f]+arr[l])+" ");
            f++;
            l--;
        }
    }
}