// The program must accept a string S and Q queries as the input. The query can be any one
// of the following.

// S++ -> Append the last character of S to the string S.
// ++S -> Prepend the first character of S to the string S.
// S+l -> Concatenate the string values S and S.
// For each query, the program must modify the string S based on the specified query and
// print the modified string as the output.

// Boundary Condition(s):
// 1 <= Length of S <= 100
// 1 <= N <= 20

// Input Format:
// The first line contains S.
// The second line contains Q.
// The next Q lines, each contains a query.

// Output Format:
// The first Q lines, each contains a string representing the modified string S.

// Example Input/Output 1:
// Input:
// Task
// 3

// Output:
// Taskk
// TaskkTaskk
// TTaskkTaskk

// Explanation:
// Here S = Task.
// After the 1st query S++, the string becomes Taskk.
// After the 2nd query S+l, the string becomes TaskkTaskk.
// After the 3rd query ++S, the string becomes TTaskkTaskk.
// Hence the output is
// Taskk
// TaskkTaskk
// TTaskkTaskk

// Example Input/Output 2:
// Input:
// dove
// 5

// Output:
// dovee
// doveedovee
// doveedoveee
// ddoveedoveee
// ddoveedoveeeddoveedoveee


import java.util.*;
public class Append_Prepend_Concatenate
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        String temp=String.valueOf(s);
        int q=obj.nextInt();
        String[] query=new String[q];
        for(int i=0;i<q;i++)
            query[i]=obj.next();
        for(int i=0;i<q;i++)
        {
            if(query[i].equals("S++"))
            {
                temp=temp+temp.charAt(temp.length()-1);
                System.out.println(temp);
            }
            else if(query[i].equals("++S"))
            {
                temp=temp.charAt(0)+temp;
                System.out.println(temp);
            }
            else 
            {
                temp=temp+temp;
                System.out.println(temp);
            }
        }
    }
}