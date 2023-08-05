// The program must accept N integers and a single digit D. Then the program must
// choose the integers having tenth digit as D and sort those integers among them.
// Finally the program must print the modified N integers as the output.

// Boundary Condition(s):
// 2 <= N <= 1000
// 1 <= Each integer value <= 10^4
// ! <= D <= 9

// Input Format:
// The first line contains N.
// The second line contains N number of integers.
// The third line contains D.

// Output Format:
// The first line contains modified N integers.

// Example Input/Output 1:
// Input:
// 9
// 231 991 34 901 33 3 536 9031 83
// 3

// Output:
// 33 991 34 901 231 3 536 9031 83


// Explanation:
// Here D = 3.
// The integers having 3 as tenth digit are 2 1 4 035 690 1.
// Sorting these integers, the order is 33 34 231 536 9031.
// Hence the output is 33 991 34 901 231 3 536 9031 83

// Example Input/Output 2:
// Input:
// 12
// 7 77 87 877 412 71 233 672 201 87 770
// 7

// Output:
// 7 70 87 71 412 77 233 672 201 87 7 877


import java.util.*;
public class Tenth_Digit_Sort 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt(),j=0,t=0;
        int[] arr=new int[size];
        int[] temp=new int[size];
        for(int i=0;i<size;i++)
            arr[i]=obj.nextInt();
        int digit=obj.nextInt();
        for(int i=0;i<size;i++)
        {
            int value=(arr[i]/10)%10;
            if(value==digit)
            {
                temp[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<j;i++)
        {
            for(int k=0;k<j;k++)
            {
                if(temp[i]<temp[k])
                {
                    int ele=temp[i];
                    temp[i]=temp[k];
                    temp[k]=ele;
                }
            }
        }
        for(int i=0;i<size;i++)
        {
            int value=(arr[i]/10)%10;
            if(value==digit)
            {
                System.out.print(temp[t]+" ");
                t++;
            }
            else 
                System.out.print(arr[i]+" ");
        }
    }
}