// The program must accept N integers and an integer X as the input. The program must print YES if the X occurs excatly X times. Else the program must print NO as the output.

// Boundary Condition(s);
// 1<= N,X <=1000
// 1<= Each integer  value <=10^8

// Input Format:
// The first line contains the value of N.
// The second line contains N integers separated by a space(s).
// The third line contains the value of X.

// Output Format:
// The first line contains either YES or NO.

// Example Input/Output 1:
// Input:
// 5
// 2 1 5 2 4
// 2

// Output:
// YES

// Explanation:
// Here 2 occurs exactly 2 times.
// Hence the output is YES

// Example Input/Output 2:
// Input:
// 8
// 5 7 5 6 5 8 10 5
// 5

// Output:
// NO


import java.util.*;
public class X_Occurs_Exactly_X_Times
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        int[] array=new int[N];
        for(int i=0;i<N;i++)array[i]=obj.nextInt();
        int X=obj.nextInt(),count=0;
        for(int i=0;i<N;i++)
            if(array[i]==X)count++;
        if(count==X)System.out.print("YES");
        else System.out.print("NO");
    }
}