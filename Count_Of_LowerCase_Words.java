// The program must accept a string S as the input. The program must print the
// count of words having only lowercase alphabets as the output.

// Boundary Condition(s):
// 1 <= Length of S <= 100

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains the count of words having only lowercase alphabets.

// Example Input/Output 1:
// Input:
// Learning never exhausts the mind

// Output:
// 4
// Explanation:
// There are 4 words having only lowercase alphabets. They are "never", "exhausts",
// "the" and "mind".

// Example Input/Output 2:
// Input:
// Asdf ;lkj AWERQFA ;OIUPJ; gFtFrF hJyJuJ

// Output:
// 0


import java.util.*;
public class Count_Of_LowerCase_Words
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        String[] b=a.split(" ");
        int count=0,word=0,len=0;
        for(int i=0;i<b.length;i++)
        {
            char[] c=b[i].toCharArray();
            len=c.length;
            for(int j=0;j<c.length;j++)
            {
                if(Character.isLowerCase(c[j]))
                    count++;
            }
            if(count==len)
                word++;
            count=0;
        }
        System.out.print(word);
    }
    
}