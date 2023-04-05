// The program must accept an integer N as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// O <= N <=10^8

// Input Format:
// The first line contains N.

// Output Format:
// The first N lines contain integers as shown in the Example Input/Output section.

// Example Input/Output 1:
// Input:
// 74381

// Output:
// 7
// 44444444
// 333
// 8888
// 1111111

// Example Input/Output 2:
// Input:
// 5019

// Output:
// 555555555
// 0
// -
// 99999



import java.util.*;
public class Digits_Reverse_Pattern 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] c=a.toCharArray();
        int len=a.length()-1;
        for(int i=0;i<a.length();i++)
        {
            int temp=Integer.parseInt(String.valueOf(c[len]));
            if(temp==0)
                System.out.print("-");
            else 
            {
                for(int j=temp;j>=1;j--)
                {
                    System.out.print(c[i]);
                }
            }
            len--;
            System.out.println();
        }
    }
}