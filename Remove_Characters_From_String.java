// The program must accept a string S and a character CH as the input. The program
// must remove all the occurrences of CH in the string S and print it as the output.

// Boundary Condition(s):
// 2 <= Length of S <= 100

// Example Input/Output 1:
// Input:
// icecream
// c

// Output:
// ieream

// Explanation:
// The character has occurred 2 times in the string "i e ream". So they are
// removed from the string and printed as the output

// Example Input/Output 2:
// Input:
// greatappleshouldbeanapple
// p

// Output:
// greataleshouldbeanale


import java.util.*;
public class Remove_Characters_From_String 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.next();
        char b=obj.next().charAt(0);
        for(int i=0;i<a.length();i++)
            if(a.charAt(i)!=b)
                System.out.print(a.charAt(i));
    }
}