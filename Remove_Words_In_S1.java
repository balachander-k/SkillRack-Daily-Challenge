// The program must accept two lines of string values with space Sl and S2 as the
// input. The program must remove all the words in S2 from Sl and print the
// remaining words as the output. If all the words in Sl are present in S2 then the
// program must print -1 as the output. 
// Note: There is exactly one space between every two words.

// Boundary Condition(s):
// 1 <= Length of Sl and S2 <= 1000

// Input Format:
// The first line contains Sl.
// The second line contains S2.

// Output Format:
// The first line contains the words in Sl as per the given condition or -1.

// Example Input/Output 1:
// Input:
// join us for the party
// party with us in home

// Output:
// join for the

// Explanation:
// The words in S2 appearing in Sl are "us" and "party".
// They are removed. Hence the output is join for the

// Example Input/Output 2:
// Input:
// cycling is good
// I like cycling and it is good

// Output:
// -1


import java.util.*;
public class Remove_Words_In_S1
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        String b=obj.nextLine();
        String[] c=a.split(" ");
        String[] d=b.split(" ");
        int flag=0;
        for(int i=0;i<c.length;i++)
        {
            String val=c[i];
            int count=0;
            for(int j=0;j<d.length;j++)
            {
                if(val.equals(d[j]))
                {
                    count++;
                    flag=0;
                }
            }
            if(count==0)
                System.out.print(val+" ");
        }
        if(flag==c.length)
            System.out.print("-1");
    }
}