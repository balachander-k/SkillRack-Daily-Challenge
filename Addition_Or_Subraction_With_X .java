// The program must accept N integers and an integer X as the input. The program must add
// X with the even integers among N integers and subtract X from the odd integers among N
// integers. Finally, the program must print the modified values of N integers as the output.

// Boundary Condition(s):
// 1 <=N, X <=1000

// Input Format:
// The first line contains an Integer N.
// The second line contains the N integers separated by a space.
// The third line contains the integer X.

// Output Format:
// The first line contains the modified N integers separated by a space(s).

// Example Input/Output 1:
// Input:
// 5
// 12 23 34 55 56
// 3

// Output:
// 15 20 37 52 59

// Explanation:
// The even integers are 12 34 and 56. So add 3 with these even integers (15, 37, 59).
// The odd integers are 23 and 55. So subtract 3 with these odd integers (20, 52).
// Hence the output is 15 30 37 52 59

// Example Input/Output 2:
// Input:
// 7
// 1 2 3 4 5 6 7
// 4

// Output:
-3 6 -1 8 1 10 3


import java.util.*;
public class Addition_Or_Subraction_With_X 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[] array=new int[a];
        for(int i=0;i<a;i++)
            array[i]=obj.nextInt();
        int c=obj.nextInt();
        for(int i=0;i<a;i++)
        {
            if(array[i]%2==0)System.out.print((array[i]+c)+" ");
            else System.out.print((array[i]-c)+" ");
        }
    }
}