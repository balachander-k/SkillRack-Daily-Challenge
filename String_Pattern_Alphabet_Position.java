// The program must accept a string S as the input. The program must print the desired pattern
// as shown in the Exaople Input/Output section.

// Note: All the alphabets in S are only in lower case.

// Boundary Condition(s):
// 1 <= Length of S <= 1000

// Input Format:
// The first line contains the string S.

// Output Format:
// The list of lines entaining the desired pattern as shown in the Example Input/Output section.


// Example Input/Output 1:
// Input:
// abcdacg

// Output:
// a
// bb
// ccc
// dddd
// a
// ccc
// ggggggg 

// Example Input/Output 2:
// Input:
// skillrack

// Output:
// sssssssssssssssssss
// kkkkkkbkkk
// iiiiiiiii
// llllllllllll
// llllllllllll
// rrrrrrrrrrrrrrrrr
// a
// ccc
// kkkkkkkkkk


import java.util.*;
public class String_Pattern_Alphabet_Position
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] b=a.toCharArray();
        for(int i=0;i<a.length();i++)
        {
            int ascii=b[i]-97;
            for(int j=0;j<=ascii;j++)
            {
                System.out.print(b[i]);
            }
            System.out.println();
        }
    }
}