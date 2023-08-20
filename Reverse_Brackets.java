// The program must accept a string S as the input. The program must reverse the
// characters between the brackets '(' and in S. Then the program must remove the
// brackets and print the modified string S as the output.

// Note: The string S always contains only one pair of brackets in the order '('and')'.

// Boundary Condition(s):
// 4 <= Length of S <= 1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains modified string S.

// Example Input/Output 1:
// Input:
// foo(labt)l

// Output:
// football

// Explanation:
// The characters within the brackets are "labt".
// After reversing those characters, the string becomes football.
// Hence the output is football.

// Example Input/Output 2:
// Input:
// MO(NSOON)

// Output:
// MONOOSN


import java.util.*;
public class Reverse_Brackets
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next();
        ArrayList<Character> list=new ArrayList<>();
        int count=0,co=0,v=0,index=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='(' || count>0)
            {
                if(a.charAt(i)==')')
                    break;
                if(a.charAt(i)!='(')
                    list.add(a.charAt(i));
                count++;
            }
        }
        Collections.reverse(list);
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='(' || co>0)
            {
                try{
                    System.out.print(list.get(v));
                    co++;
                    v++;
                }
                catch(Exception e)
                {
                    index=i;
                    break;
                }
            }
            else 
                System.out.print(a.charAt(i));
        }
        for(int i=index+2;i<a.length();i++)
            System.out.print(a.charAt(i));
    }
}