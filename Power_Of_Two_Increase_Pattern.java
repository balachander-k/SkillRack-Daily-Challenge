// The program must accept an integer N as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 3 <= N < = 1000

// Input Format:
// The first line contains N.

// Output Format:
// The lines containing the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 7

// Output:
// 1 
// 2 3 
// 4 5 6 7 

// Example Input/Output 2:
// Input:
// 31

// Output:
// 1
// 2 3
// 4 5 6 7
// 8 9 10 11 12 13 14 15
// 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 

// Example Input/Output 3:
// Input:
// 20

// Output:
// 1 
// 2 3 
// 4 5 6 7
// 8 9 10 11 12 13 14 15 
// 16 17 18 19 20 * * * * * * * * * * * 

import java.util.*;
public class Power_Of_Two_Increase_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),t=0,w=0,temp=0,power=0,star=0;
        while(true)
        {
            power=(int)Math.pow(2,t);
            for(int j=1;j<=power;j++)
            {
                System.out.print((++w)+" ");
                if(w==N)
                {
                    temp=1;
                    star=j;
                }
            }
            if(temp==1)break;
            t++;
            System.out.println();
        }
        if(power!=star)
            for(int j=star;j<power;j++)
                System.out.print("*"+" ");
    }
}