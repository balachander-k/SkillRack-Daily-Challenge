// There are N passengers in a ship. The ship collides with an iceberg and slowly sinking into
// the sea. The passengers must be evacuated from the ship based on the following
// conditions.
// - Every minute, only one person can evacuate from the ship.
// - Children should be given high priority, then women and men.
// The program must accept the name and the category(children, women and men) of N
// passengers and an integer X as the input. The program must print the number of children,
// women and men who can be evacuated from the ship within X minutes as the output.

// Boundary Condition(s):
// 1 <= N, x <= 100
// 1 <= Length of the passenger's name <= 25

// Input Format:
// The first line contains N.
// The next N lines, each containing the name and the category of a passenger separated by a
// space.
// The (N +2)nd line contains X.

// Output Format:
// The first line contains three integers representing the number of children, women and men
// who can be evacuated from the ship within X minutes.

// Example Input/Output 1:
// Input:
// 7
// xyz men
// ABCD children
// Abc women
// PQRS women
// EFG children
// Mno children
// ijk men
// 4

// Output:
// 3 1 0

// Explanation:
// There are 7 passengers in the ship and X = 4
// 3 Children + 2 Women + 2 Men.
// Att = 1, 1 child can be evacuated.
// Att = 2, 1 child can be evacuated.
// Att = 3, 1 child can be evacuated.
// At t = 4, 1 woman can be evacuated.
// Hence the output is
// 3 1 0
// Example Input/Output 2:
// Input:
// 5
// PQR men
// stu women
// Xyz children
// abc children
// IJKL children
// 2

// Output:
// 2 0 0


import java.util.*;
public class Ship_Evacuate_Passengers
{
    public static void main(String[] arg)
    {
        Stack<String> child=new Stack<String>();
        Stack<String> women=new Stack<String>();
        Stack<String> men=new Stack<String>();
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        obj.nextLine();
        for(int i=0;i<N;i++)
        {
            String val=obj.nextLine();
            String[] arr=val.split(" ");
            if(arr[1].equals("children"))
                child.push(arr[1]);
            else if(arr[1].equals("women"))
                women.push(arr[1]);
            else 
                men.push(arr[1]);
        }
        int x=obj.nextInt(),w=0,m=0,c=0;
        for(int i=0;i<x;i++)
        {
            if(!child.isEmpty())
            {
                child.pop();
                c++;
            }
            else if(!women.isEmpty())
            {
                women.pop();
                w++;
            }
            else if(!men.isEmpty())
            {
                men.pop();
                m++;
            }
        }
        System.out.print(c+" "+w+" "+m);
    }
}