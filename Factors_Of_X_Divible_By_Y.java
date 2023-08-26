// The program must accept two integers X and Y as the input. The program must
// print all the factors of X which are divisible by Y as the output. If there is no such
// factor then the program must print -1 as the output.

// Boundary Condition(s):
// 1 <= Y <= X <=10^5

// Input Format:
// The first line contains X and Y separated by a space.

// Output Format:
// The first line contains the factors of X which are divisible by Y separated by a
// space.

// Example Input/Output 1:
// Input:
// 100 5

// Output:
// 5 10 20 25 50 100

// Explanation:
// The factors of 100 are 1 2 4 5 10 20 25 50 100.
// Here the factors 5 IO 20 25 50 100 are divisible by 5, so they are printed as the
// output.

// Example Input/Output 2:
// Input:
// 24 9

// Output:
// -1

import java.util.*;
public class Factors_Of_X_Divible_By_Y 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt(),y=obj.nextInt(),count=0;
        for(int i=1;i<=x;i++)
            if(x%i==0 && i%y==0)
            {
                System.out.print(i+" ");
                count++;
            }
        if(count==0)System.out.print(-1);
    }
}