// The program must accept two integers X and Y as the input. The program must
// print the uncommon factors of X and Y in descending order as the output. If there
// is no uncommon factor then the program must print -1 as the output.

// Boundary Condition(s):
// 1 X, Y <= 1000

// Input Format:
// The first line contains X and Y separated by a space.

// Output Format:
// The first line contains either the uncommon factors of X and Y or -1.

// Example Input/Output 1:
// Input:
// 24 100

// Output:
// 100 50 25 24 20 12 10 8 6 5 3

// Explanation:
// The factors of 24 are 1, 2, 3, 4, 6, 8, 12 and 24.
// The factors of 100 are 1, 2, 4, 5, 10, 20, 25, 50 and 100.
// Here the uncommon factors are 3, 5, 6, 8, 10, 12, 20, 24, 25, 50 and 100. so they
// are printed in descending order as the output.

// Example Input/Output 2:
// Input:
// 36 36

// Output:
// -1

import java.util.*;
public class Print_Uncommon_Factors 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        long X=obj.nextLong(),Y=obj.nextLong();
        ArrayList<Long> list=new ArrayList<Long>();
        for(long i=1;i<=X;i++)
            if(X%i==0 && Y%i!=0)
                list.add(i);
        for(long i=1;i<=Y;i++)
            if(Y%i==0 && X%i!=0)
                list.add(i);
        Collections.sort(list);
        for(int i=list.size()-1;i>=0;i--)
            System.out.print(list.get(i)+" ");
        if(list.size()==0)
            System.out.print("-1");
    }
}