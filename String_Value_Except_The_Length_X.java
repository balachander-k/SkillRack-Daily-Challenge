// The program must accept N string values and an integer X as the input. The program must print all the string values except the string values with the length X. If all the N string values are of the same length as X then the program must print -1 as the output.

// Boundary Condition(s);
// 1<= N <=100
// 1<= X< Length of each string <=1000

// Input Format:
// The first line contains the values of N and X separated by a space.
// The next N lines each contain a string.

// Output Format:
// The list of linex each contains a string or the first line contains -1.

// Example Input/Output 1:
// Input:
// 4 6
// football
// player
// cricket
// coder

// Output:
// football
// cricket
// coder

// Explanation:
// Only the string "player" has the length 6. SO it is not printed in the output.

// Example Input/Output 2:
// Input:
// 4 3 
// all 
// age
// and 
// are

// Output:
// -1





import java.util.*;
public class String_Value_Except_The_Length_X
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt();
        String[] c=new String[a];
        for(int i=0;i<a;i++)c[i]=obj.next();
        int count=0;
        for(int i=0;i<a;i++)
        {
            if(c[i].length()==b)count++;
            else System.out.println(c[i]);
        }
        if(count==a)System.out.print("-1");
    }
}