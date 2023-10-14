// The program must accept a string S as the input. The program must print YES if all
// the characters in the string S are same. Else the program must print NO as the
// output.

// Boundary Condition(s):
// 1 <= Length of S <= 1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains YES or NO.

// Example Input/Output 1:
// Input:
// aaaaaaaaaaaa

// Output:
// YES

// Example Input/Output 2:
// Input:
// bbbbbbbbbbbbcccccccc

// Output:
// NO


import java.util.*;
public class All_Same_Characters
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] temp=obj.next().toCharArray();
        int[] arr=new int[26];
        for(int i=0;i<temp.length;i++)
        {
            int ascii=temp[i]-97;
            int retri=arr[ascii];
            arr[ascii]=++retri;
        }
        for(int i=0;i<arr.length;i++)
            if(arr[i]!=0)
                count++;
        System.out.print((count==1)?"YES":"NO");
    }
}