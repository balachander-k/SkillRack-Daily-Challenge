// The program must accept two integer arrrays of the same size N as the input. The program must compare the first integers of both the arrays and print the minimum integer, compare the second integers of both the arrays and print the minimum integer then compare the third integers of both the arrays and print the minimum integer and so on.

// Boundary Condition(s);
// 1<= N <=100
// 1<= Each integer value <=10^7

// Input Format:
// The first line contains the value of N.
// The second line contains N integers of the first array separated by space(s).
// The third contains N integers of the second array separated by space(s).

// Output Format:
// The first line contains the N integers.

// Example Input/Output 1:
// Input:
// 5
// 12 23 34 87 56
// 43 65 76 45 16

// Output:
// 12 23 34 45 16

// Explanation:
// The 1st integer of both the arrays are 12 and 43.Here 12 is smaller than 43.So 12 is printed.
// The 2nd integer of both the arrays are 23 and 65. Here 23 is smaller than 65.So 23 is printed.
// The 3rd integer of both the arrays are 34 and 76. Here 34 is smaller than 76. So 34 is printed.
// The 4th integer of both the arrays are 87 and 45. Here 45 is smaller than 87.So 45 is printed.
// The 5th integer of both the arrays are 56 and 16.Here 16 is smaller than 56.So 16 is printed.
// Hence the output is 12 23 34 45 16

// Example Input/Output 2:
// Input:
// 6
// 123 234 345 456 567 456
// 987 876 125 654 234 431

// Output:
// 123 234 125 456 234 431
 


import java.util.*;
public class Smallest_Integer_Two_Arrays
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[] b=new int[a];
        int[] c=new int[a];
        for(int i=0;i<a;i++)
            b[i]=obj.nextInt();
        for(int i=0;i<a;i++)
            c[i]=obj.nextInt();
        int q=0,min=0;
        for(int i=0;i<a;i++)
        {
            min=b[q];
            if(c[i]<min)
                min=c[i];
            System.out.print(min+" ");
            q++;
        }
    }
}