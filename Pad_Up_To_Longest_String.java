// The program must accept N string values as the input. The program must pad the
// string values with asterisks character in the front so that the length of all the string
// values will be equal to the length of the longest string. Finally the program must print
// the modified string values as the output.

// Boundary Condition(s):
// 1 <= N, Length of string <= 100

// Input Format:
// The first line contains N.
// The next N lines contain N string values.

// Output Format:
// The first N lines contain the modified string values.

// Example Input/Output 1:
// Input:
// 5
// trillion
// million
// chocolate
// zap
// mango

// Output:
// *trillion
// **million
// chocolate
// ******zap
// ****mango

// Explanation:
// The longest string is chocolate having the length 9.
// The other string values are padded with asterisks in front so that each string will
// contain 9 characters including asterisks.

// Example Input/Output 2:
// Input:
// 4
// drum
// pocket
// minion
// dragon

// Output:
// **drum
// pocket
// minion
// dragon


import java.util.*;
public class Pad_Up_To_Longest_String
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),len=0,temp=0,val=0,asterik=0;
        String[] b=new String[a];
        for(int i=0;i<a;i++)
            b[i]=obj.next();
        for(int i=0;i<a;i++)
        {
            temp=b[i].length();
            if(temp>len)
            {
                len=temp;
            }
        }
        for(int i=0;i<a;i++)
        {
            if(b[i].length()<len)
            {
                val=len-b[i].length();
                asterik=Math.abs(val);
                for(int j=0;j<asterik;j++)
                    System.out.print("*");
                
            }
            System.out.print(b[i]);
            System.out.println();
        }
    }
}