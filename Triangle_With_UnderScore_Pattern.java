// The program must accept an odd integer N as the input. The program must print
// the desired pattern as shown in Example Input/Output section.
// Hint: Use underscore _ to print the first line of the desired pattern.

// Boundary Condition(s):
// 3 <= N <= 99

// Input Format:
// The first line contains N.

// Output Format:
// The lines containing the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 3

// Output:
// ____
// \**/
// *\/

// Example Input/Output 2:
// Input:
// 5

// Output:
// ______
// \****/
// *\**/
// **\/

import java.util.*;
public class Triangle_With_UnderScore_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),c=n-1,e=0;
        String uscr="_",aste="*";
        System.out.println(uscr.repeat(n+1));
        while(true)
        {
            if(e>=1)
                System.out.print(aste.repeat(e));
            System.out.print("\\");
                for(int i=1;i<=c;i++)
                    System.out.print("*");
            System.out.print("/"+"\n");
            c=c-2;
            if(c<0)
                break;
            e++;
        }
    }
}