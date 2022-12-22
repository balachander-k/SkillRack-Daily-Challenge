// The program must accpet an integer N the input. The program must print the desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s);
// 1<= N <=10^7

// Input Format:
// The first line contains the value of N.

// Output Format:
// The list of lines contains the desired pattern as shown in the Example input/Output section.

// Example Input/Output 1:
// Input:
// 8

// Output:
// 1000
// 0**0
// 0**0
// 0001

// Example Input/Output 2:
// Input:
// 7

// Output:
// 111
// 1*1
// 111


import java.util.*;
public class Binary_Pattern 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        String b=Integer.toBinaryString(a);
        char[] c=b.toCharArray();
        String temp="";
        for(int val=1;val<=c.length-2;val++)temp=temp+c[val];
        char[] d=temp.toCharArray();
        int len=b.length();
        int min_len=len-2;
        int w=0,s=d.length-1;
        System.out.println(b);
        for(int i=0;i<d.length;i++)
        {
            for(int j=0;j<len;j++)
            {
                if(j==0)
                {
                    System.out.print(d[w]);
                    w++;
                }
                if(j==len-1)
                {
                    System.out.print(d[s]);
                    s--;
                }
                if((j!=0) && (j!=len-1))System.out.print("*");
            }
            System.out.println();
        }
        for(int i=b.length()-1;i>=0;i--)System.out.print(c[i]);
    }
}