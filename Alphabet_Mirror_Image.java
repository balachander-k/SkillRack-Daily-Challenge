// The program must accept an integer N as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// I < = N 26

// Input Format:
// The first line contains N.

// Output Format:
// The first N lines contain the pattern as shown in the Example Input/Output section.

// Example Input/Output 1:
// Input:
// 3

// Output:
// abc*cba
// ab***ba
// a*****a

// Example Input/Output 2:
// Input:
// 4

// Output:
// abcd*dcba
// abc***cba
// ab*****ba
// a*******a


import java.util.*;
public class Alphabet_Mirror_Image
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),temp=a,s=1;
        char b='a',c='0';
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<temp;j++)
            {
                System.out.print(b+" ");
                b++;
            }
            for(int j=0;j<s;j++)
                System.out.print("*"+" ");
            c=--b;
            for(int j=0;j<temp;j++)
            {
                System.out.print(c+" ");
                c--;
            }
            s=s+2;
            temp--;
            b='a';
            System.out.println();
        }
    }
}