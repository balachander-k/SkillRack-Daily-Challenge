// The program must accept two integers X and Y (where X Y) as the input. The
// program must print all the factors of X which are not the factors of Y as the
// output.

// Boundary Condition(s):
// 2 <=X,y <=10^6

// Input Format:
// The first line contains X and Y separated by a space.

// Output Format:
// The first line contains the factors of X which are not the factors of Y.

// Example Input/Output 1:
// Input:
// 12 14

// Output:
// 3 4 6 12

// Explanation:
// The factors of 12 are 1 2 34 6 12.
// Here 1 and 2 are the factors of 14. So they are not printed.
// Hence the output is 3 4 6 12

// Example Input/Output 2:
// Input:
// 100 50

// Output:
// 4 20 100

import java.util.*;
public class Factors_Of_X_But_Not_Y
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt(),y=obj.nextInt();
        for(int i=1;i<=x;i++)
            if(x%i==0 && y%i!=0)
                System.out.print(i+" ");
        
    }
    
}