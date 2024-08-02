// The program must accept two string values Sl and S2 of equal length as the input. The
// program must print yes if the two string values have the same frequency pattern. Else the
// program must print no as the output.
// If the two string values Sl and S2 have the same frequency pattern, then the number of
// characters in each frequency in both Sl and S2 will be the same.
// Consider Sl = "apple" and S2 = "tenth".
// There are 3 characters that have occurred once in both Sl and S2 (ale and enh).
// There is 1 character that has occurred twice in both Sl and S2 (p and t).
// Here both Sl and S2 have the same frequency pattern.

// Boundary Condition(s):
// 1 <= Length of Sl, S2 <=1000

// Input Format:
// The first line contains Sl.
// The second line contains S2.

// Output Format:
// The first line contains yes or no.

// Example Input/Output 1:
// Input:
// abbbbcccdd
// ppppqqrrrs

// Output:
// yes

// Explanation:
// Here Sl = abbbbcccdd and S2 = ppppqqrrrs.
// Frequency 1 -> a in Sl and s in S2.
// Frequency 2 -> d in Sl and q in S2.
// Frequency 3 -> c in Sl and r in S2.
// Frequency 4 -> b in Sl and p in S2.
// Both Sl and S2 have the same frequency pattern. So yes is printed as the output.

// Example Input/Output 2:
// Input:
// BOok
// Look

// Output:
// no


import java.util.*;
public class Same_Frequency_Pattern 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s1=obj.next().toCharArray(),s2=obj.next().toCharArray();
        ArrayList<Integer> l1=new ArrayList<Integer>();
        ArrayList<Integer> l2=new ArrayList<Integer>();
        int[] f=new int[256],s=new int[256];
        int count=0;
        for(int i=0;i<s1.length;i++)
        {
            int as=(int)s1[i];
            int temp=f[as];
            f[as]=++temp;
        }
        for(int i=0;i<s2.length;i++)
        {
            int as=(int)s2[i];
            int temp=s[as];
            s[as]=++temp;
        }
        for(int i=0;i<f.length;i++)
            if(f[i]!=0)l1.add(f[i]);
        for(int i=0;i<s.length;i++)
            if(s[i]!=0)l2.add(s[i]);
        Collections.sort(l1);Collections.sort(l2);
        if(l1.size()!=l2.size())
            System.out.print("no");
        else 
        {
            for(int i=0;i<l1.size();i++)
                if(l1.get(i)==l2.get(i))count++;
            System.out.print((count==l1.size())?"yes":"no");
        }
    }
}