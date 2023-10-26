// The program must accept a fraction X/Y as the input. X represents the size of the
// pattern and Y represents the number Of digits required to represent each integer in
// the pattern. The program must print the desired pattern as shown in the Example
// Input/Output section.

// Boundary Condition(s):
// 2<= X <= 50
// 1<= Y <=15

// Input Format:
// The first line contains X/Y.

// Output Format:
// The first X lines contain the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 5/3

// Output:
// 001 002 003 004 005
// 006 007 008 009 010
// 011 012 013 014 015
// 016 017 018 019 020
// 021 022 023 024 025

// Example Input/Output 2:
// Input:
// 3/5

// Output:
// 00001 00002 00003
// 00004 00005 00006
// 00007 00008 00009

// Example Input/Output 3:
// Input:
// 10/1

// Output:
// 1 2 3 4 5 6 7 8 9 0
// 1 2 3 4 5 6 7 8 9 0
// 1 2 3 4 5 6 7 8 9 0
// 1 2 3 4 5 6 7 8 9 0
// 1 2 3 4 5 6 7 8 9 0
// 1 2 3 4 5 6 7 8 9 0
// 1 2 3 4 5 6 7 8 9 0
// 1 2 3 4 5 6 7 8 9 0
// 1 2 3 4 5 6 7 8 9 0
// 1 2 3 4 5 6 7 8 9 0



import java.util.*;
public class Fraction_Number_Increment_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String val=obj.next();
        String[] sep=val.split("/");
        int size=Integer.parseInt(sep[0]),t=1,co=0,q=1;
        int digit=Integer.parseInt(sep[1]),te=size*size;
        while(q<=te)
        {
            co++;
            int len=(int)Math.log10(t)+1;
            int dif=Math.abs(len-digit);
            if(len<digit)
                for(int k=1;k<=dif;k++)
                    System.out.print("0");
            if(len>digit)
                t=0;
            System.out.print(t+" ");
            if(co==size)
            {
                System.out.println();
                co=0;
            }
            t++;
            q++;
        }
    }
}