// The program must accept an integer N as the input. The program must print YES if
// the integer N is formed using exactly two digits. Else the program must print NO
// as the output.

// Boundary Condition(s):
// 10 <= N < = 10<8

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains YES or NO.

// Example Input/Output 1:
// Input:
// 57755

// Output:
// YES

// Explanation:
// The integer 57755 is formed using exactly two digits 5 and 7.
// Hence the output is YES

// Example Input/Output 2:
// Input:
// 247722

// Output:
// NO

// Example Input/Output 3:
// Input:
// 77

// Output:
// NO


import java.util.*;
public class Integers_With_Two_Digits
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        int[] arr=new int[10];
        int count=0;
        for(int i=0;i<s.length;i++)
        {
            int temp=Integer.valueOf(s[i])-'0';
            int val=arr[temp];
            arr[temp]=++val;
        }
        for(int i=0;i<arr.length;i++)
            if(arr[i]!=0)
                count++;
        System.out.print((count==2)?"YES":"NO");
                
    }
}