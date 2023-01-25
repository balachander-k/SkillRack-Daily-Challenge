// The program must accept N integer and an integer X as the input. The program must print yes if the first X integers are equal to the last X integers in the given order. Else the program must print no as the output.

// Boundary Condition(s);
// 1<= N <=1000
// 1<= X <=N/2

// Input Format:
// The first line contains the value of N.
// The second line contains N integers separated by space(s).
// The third line contains the value of X.

// Output Format:
// The first line contains either yes or no.

// Example Input/Output 1:
// Input:
// 6
// 9 22 28 15 9 22
// 2

// Output:
// yes

// Explanation:
// The first two integers are 9 and 22.
// The last two integers are 9 and 22.
// Here the first two integers are equal to the last two integer.
// Hence the output is yes

// Example Input/Output 2:
// Input:
// 6 
// 9 22 28 15 9 22
// 1

// Output:
// no


import java.util.*;
public class First_And_Last_X_Integers
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=++a;
        int[] c=new int[b];
        for(int i=0;i<a;i++)
            c[i]=obj.nextInt();
        int size=c[b-1];
        int[] last=new int[size];
        int val=b-2;
        for(int i=0;i<size;i++)
        {
            last[i]=c[val];
            val--;
        }
        int w=size,count=0;
        for(int i=0;i<size;i++)
        {
            if(c[i]==last[w-1])
                count++;
            w--;
        }
        if(count==size)
            System.out.print("yes");
        else 
            System.out.print("no");
    }
}