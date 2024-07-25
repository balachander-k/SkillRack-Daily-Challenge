// The program must accept two string values Sl and S2 as the input. The program must print
// the characters in S2 in ascending order based on the positions of their last occurrence in Sl.
// Note: All the characters in S2 are always present in Sl.

// Boundary Condition(s):
// 1 <= Length of Sl, S2 <= 100

// Input Format:
// The first line contains Sl.
// The second line contains S2.

// Output Format:
// The first line contains a string representing the characters of S2 as per the given condition.

// Example Input/Output 1:
// Input:
// earthquakes
// shake

// Output:
// hakes

// Explanation:
// Here Sl is earthquakes and S2 is shake.
// The position of the last occurrence of s in earthquakes is 11.
// The position of the last occurrence of h in earthquakes is 5.
// The position of the last occurrence of a in earthquakes is 8.
// The position of the last occurrence of k in earthquakes is 9.
// The position of the last occurrence of e in earthquakes is 10.
// So the characters in shake are printed in ascending order based on the positions of their
// last occurrence in Sl.
// Hence the output is
// hakes


// Example Input/Output 2:
// Input:
// SoftwareHardwares
// SHortS

// Output:
// SSotHr



import java.util.*;
public class Last_Occurence_Sorting
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        char[] s1=obj.next().toCharArray(),s2=obj.next().toCharArray();
        for(int i=0;i<s2.length;i++)
        {
            int index=0;
            for(int j=0;j<s1.length;j++)
                if(s2[i]==s1[j])
                    index=j;
            list.add(index);
        }
        for(int i=0;i<s2.length;i++)
        {
            int min=Integer.MAX_VALUE,index=0;
            for(int j=0;j<list.size();j++)
                if(list.get(j)<min){
                    min=list.get(j);
                    index=j;
                }
        System.out.print(s2[index]);
        list.set(index,Integer.MAX_VALUE);
        }
    }
}