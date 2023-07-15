// The program must accept N string values as the input. The program must sort the
// string values based on the length of each string value in increasing order. Then the
// program must print the sorted string values as the output.
// Note: Each of the string values has a different length.

// Boundary Condition(s):
// 1 <= N <= 100
// 1 <= Length of each string value < = 100

// Input Format:
// The first line contains the integer N.
// The next N lines contain the string value in each line.

// Output Format:
// The first N lines contain the sorted string values.

// Example Input/Output 1:
// Input:
// 4
// lemon
// embezzling
// banana
// ant

// Output:
// ant
// lemon
// banana
// embezzling

// Explanation:
// The length of the string lemon is 5
// The length of the string embezzling is
// 10.
// The length of the string banana is
// 6.
// The length of the string ant is 3
// After sorting the string values based on their length are ant, lemon, banana,
// embezzling.
// Hence the output is
// ant
// lemon
// banana
// embezzling

// Example Input/Output 2:
// Input:
// 5
// orange
// hello
// gentleman
// app
// hi

// Output:
// hi
// app
// hello
// orange
// gentleman

import java.util.*;
public class Sort_The_String_Values_Based_On_The_Length
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        String[] arr=new String[size];
        String temp="";
        for(int i=0;i<size;i++)
            arr[i]=obj.next();
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[i].length()>arr[j].length())
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<size;i++)
            System.out.println(arr[i]);
        
    }
}