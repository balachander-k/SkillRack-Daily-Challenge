// The program must accept two space separated string values Sl, S2 and an integer N as the
// input. The program must print the common words of size N in both the string values based
// on their order of occurrence in Sl as the output. If the common words are repeated more
// than once in both the string values, the program must print such words only once. If there
// are no such common words then the program must print -1 as the output.

// Boundary Condition(s):
// 3 <= Length of S2 <= 1000
// 1 <=  N <= 20

// Input Format:
// The first line contains Sl.
// The second line contains S2.
// The third line contains N.

// Output Format:
// The first line contains the common word(s) of size N separated by a space or -1.

// Example Input/Output 1:
// Input:
// He wore a turban made of gold
// He was a young man of great promise
// 2

// Output:
// He of

// Explanation:
// The common words of size 2 in both the string values are He and of.
// Hence the output is He of.

// Example Input/Output 2:
// Input:
// the cat is under the bed
// the Cat is beside the table
// 3

// Output:
// the

// Example Input/Output 3:
// Input:
// If you want to build a solid structure
// you need to put down the first few blocks in the right place
// 4

// Output:
// -1


import java.util.*;
public class String_Common_Words
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        Set<String> list=new LinkedHashSet<String>();
        String s1=obj.nextLine(),s2=obj.nextLine();
        int N=obj.nextInt();
        String[] farr=s1.split(" "),sarr=s2.split(" ");
        for(int i=0;i<farr.length;i++)
            for(int j=0;j<sarr.length;j++)
                if(farr[i].equals(sarr[j]) && farr[i].length()==N)
                    list.add(farr[i]);
        ArrayList<String> l=new ArrayList<String>(list);
        if(!list.isEmpty())
            for(int i=0;i<list.size();i++)
                System.out.print(l.get(i)+" ");
        else 
            System.out.print("-1");
    }
}