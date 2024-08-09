// The program must accept two string values Sl and S2 as the input. For each alphabet CH in
// Sl, the program must print CH and its nearest alphabet present in the string S2. If an
// alphabet has two nearest alphabets, then the program must print the smallest alphabet
// between them (i.e., If a and e are the nearest alphabets of c, then consider a as the nearest
// alphabet).

// Note: Both Sl and S2 are always in the same case (upper or lower).

// Boundary Condition(s):
// 2 <= Length of Sl, S2 <= 100

// Input Format:
// The first line contains Sl and S2 separated by a space.

// Output Format:
// The first line contains the characters based on the given conditions.

// Example Input/Output 1:
// Input:
// verified correct

// Output:
// Vt ee rr ie fe ie ee dc

// Explanation:
// Here Sl = verified and S2 = correct.
// The nearest alphabet of v is t.
// The nearest alphabet of e is e.
// The nearest alphabet of r is r.
// The nearest alphabet of i is e.
// The nearest alphabet of f is e.
// The nearest alphabet of i is e.
// The nearest alphabet of e is e.
// There are two nearest alphabets (c and e) for d. So the smallest alphabet c is considered.
// Hence the output is
// Vt ee rr ie fe ie ee dc

// Example Input/Output 2:
// Input:
// MONOPOLY INDIA

// Output:
// MN ON NN ON PN ON LN YN


import java.util.*;
public class Nearest_Character 
{
    public static char findNear(char ch,String s2)
    {
        int min=Integer.MAX_VALUE;
        char n=' ';
        for(char s:s2.toCharArray())
        {
            int dis=Math.abs(ch-s);
            if(dis<min)
            {
                min=dis;
                n=s;
            }
            else if(dis==min && s<n)
                n=s;
        }
        return n;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String s1=obj.next(),s2=obj.next();
        for(char ch:s1.toCharArray())
        {
            char near=findNear(ch,s2);
            System.out.print((char)ch);
            System.out.print((char)near+" ");
        }
    }
}