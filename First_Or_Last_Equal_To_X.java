// The program must accept a list of integers and an integer X as the input. The
// program must print YES if the first integer of the list is equal to X or the last
// integer of the list is equal to X. Else the program must print NO as the output.

// Boundary Condition(s):
// 1 <= X, Each integer value <= 10^4

// Input Format:
// The first line contains a list of integers separated by a space.
// The second line contains X.

// Output Format:
// The first line contains YES or NO.

// Example Input/Output 1:
// Input:
// 41 10 54 87 12 10
// 10

// Output:
// YES

// Explanation:
// Here X=IO.
// The last integer of the list is also 10.
// So YES is printed as the output.

// Example Input/Output 2:
// Input:
// 98 15 154 98 98 21 98
// 154

// Output:
// NO

import java.util.*;
public class First_Or_Last_Equal_To_X
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int count=0;
        ArrayList<Integer> list=new ArrayList<Integer>();
        while(obj.hasNext())
            list.add(obj.nextInt());
        int v=list.get(list.size()-1);
        for(int i=0;i<list.size()-1;i++)
            if((list.get(i)==v && i==0) || (list.get(i)==v && i==list.size()-2))
                count++;
        System.out.print((count!=0?"YES":"NO"));
        
    }
}