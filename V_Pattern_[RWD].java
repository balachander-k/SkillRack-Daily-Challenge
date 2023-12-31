// The program must accept an integer N as the input. The program must print the
// desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 3 <= N <= 100

// Input Format:
// The first line contains N.

// Output Format:
// The lines contain the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 9

// Output:
// *#######*
// #*#####*#
// ##*###*##
// ###*#*###
// ####*####

// Example Input/Output 2:
// Input:
// 14
// *############*
// #*##########*#
// ##*########*##
// ###*######*###
// ####*####*####
// #####*##*#####
// ######**######



import java.util.*;
public class V_Pattern_[RWD] 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),t=(N%2!=0)?(N/2+1):(N/2);
        for(int i=0;i<t;i++)
        {
            for(int j=1;j<=N;j++)
            {
                if((i+1==j) || (j==N-i))
                    System.out.print("*");
                else 
                    System.out.print("#");
            }
            System.out.println();
        }
    }
}