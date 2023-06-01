// The program must accept a string S and integer X as the input. For every X characters
// in S, the program must swap the first and last character in the X characters. Finally,
// the program must print the modified string as the output.
// Note: The length of S is always divisible by X.

// Boundary Condition(s):
// 2 <= Length of S <= 10000
// 2 <= X <= Length of S

// Input Format:
// The first line contains the string S and the integer X separated by a space.

// Output Format:
// The first line contains the modified string.

// Example Input/Output 1:
// Input:
// tacgod 3

// Output:
// catdog

// Explanation:
// The first 3 characters are 't','a'and 'c'. After swapping the first and last character, the
// string becomes "catgod".
// The second 3 characters are 'g','o',and 'd'. After swapping the first and last character, the string becomes "catdog".
// Hence the output is catdog

// Example Input/Output 2:
// Input:
// oDnwolda 2

// Output:
// Download


import java.util.*;
public class Swap_First_And_Last_Every_X
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next();
        int b=obj.nextInt(),j=0;
        int len=a.length()/b;
        char[] c=a.toCharArray();
        for(int i=0;i<len;i++)
        {
            String val="";
            int temp=0;
            while(temp!=b)
            {
                val=val+c[j];
                j++;
                temp++;
            }
            char[] arr=val.toCharArray();
            for(int k=0;k<val.length();k++)
            {
                if(k==0)
                    System.out.print(arr[val.length()-1]);
                if(k==val.length()-1)
                    System.out.print(arr[0]);
                if(k!=0 && k!=val.length()-1)
                    System.out.print(arr[k]);
            }
        }
    }
}