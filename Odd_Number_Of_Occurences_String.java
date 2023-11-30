// The program must accept a string S as the input. The program must print the
// characters with an odd number of occurrences in the order of their occurrence in S
// as the output. If there is no such character in the string S then the program must
// print -1 as the output.

// Boundary Condition(s):
// 2 <= Length of S <=1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the characters with an odd number of occurrences in the
// order of their occurrence in S.

// Example Input/Output 1:
// Input:
// nneettwwoorkwo

// Output:
// work

// Explanation:
// In the string nneettwwoorkwo, only the four characters w, o, r, and k have
// occurred the odd number of times.
// Hence the output is work

// Example Input/Output 2:
// Input:
// 5#ATE5#5#

// Output:
// 5#ATE

// Example Input/Output 3:
// Input:
// roboticsrobotics

// Output:
// -1



import java.util.*;
public class Odd_Number_Of_Occurences_String 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        int[] arr=new int[256];
        int count=0;
        for(int i=0;i<s.length;i++)
            arr[(int)s[i]]=++arr[(int)s[i]];
        for(int i=0;i<s.length;i++)
        {
            if(arr[(int)s[i]]%2!=0)
            {
                System.out.print(s[i]);
                arr[(int)s[i]]=0;
                count++;
            }
        }
        if(count==0)System.out.print("-1");
        
    }
}