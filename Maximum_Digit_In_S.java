// The program must accept a string S as the input. The program must print the digit in
// string S which has occurred the maximum number of times as the output. If two or
// more digits have occurred for the maximum number of times then the program must
// print the smallest digit among them as the output.

// Note: Atleast one digit is present in S.
// Boundary Condition(s):
// 1 <= Length of S <=1O^4

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains the digit which has occurred the maximum number of times

// Example Input/Output 1:
// Input:
// The cost of hp ac033tx is 45,0000.

// Output:
// 0
// Explanation:
// The count of occurrence of the digit O is 5.
// The count of occurrence of the digit 3 is 2.
// The count of occurrence of the digit 4 is 1.
// The count of occurrence of the digit 5 is 1.
// Here the count of occurrence of the digit 0 is maximum.
// Hence the output is O.

// Example Input/Output 2:
// Input:
// The Finite work requires atleast 125 man power.

// Output:
// 1

import java.util.*;
public class Maximum_Digit_In_S
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        int[] arr=new int[10];
        char[] b=a.toCharArray();
        int max=0,index=0;
        for(int i=0;i<a.length();i++)
        {
            if(Character.isDigit(b[i]))
            {
                int temp=Integer.parseInt(String.valueOf(b[i]));
                arr[temp]++;
            }
        }
        for(int i=0;i<10;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                index=i;
            }
        }
        for(int i=0;i<10;i++)
        {
            if(arr[i]==max && i<index)
            {
                max=arr[i];
                index=i;
            }
        }
        System.out.print(index);
    }
}