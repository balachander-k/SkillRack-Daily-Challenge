// The program must accept three integers N, X and Y as the input. The program must print
// the first N terms in the following series.
// X+l, Y+l, 2Y-1, 3X+1, 3Y+1, 4Y-1, 5X+1, 5Y+1,....

// Boundary Condition(s):
// 2 <= N <= 100
// 1 <= X, Y <= 1000

// Input Format:
// The first line contains N, X and Y separated by a space.

// Output Format:
// The first line contains the first N terms in the given series separated by a space.

// Example Input/Output 1:
// Input
// 10 2 5

// Output:
// 3 6 3 9 7 16 7 19 11 26

// Explanation:
// Here N = 10, X = 2 and Y = 5.
// The first IO terms in the given series are 3(2+1), 6(5+1), 3(2*2-1), 9(2*5-1), 7(3*2+1),
// and
// Hence the output is
// 3 6 3 9 7 16 7 19 11 26

// Example Input/Output 2:
// Input
// 15 9 1

// Output:
// 10 2 17 1 28 4 35 3 46 6 53 5 64 8 71


import java.util.*;
public class N_Terms_Double_Series      
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        int n=obj.nextInt(),x=obj.nextInt(),y=obj.nextInt(),count=1,i=1;
        while(count<=n)
        {
            if(i%2!=0)
            {
                int X=(i*x)+1,Y=(i*y)+1;
                list.add(X);list.add(Y);
                count+=2;
            }
            else 
            {
                int X=(i*x)-1,Y=(i*y)-1;
                list.add(X);list.add(Y);
                count+=2;
            }
            i++;
        }
        for(int j=1;j<=n;j++)
            System.out.print(list.get(j-1)+" ");
    }
}