// The program must accept a string S containing multiple words separated by a comma as
// the input. The program must print the words in the string S that are formed using alphabets
// from the same row of the American keyboard. If there is no such word in the string S, the
// program must print -1 as the output.

// The alphabets in the three rows of the American keyboard are given below:
// Q W E R T Y U I O P
// A S D F G H J K L
// Z X C V B N M

// Boundary Condition(s):
// 2 <= Length of S <= 1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the words in the string S or -1 as per the given condition.

// Example Input/Output 1:
// Input
// HELLO,DAD,PEACE

// Output:
// DAD

// Explanation:
// In the word HELLO, all the alphabets are not present in the same row of the American
// keyboard.
// In the word DAD, all the alphabets are present in the same row(2 row) of the American
// keyboard.
// In the word PEACE, all the alphabets are not present in the same row of the American
// keyboard.
// So the word DAD is printed as the output.

// Example Input/Output 2:
// Input:
// root,had,bad,cat,water

// Output:
// root had

// Example Input/Output 3:
// Input:
// happy,world

// Output:
// -1


import java.util.*;
public class American_Keyboard_Same_Row
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        String[] arr=s.split(",");
        char[][] keyboard={{'Q','W','E','R','T','Y','U','I','O','P'},{'A','S','D','F','G','H','J','K','L'},{'Z','X','C','V','B','N','M'}};
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            char[] charr=arr[i].toCharArray();
            for(int j=0;j<keyboard.length;j++)
            {
                int count=0;
                for(int k=0;k<keyboard[j].length;k++)
                {
                    for(int t=0;t<charr.length;t++)
                    {
                        char ch=Character.toUpperCase(charr[t]);
                        if(keyboard[j][k]==ch)
                            count++;
                    }
                }
                if(count==arr[i].length())
                {
                    System.out.print(arr[i]+" ");
                    c++;
                }
            }
        }
        if(c==0)System.out.print("-1");
    }
}