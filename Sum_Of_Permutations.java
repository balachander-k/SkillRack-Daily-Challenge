// The program must accept an integer N as the input. The program must print the
// sum of permutations of the digits in N as the output.

// Boundary Condition(s):
// 10 <= N < = 10^8

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the sum of permutations of the digits in N.

// Example Input/Output 1:
// Input:
// 231

// Output:
// 1332

// Explanation:
// The permutations of the digits in 231 are 231, 213, 123, 132, 321 and 312. So the
// sum is 1332 (231 +213+123+132+321 +312).
// Hence the output is 1332

// Example Input/Output 2:
// Input:
// 7865

// Output:
// 173316


import java.util.*;
public class Sum_Of_Permutations
{
    public static ArrayList<Integer> list=new ArrayList<Integer>();
    public static String swap(String str,int i,int j)
    {
        char [] t=str.toCharArray();
        char ch=t[i];
        t[i]=t[j];
        t[j]=ch;
        return String.valueOf(t);
    }
    public static void Permutation(String str,int start,int end)
    {
        if(start==end-1)
            list.add(Integer.valueOf(str));
        else 
        {
            for(int i=start;i<end;i++)
            {
                str=swap(str,start,i);
                Permutation(str,start+1,end);
                str=swap(str,start,i);
            }
        }
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int sum=0;
        String val=obj.next();
        Permutation(val,0,val.length());
        for(int i=0;i<list.size();i++)
            sum+=list.get(i);
        System.out.print(sum);
    }
}