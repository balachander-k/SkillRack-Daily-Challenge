// The program must accept N integers as the input. The program must print the
// maximum possible sum S of integers which are having the same unit digit among
// the N integers.

// Boundary Condition(s):
// 1 <= N <=100
// 1 <= Each integer value <= 10^6

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains S.

// Example Input/Output 1:
// Input:
// 5
// 60 69 39 98 20

// Output:
// 108

// Explanation:
// The sum of integers which are having 9 as the unit digit is 108 (69 + 39).
// The sum of integers which are having O as the unit digit is 80 (60 + 20).
// The only integer which is having 8 as the unit digit is 98.
// Among the above sum values, 108 is maximum. So 108 is printed as the output.

// Example Input/Output 2:
// Input:
// 8
// 15 98 67 95 18 93 48 97

// Output:
// 164


import java.util.*;
public class Maximum_Sum_Same_Unit_Digit
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),max=Integer.MIN_VALUE;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            int flast=arr[i]%10,sum=arr[i];
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]%10==flast)
                {
                    sum=sum+arr[j];
                    arr[j]=0;
                }
            }
            if(sum>max)
                max=sum;
        }
        System.out.print(max);
    }
}