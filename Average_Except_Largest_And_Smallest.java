// The program must accept N integers as the input. The program must print the average M of all the integers with the precision up to two decimal places except the largest and smallest values among N integers as the output. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value.

// Boundary Conditon(s);
// 3<= N <=10^6
// 1<= Each integer value <=999

// Input Format:
// The first line contains the value of N.
// The second line contains N integers separated by space(s).

// Output Format:
// The first line contains the value of M.

// Example Input/Output 1:
// Input:
// 4
// 22 11 56 97

// Output:
// 39.00

// Explanation:
// Here the largest integer is 97 and the smallest integer is 11.
// So the average of 22 and 56 is 39.00
// Hence the output is 39.00

// Example Input/Output 2:
// Input:
// 7
// 75 36 80 43 67 80 25

// Output:
//  60.20
 
 

import java.util.*;
public class Average_Except_Largest_And_Smallest
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[] b=new int[a];
        int temp;
        for(int i=0;i<a;i++)
            b[i]=obj.nextInt();
        Arrays.sort(b);
        float sum=0,count=0;
        for(int i=1;i<a-1;i++)
        {
            sum=sum+b[i];
            count++;
        }
        float e=sum/count;
        System.out.format("%.2f",e);
    }
}