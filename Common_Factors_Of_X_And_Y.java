// The program must accept two integers X and Y as the input. The program must print all the common factors of X and Y in ascending order as the output.

// Boundary Condition(s);
// 1<= X,Y <=10^5


// Input Format:
// The first line contains two integers X and Y separated by a space.

// Output Format:
// The first line contains all the common factors of X and Y in ascending order separated by a space.

// Example Input/Output 1:
// Input:
// 24 96

// Output:
// 1 2 3 4 6 8 12 24

// Explanation:
// The factors of 24 are 1, 2, 3, 4, 6, 8, 12 and 24.
// The factors of 96 are 1, 2, 3, 4, 6, 8, 12, 16, 24, 32, 48 and 96.
// The common factors in both 24 and 96 are 1, 2, 3, 4, 6, 8, 12 and 24.
// Hence the output is 1 2 3 4 6 8 12 24

// Example Input/Output 2:
// Input:
// 13 19

// Output:
// 1



import java.util.*;
public class Common_Factors_Of_X_And_Y 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        long a=obj.nextLong(),b=obj.nextLong();
        for(long i=1;i<=100000;i++)
            if((a%i==0) && (b%i==0))System.out.print(i+" ");
    }
}