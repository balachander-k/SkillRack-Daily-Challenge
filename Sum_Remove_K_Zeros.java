// The program must accept N integers and an integer K as the input. The program must
// remove the first K zeroes in the cumulative binary representation of N integers. Then the
// program must print the sum of the N modified integer values as the output.
// Note: At least K zeroes are always present in the cumulative binary representation of N
// integers.

// Boundary Condition(s):
// 2 <= N <= 100
// 1 <= K <= 100
// 1 <= Each integer value <= 10^4

// Input Format:
// The first line contains N and K separated by a space.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains the sum of the N modified integer values.

// Example Input/Output 1:
// Input:
// 4 7
// 21 75 127 86

// Output:
// 179

// Explanation:
// After removing the first 7 zeroes in the cumulative binary representation of 4 integers, the
// integers become 7, 15, 127 and 30.
// So their sum 179 (7+ 15+127+30 = 179) is printed as the output.

// Example Input/Output 2:
// Input:
// 55
// 5 6 8 10 12

// Output:
// 29

// Explanation:
// The binary representation of the 5 integers are 101, 110, 1000, 1010 and 1100.
// After removing the first 5 zeroes in the cumulative binary representation of 5 integers, the
// integers become 3, 3, 1, 10 and 12.
// So their sum 29 (3+3+1 +10+12 = 29) is printed as the output.


import java.util.*;
public class Sum_Remove_K_Zeros
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),k=obj.nextInt(),count=1,sum=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            String temp=Integer.toBinaryString(arr[i]),s="";
            for(int j=0;j<temp.length;j++)
            {
                if(count<=k && temp.charAt(j)=='0')
                    count++;
                else 
                    s+=temp.charAt(j);
            }
            sum+=Integer.valueOf(s,2);
        }
        System.out.print(sum);
    }
}