// The program must accept a list of integers as the input. The program must print
// the desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 1 <= Each integer value <= 100

// Input Format:
// The first line contains the list of integers.

// Output Format:
// The lines containing the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 5 6 1 4 2

// Output:
// *****
// **-**
// **-*-
// **-*-
// **---
// -*---

// Example Input/Output 2:
// Input:
// 7 3 4 5

// Output:
// ****
// ****
// ****
// *-**
// *--*
// *---
// *---




import java.util.*;
public class Vertically_Downward_Asterisks_Pattern 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        int max=Integer.MIN_VALUE;
        while(obj.hasNext())
        {
            int temp=obj.nextInt();
            list.add(temp);
            if(temp>max)
                max=temp;
        }
        for(int i=0;i<max;i++)
        {
            for(int j=0;j<list.size();j++)
            {
                int t=list.get(j);
                if(t>0)
                    System.out.print("*");
                if(t<=0)
                    System.out.print("-");
                int r=--t;
                list.set(j,r);
                if(r<=0)
                    list.set(j,0);
            }
            System.out.println();
        }
    }
}