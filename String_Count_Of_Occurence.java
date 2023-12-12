// The program must accept a string S containing only alphabets as the input. The
// program must print the alphabets of S based on the count of their occurrence. If
// more than one alphabets have the same occurrence count, the program must print
// the alphabets in the alphabetical order as the output.
// Note: The string S is case sensitive.

// Boundary Condition(s):
// 1 <= Length of S <= 1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the alphabets of S based on the count of their occurrence.

// Example Input/Output 1:
// Input:
// AAAbbbbccccccdddEEE

// Output:
// cbAEd

// Explanation:
// The count of occurrence of c is 6, so c is printed at first.
// The count of occurrence of b is 4, so b is printed at second.
// The alphabets A, d and E have the same count of occurrence 3, so they are printed
// // in alphabetical order.
// Hence the output is cbAEd

// Example Input/Output 2:
// Input:
// SkillRack

// Output:
// klRSaci


import java.util.*;
public class String_Count_Of_Occurence 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int[] arr=new int[256];
        ArrayList<Integer> list=new ArrayList<Integer>();
        char[] s=obj.next().toCharArray();
        for(int i=0;i<s.length;i++)
        {
            int temp=(int)s[i];
            arr[temp]=++arr[temp];
        }
        for(int i=0;i<arr.length;i++)
            if(arr[i]!=0)
                list.add(arr[i]);
        Collections.sort(list);
        for(int i=list.size()-1;i>=0;i--)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==list.get(i))
                {
                    System.out.print((char)j);
                    arr[j]=0;
                    break;
                }
            }
        }
    }
}