// The program must accept a string S as the input. The program must print the
// substring values of S in reverse order as the output.

// Boundary Condition(s):
// 2 <= Length of S <= 100

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the substring values of S in reverse order.

// Example Input/Output 1:
// Input:
// Brick

// Output:
// kckickrickBrick

// Explanation:
// In the string "Brick", the last one character is k. So k is printed.
// The last two characters are c and k. So ck is printed.
// The last three characters are i c and k So ick is printed.
// The last four characters are r i c and k So rick is printed.
// The last five characters are B ri c and k. So Brick is printed.

// Example Input/Output 2:
// Input:
// dolphin

// Output:
// ninhinphinlphinolphindolphin


import java.util.*;
public class SubString_From_End 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] temp=obj.next().toCharArray();
        String t="";
        for(int i=temp.length-1;i>=0;i--)
        {
            String val="";
            for(int j=temp.length-1;j>=i;j--)
                val=temp[j]+val;
            t=t+val;
        }
        System.out.print(t);
    }
}