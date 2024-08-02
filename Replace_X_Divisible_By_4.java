// A number N with its last digit masked as X is passed as the input to the program. The
// program must print all the possible numbers which are divisible by 4 by replacing X in N in
// ascending order as the output.

// Boundary Condition(s):
// 10 <= N <= 10^18

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the numbers based on the given condition.

// Example Input/Output 1:
// Input:
// 6447X

// Output:
// 64472 64476

// Explanation:
// The two possible numbers divisible by 4 are 64472 and 64476.

// Example Input/Output 2:
// Input:
// 246X

// Output:
// 2460 2464 2468

import java.util.*;
public class Replace_X_Divisible_By_4
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        char[] s=obj.next().toCharArray();
        for(int i=0;i<=9;i++)
        {
            String temp="";
            for(int j=0;j<s.length-1;j++)
                temp+=String.valueOf(s[j]);
            temp+=String.valueOf(i);
            if(Long.valueOf(temp)%4==0)
                list.add(Integer.valueOf(temp));
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++)
            System.out.print(list.get(i)+" ");
    }
}