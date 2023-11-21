// The program must accept a string S containing alphabets and digits as the input.
// For each substring X containing only digits in the string S, the program must
// replace the substring X by the largest digit in it. Then the program must print the
// modified string S as the output.

// Boundary Condition(s):
// 2 <= Length of S <=100

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the modified string S.

// Example Input/Output 1:
// Input:
// abc132sdfg789090kokok30k

// Output:
// abc3sdfg90kokok30k

// Explanation:
// In the given string abcl 32sdfg789090kokok30k,
// The first substring 132 is replaced by the largest digit 3.
// The second substring 78909 is replaced by the largest digit 9.
// The third substring 3 has only one digit so keep as it is.
// So abc3sdfg90kokok30k is printed as the output.

// Example Input/Output 2:
// Input:
// 123562A

// Output:
// 6A


import java.util.*;
public class Replace_Consecutive_Digit_By_Max 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        int c=0;
        for(int i=0;i<s.length;i++)
        {
            if(Character.isAlphabetic(s[i]))
                System.out.print(s[i]);
            else 
            {
                int max=Integer.MIN_VALUE;
                for(int j=i;j<s.length;j++)
                {
                    if(!Character.isAlphabetic(s[j]))
                    {
                        int r=Integer.valueOf(s[j])-48;
                        if(r>max)
                            max=r;
                        c=j;
                    }
                    else 
                        break;
                }
                i=c;
                System.out.print(max);
            }
        }
    }
}