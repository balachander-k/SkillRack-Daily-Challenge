// The program must accept a string S containing lower case alphabets as the input.
// The program must sort the repeated alphabets in S in their positions. Then the
// program must print the modified string S as the output.

// Boundary Condition(s):
// 2 <= Length of S <= 100

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the modified string S.

// Example Input/Output 1:
// Input:
// skillrack

// Output:
// skiklracl

// Explanation:
// The repeated alphabets in the string "skillrack" are highlighted below
// skillrack
// After sorting the repeated alphabets in their positions, the string becomes
// " skiklracl"
// So skiklracl is printed as the output.

// Example Input/Output 2:
// Input:
// abcbgbchcbftflkf

// Output:
// abbbgbchccftflkf

// Example Input/Output 3:
// Input:
// tattarrattat

// Output:
// aaaarrtttttt


import java.util.*;
public class Repeated_Alphabets_Inplace_Sort 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s=obj.next().toCharArray();
        ArrayList<Character> list=new ArrayList<Character>();
        for(int i=0;i<s.length;i++)
        {
            int count=0;
            for(int j=0;j<s.length;j++)
            {
                if(i!=j)
                {
                    if(s[i]==s[j] && s[j]!='0')
                    {
                        list.add(s[j]);
                        s[j]='0';
                        count++;
                    }
                }
            }
            if(count!=0)
            {
                list.add(s[i]);
                s[i]='0';
            }
        }
        int j=0;
        Collections.sort(list);
        for(int i=0;i<s.length;i++)
            if(s[i]=='0')
                s[i]=list.get(j++);
        System.out.print(String.valueOf(s));
    }
}