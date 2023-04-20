// The program must accept N integers as the input. The program must print the
// output based on the following conditions.
// - If N is odd then the program must print the middle three integers as the output.
// - If N is even then the program must print the middle four integers as the output.

// Boundary Condition(s):
// 5 <= N < = 1000

// Input Format:
// The first line contains the integer N.
// The second line contains N integers separated by space(s).

// Output Format:
// The first line contains either middle three or middle four integers separated by a
// space based on the conditions mentioned above.

// Example Input/Output 1:
// Input:
// 5
// 11 22 33 44 55

// Output:
// 22 33 44

// Explanation:
// The integer N is odd.
// So the middle three integers are 22, 33 and 34 (1 1,22,33,44,55) are printed.
// Hence the output is 22 33 44

// Example Input/Output 2:
// Input:
// 8
// 51 23 43 78 19 25 36 43

// Output:
// 43 78 19 25




import java.util.*;
public class Middle_Integers
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),ind=a/2;
        int[] b=new int[a];
        for(int i=0;i<a;i++)
            b[i]=obj.nextInt();
        if(a%2==0)
            System.out.print(b[ind-2]+" "+b[ind-1]+" "+b[ind]+" "+b[ind+1]);
        if(a%2!=0)
            System.out.print(b[ind-1]+" "+b[ind]+" "+b[ind+1]);
    }
}