// The program must accept three integers as the input. The program must print the integers
// from the largest of the three integers to the smallest of the three integers in decreasing order
// as the output.

// Boundary Condition(s):
// 1 <= Each integer value <= IO^7

// Input Format:
// The first line contains three integers separated by a space.

// Output Format:
// The first line contains integers separated by a space.

// Example Input/Output 1:
// Input:
// 6 2 8

// Output:
// 8 7 6 5 4 3 2

// Explanation:
// The largest number is 8 and the smallest number is 2.
// So the integers from 8 to 2 are printed.

// Example Input/Output 2:
// Input:
// 60 51 48

// Output:
// 60 59 58 57 56 55 54 53 52 51 50 49 48


import java.util.*;
public class Largest_To_Smallest_Integer
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        String[] b=a.split(" ");
        int[] array=new int[b.length];
        int k=0;
        for(int i=0;i<b.length;i++)
        {
            int temp=Integer.parseInt(String.valueOf(b[i]));
            array[k]=temp;
            k++;
        }
        Arrays.sort(array);
        int small=array[0],large=array[k-1];
        for(int i=large;i>=small;i--)System.out.print(i+" ");
    }
}