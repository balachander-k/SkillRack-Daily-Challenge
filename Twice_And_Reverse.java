// The program must accept two integers N and T as the input. The program must print the
// integers from N to 1 in thel row and then in the 2 row the values must be twice that of
// the values in the 1 row in reverse order. Then in the 3 row the values must be twice that
// of the values in the 2nd row. Similarly, the program must repeat the process for T rows and
// print the integer values.

// Boundary Condition(s):
// 2 <= N, T <= 30

// Input Format:
// The first line contains N and T separated by a space.

// Output Format:
// The first T lines, each contains N integers separated by a space.

// Example Input/Output 1:
// Input
// 4 5 
// Output:
// 4 3 2 1
// 2 4 6 8
// 16 12 8 4
// 8 16 24 32
// 64 48 32 16

// Explanation:
// Here N = 4 and T = 5.
// The ISt row contains 4 integers 4 3 2 1 from 4 to 1.
// The 2 row contains 4 integers 2 4 6 8, which are twice the values in the ISt row in the
// reverse order.
// The 3rd row contains 4 integers 16 12 8 4, which are twice the values in the 2nd row in the
// reverse order.
// The 4th row contains 4 integers 8 16 24 32, which are twice the values in the 3rd row in the
// reverse or er.
// The 5th row contains 4 integers 64 48 32 16, which are twice the values in the 4th row in the
// reverse order.

// Example Input/Output 2:
// Input:
// 5 4 

// Output:
// 5 4 3 2 1
// 2 4 6 8 10
// 20 16 12 8 4
// 8 16 24 32 40



import java.util.*;
public class Twice_And_Reverse
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Long> list=new ArrayList<Long>();
        int N=obj.nextInt(),T=obj.nextInt();
        for(int i=N;i>=1;i--)
            list.add(((long)i);
        for(int j=0;j<list.size();j++)
            System.out.print(list.get(j)+" ");
        System.out.println();
        for(int i=1;i<=T-1;i++)
        {
            for(int j=0;j<list.size();j++)
                list.set(j,list.get(j)*2);
            if(i%2!=0)
                for(int j=list.size()-1;j>=0;j--)
                    System.out.print(list.get(j)+" ");
            else 
                for(int j=0;j<list.size();j++)
                    System.out.print(list.get(j)+" ");
            System.out.println();
        }
    }
}