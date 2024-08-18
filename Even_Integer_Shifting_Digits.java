// The program must accept an integer N as the input. The program must print the even
// integers that can be formed by shifting the digits to the right in N.

// Note:
// - At least 1 even digit is always present in N.
// - The resulting even integers must be printed without leading zeros.

// Boundary Condition(s):
// 10 <= N <= 10^17

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains the even integers that can be formed by shifting the digits to the right
// in N.

// Example Input/Output 1:
// Input:
// 4763

// Output:
// 3476 7634

// Explanation:
// Here N = 4763 and the integers formed by shifting the digits to the right are given below.
// 4763
// 3476
// 6347
// 7634

// So the even integers formed are 3476 and 7634.
// Hence the output is
// 3476 7634

// Example Input/Output 2:
// Input:
// 1020030

// Output:
// 1020030 3010200 301020 30102 2003010


import java.util.*;
public class Even_Integer_Shifting_Digits
{
    public static void main(String[] arg)
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        Scanner obj=new Scanner(System.in);
        char[] n=obj.next().toCharArray();
        String t=String.valueOf(n);
        if(Integer.valueOf(t)%2==0)list.add(Integer.valueOf(t));
        for(int i=0;i<n.length-1;i++)
        {
            String temp="";
            char last=n[n.length-1];
            for(int j=n.length-1;j>0;j--)
                n[j]=n[j-1];
            n[0]=last;
            temp=String.valueOf(n);
            if(Integer.valueOf(temp)%2==0)
                list.add(Integer.valueOf(temp));
        }
        for(int i=0;i<list.size();i++)
            System.out.print(list.get(i)+" ");
    }
}