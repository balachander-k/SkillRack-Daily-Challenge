// The program must accept two integers N and K as the input. The program must
// print the longest suffix in N which is divisible by K as the output. If there is no such
// suffix, the program must print -1 as the output.

// Boundary Condition(s):
// 1 <= K <= N <=10^8

// Input Format:
// The first line contains N and K separated by a space.

// Output Format:
// The first line contains the longest suffix in N which is divisible by K.

// Example Input/Output 1:
// Input:
// 10554 9

// Output:
// 54

// Explanation:
// Here N=10554 and
// The integer 54 is the longest suffix in 10554, which is divisible by 9. So 54 is
// printed as the output.

// Example Input/Output 2:
// Input:
// 674 8

// Output:
// -1


import java.util.*;
public class Longest_Suffix_Divisble_By_K
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        String con="";
        char[] s=obj.next().toCharArray();
        int k=obj.nextInt();
        for(int i=s.length-1;i>=0;i--)
        {
            con=s[i]+con;
            int temp=Integer.valueOf(con);
            if(temp%k==0)list.add(temp);
        }
        if(list.size()==0)System.out.print("-1");
        else 
        {
            Collections.sort(list);
            System.out.print(list.get(list.size()-1));
        }
    }
}