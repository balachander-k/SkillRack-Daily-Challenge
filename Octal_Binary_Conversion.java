// The program must accept an integer N representing the octal representation of an
// integer X as the input. The program must print the binary representation of X as the
// output.
// Note: N is always a valid octal representation.

// Boundary Condition(s):
// 1 <= N <=10^6

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the binary representation of X.

// Example Input/Output 1:
// Input:
// 14

// Output:
// 1100

// Explanation:
// 14 is the octal representation of 12.
// So the binary representation of 12 is 1100.
// Hence the output is 1100

// Example Input/Output 2:
// Input:
// 11

// Output:
// 1001


import java.util.*;
public class Octal_Binary_Conversion 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> oct=new ArrayList<Integer>();
        ArrayList<Integer> bin=new ArrayList<Integer>();
        int N=obj.nextInt(),deci=0,base=1;
        while(N!=0)
        {
            int temp=N%10;
            N=N/10;
            deci=deci+(temp*base);
            base=base*8;
        }
        while(deci!=0)
        {
            bin.add(deci%2);
            deci=deci/2;
        }
        for(int i=bin.size()-1;i>=0;i--)
            System.out.print(bin.get(i));
    }
}