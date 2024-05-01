// The program must accept N integers and an integer K as the input. The program
// must remove the first K even digits among the digits of N integers. Then the
// program must print the sum of the modified integer values as the output. If all the
// digits in an integer are even, the entire integer will be removed.

// Note:
// - At least one integer is always having at least one odd digit.
// - At least K even digits are always present in the N integers.

// Boundary Condition(s):
// 1 <= N, K <= 100
// 1 <= Each integer value <= 10^8

// Input Format:
// The first line contains N and K separated by a space.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains the sum of the modified integer values.

// Example Input/Output 1:
// Input:
// 5 7
// 1963 2937 544 2673 2350

// Output:
// 1558

// Explanation:
// Here K = 7.
// After removing the first 7 even digits, the integers become 193, 937, 5, 73 and
// 350.
// so their sum 1558 (193 + 937 + 5 + 73 + 350 = 1558) is printed as the output.

// Example Input/Output 2:
// Input:
// 4 6
// 657 824 509 2001

// Output:
// 117

// Explanation:
// After removing the first 6 even digits, the integers become 57, 59 and 1 (001 is
// equal to 1).
// so their sum 117 (57 + 59 + 1 -
// — 117) is printed as the output.

import java.util.*;
public class Remove_First_K_Even_Digits
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),k=obj.nextInt(),c=1,sum=0;
        String[] arr=new String[n];
        for(int i=0;i<n;i++)
            arr[i]=obj.next();
        for(int i=0;i<n;i++)
        {
            char[] carr=arr[i].toCharArray();
            String v="";
            for(int j=0;j<carr.length;j++)
            {
                int temp=Integer.valueOf(carr[j])-'0';
                if(temp%2==0 && c>=k)
                    c++;
                else 
                    v+=carr[j];
            }
            if(v.length()==0)
                v="0";
            sum+=Integer.valueOf(v);
        }
        System.out.print(sum);
    }
}