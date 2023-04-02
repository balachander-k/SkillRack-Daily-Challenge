// The program must accept N positive integers as the input. The program must
// subtract the integers from the largest integer among the N integers and print the
// modified integers as the output.

// Boundary Condition(s):
// 1 <= N <=1000

// Input Format:
// The first line contains N.
// The second line contains N integers separated by space.

// Output Format:
// The first line contains N integers separated by a space.

// Example Input/Output 1:
// Input:
// 6
// 12 40 30 56 21 8

// Output:
// 44 16 26 0 35 48

// Explanation:
// The largest integer among the N integers is 56.
// Each integer is subtracted from 56 and replaced.
// Example Input/Output 2:

// Input:
// 7
// 33 23 15 39 30 17 10

// Output:
// 6 16 24 0 9 22 29


import java.util.*;
public class Subtract_Largest_Number
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),large=0;
        int[] array=new int[a];
        for(int i=0;i<a;i++)
            array[i]=obj.nextInt();
        for(int i=1;i<a;i++)
        {
            if(array[i]>large)
                large=array[i];
        }
        for(int i=0;i<a;i++)
        {
            int sub=Math.abs(array[i]-large);
            System.out.print(sub+" ");
        }
    }
}