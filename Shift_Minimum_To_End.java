// The program must accept N integers and an integer K as the input. The program
// must perform the following operation K times in the given N integers.
// - Shift the minimum integer between the first two integers to the end.
// Finally, the program must print the N modified integers as the output.

// Boundary Condition(s):
// 2 <= N <= 100
// 1 <= Each integer value <= 1000
// 1 <= K <= 100

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.
// The third line contains K.

// Output Format:
// The first line contains the N modified integers.

// Example Input/Output 1:
// Input:
// 5
// 29 60 84 26 50
// 4

// Output:
// 84 29 60 26 50

// Explanation:
// Here N = 5 and K = 4.
// The given 5 integers are 29, 60, 84, 26 and 50.
// After the ISt shifting operation, the integers become 60, 84, 26, 50 and 29.
// After the 2n shifting operation, the integers become 84, 26, 50, 29 and 60.
// After the 3rd shifting operation, the integers become 84, 50, 29, 60 and 26.
// After the 4th shifting operation, the integers become 84, 29, 60, 26 and 50.
// Hence the output is
// 84 29 60 26 50

// Example Input/Output 2:
// Input:
// 6
// 4 5 6 3 2 1
// 3

// Output:
// 6 2 1 4 5 3


import java.util.*;
public class Shift_Minimum_To_End
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        int N=obj.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
            list.add(obj.nextInt());
        int k=obj.nextInt();
        for(int i=1;i<=k;i++)
        {
            int first=list.get(0),second=list.get(1);
            if(first<second)
            {
                for(int j=0;j<list.size()-1;j++)
                    list.set(j,list.get(j+1));
                list.set(list.size()-1,first);
            }
            else 
            {
                for(int j=1;j<list.size()-1;j++)
                    list.set(j,list.get(j+1));
                list.set(list.size()-1,second);
            }
        }
        for(int i=0;i<list.size();i++)
            System.out.print(list.get(i)+" ");
    }
}