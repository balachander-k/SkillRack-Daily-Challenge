// The program must accept N pairs as the input. Each pair contains a string value S followed by
// an integer L. The integer in each pair represents the length of a among N string values.
// The program must print all the string values with the position of their length value among the
// given pairs as the Output

// Note: The length values Of N String values are unique.

// Boundary Condition(s);
// 1 <= N <= 100
// 1 <= Length Of S in each pair, L <= 1000

// Input Format:
// The first line contains the value of N.
// The next N lines each contain the value S and L separated by a space.

// Output Format:
// The first N lines each contain the string value and an integer separated by a space based on
// the above conditions.

// Example Input/Output 1:
// Input
// 4
// watch 3
// bottle 5
// car 4
// lion 6

// Output:

// watch 2
// bottle 4
// car 1
// lion 3

// Explanation:
// The length of the string watch is 5 which is present in the 2nd pair. So 2 printed.
// The length of the string bottle is 6 which is present in the 4th pari. So 4 is printed.
// The length of the string car is 3 which is present in the 1st pair. So 1 printed.
// The length of the string lion is 4 which is present in the 3rd pair. So 3 printed.


// Example Input/Output 2:
// Input:
// 7
// PoelzPnF 5
// WOXPgh 2
// IcmU 7
// Lm 9
// PUQfE6
// SKLuonm 8
// SrYLvwtxZ 4

// Output:

// PoelzPnF 6
// WOXPgh 5
// IcmU 7
// Lm 2
// PUQfE 1
// SKLuonm 3
// SrYLvwtxZ 4




import java.util.*;
public class Match_The_Length 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        String[] b=new String[a];
        int[] c=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=obj.nextInt();
            c[i]=obj.next();
        }
        for(int i=0;i<a;i++)
        {
            int len=b[i].length();
            for(int j=0;j<a;j++)
            {
                if(len==c[j])
                {
                    System.out.prinln(b[i]+" "+(j+1));
                    break;
                }
            }
        }
    }
}