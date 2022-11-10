// The program must accept a string S.The program must print S as a matrix with C columns.
// The value of C is passed as the input. If the last row is not filled with C characters, the pad
// the remaining columns with * as shown in the Example Input/Output section.

// Boundary Condition(s);
// 1 <= Length of S <= 100

// Input Format:
// The first line contains the string S and an integer C separated by a space.

// Output Format:
// The list of lines containing the matrix as showin in the Example Input/Output section.

// Example Input/Output 1:
// Input 
// skillrack 4

// Output:
// skil
// lrac
// k***

// Example Input/Output 2:
// Input:
// dailychallenge 5

// Output:
// daily
// chall
// enge*


import java.util.*;
public class String_To_Matrix_With_C_Columns
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        int b=obj.nextInt();
        char[] c=a.toCharArray();
        int[] d=new int[a.length()];
        int sum=0,store=0,k=0,count=0,r=0,w=0;
        int len=a.length();
        for(int i=0;i<a.length();i++)
        {
            if(sum<a.length())
            {
                sum=sum+b;
                d[k]=sum;
                k++;
                count++;
            }
        }
        int temp=count-1;
        for(int i=0;i<a.length();i++)
        {
            if(r<temp)
            {
                if(d[r]==i)
                {
                   System.out.println();
                    r++;
                    w++;
                }
            }
            System.out.print(c[i]);
        }
        if(len!=d[temp])
        {
            while(len<d[temp])
            {
                System.out.print("*");
                len++;
            }
        }
    }
}