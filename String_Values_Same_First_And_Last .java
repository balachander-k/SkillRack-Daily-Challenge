// The program  must accept two string values S1 and  S2 as the input. The program must print YES  if the first alphabet of S1 and the first alphabet of S2 are equal and the last alphabet of S1 and the last alphabet of S2 are equal. Else the program must print NO as the output.

// Note: S1 and S2 contain only lower case alphabets.

// Boundary Condition(s);
// 2<= Length of S1, S2 <=100

// Input Format:
// The first line contains the string S1.
// The second line contains the string S2.

// Output Format:
// The first line contains the either YES or NO.

// Example Input/Output 1:
// Input:
// blackthunder
// breaker

// Output:
// yes

// Explanation:
// The first alphabets of "blackthunder" and "breaker" are same
// The last alphabets of "blackthunder" and "breaker" are same.
// Hence the output is YES.


// Example Input/Output 2:
// Input:
// first
// last

// Output:
// NO



import java.util.*;
public class String_Values_Same_First_And_Last 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] a=obj.nextLine().toCharArray();
        char[] b=obj.nextLine().toCharArray();
        int count=0;
        if(a[0]==b[0])
            count++;
        if(a[a.length-1]==b[b.length-1])
            count++;
        if(count==2)
            System.out.print("YES");
        else 
            System.out.print("NO");
    }
}