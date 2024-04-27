// The program must accept a string S representing an expression as the input. The
// program must parse the expression S and print the numbers for the parentheses in
// S based on the following conditions.

// - The first pair of parentheses are represented by 1.
// - The second pair of parentheses are represented by 2 and so on.

// Note: The expression S is always valid.

// Boundary Condition(s):
// 2 <= Length of S <= 100

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the numbers for the parentheses in S separated by a space
// based on the given conditions.

// Example Input/Output 1:
// Input:
// (A+B*(c+d)*(e-f))

// Output:
// 1 2 2 3 3 1

// Explanation:
// The first pair of parentheses are highlighted below.
// (A+B*(c+d)*(e-f))
// The second pair of parentheses are highlighted below.
// (A+B*(c+d)*(e-f))
// The third pair of parentheses are highlighted below.
// (A+B*(c+d)*(e-f))
// Hence the numbers for the parentheses are 1 2 2 3 3 1

// Example Input/Output 2:
// Input:
// ()()(()()((())))

// Output:
// 1 1 2 2 3 4 4 5 5 6 7 8 8 7 6 3


import java.util.*;
public class Parentheses_Number
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        Stack<Integer> stack=new Stack<Integer>();
        char[] s=obj.next().toCharArray();
        int count=1;
        for(int i=0;i<s.length;i++)
        {
            if(s[i]=='(')
            {
                stack.push(count);
                list.add(count);
                count++;
            }
            else if(s[i]==')')
                list.add(stack.pop());
        }
        for(int i=0;i<list.size();i++)
            System.out.print(list.get(i)+" ");
    }
}