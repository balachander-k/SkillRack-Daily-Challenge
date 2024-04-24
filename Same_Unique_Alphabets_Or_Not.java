// The program must accept two string values Sl and S2 containing only alphabets
// as the input. The program must print yes if the given two string values contain the
// same unique alphabets. Else the program must print no as the output.'

// Boundary Condition(s):
// 2 <= Length of Sl, S2 <= 100

// Input Format:
// The first line contains Sl.
// The second line contains S2.

// Output Format:
// The first line contains yes or no.

// Example Input/Output 1:
// Input:
// GOOGLe
// LeGO

// Output:
// yes

// Explanation:
// The unique alphabets in the string GOOGLe are G, O, L and e.
// The unique alphabets in the string LeGO are L, e, G and O.
// Here the given two string values contain the same unique alphabets. So yes is
// printed as the output.

// Example Input/Output 2:
// Input:
// pot
// post

// Output:
// no



import java.util.*;
public class Same_Unique_Alphabets_Or_Not
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int count=0;
        char[] s1=obj.next().toCharArray(),s2=obj.next().toCharArray();
        HashSet<Character> set1=new HashSet<Character>();
        HashSet<Character> set2=new HashSet<Character>();
        for(int i=0;i<s1.length;i++)
            set1.add(s1[i]);
        for(int i=0;i<s2.length;i++)
            set2.add(s2[i]);
        ArrayList<Character> l1=new ArrayList<Character>();
        ArrayList<Character> l2=new ArrayList<Character>();
        Collections.sort(l1);Collections.sort(l2);
        if(l1.size()==l2.size())
        {
            for(int i=0;i<l2.size();i++)
                if(l1.get(i)==l2.get(i))count++;
            System.out.print((count==l1.size())?"yes":"no");
        }
        else 
            System.out.print("no");
    }
}