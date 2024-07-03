// The program must accept an integer N as the input. The program must form an integer X
// by shifting the digits at even positions in N once to the right. Then the program must print
// 2*X as the output.

// Boundary Condition(s):
// 10 <= N 10^15

// Input Format:
// The first line contains N.

// Output Format:
// The first line contains 2*X.

// Example Input/Output 1:
// Input:
// 123456

// Output:
// 326508

// Explanation:
// In the given integer 123456, the digits in even positions are 2, 4, 6.
// After shifting the digits in even positions for 1 time to the right, the integer becomes
// 163254.
// After doubling the integer value, the integer becomes 326508 (2x163254).
// Hence the output is 326508

// Example Input/Output 2:
// 789335467

// Output:
// 1539666914


import java.util.*;
public class Shift_Digits_And_Double 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        char[] s=obj.next().toCharArray();
        int h=0;
        String val="";
        for(int i=0;i<s.length;i++)
            if((i+1)%2==0)
                list.add(Integer.valueOf(s[i])-'0');
        int last=list.get(list.size()-1);
        for(int i=list.size()-1;i>0;i--)
            list.set(i,list.get(i-1));
        list.set(0,last);
        for(int i=0;i<s.length;i++)
        {
            if((i+1)%2==0)
                val+=String.valueOf(list.get(h++));
            else 
                val+=String.valueOf(s[i]);
        }
        System.out.print(Long.valueOf(val)*2);
    }
}