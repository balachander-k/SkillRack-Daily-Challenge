// The program must accept three integers A,B and C as the input. The program must print the arithmetic progression starting from with common difference B up to C as output.

// Boundary Condition(s);
// 1<= A,B,C <=10^7

// Input Format:
// The first line contains the values of A, B and C separated by space(s).


// Output Format:
// The first line contains list of integers separated by a space.

// Example Input/Output 1:
// Input:
// 4 7 25

// Output:
// 4 11 18 25

// Explanation:
// The output is printed from A to 4 is printed.
// The 7 is added to 4 So the next integer to be printed is 11.
// The 7 is added to 11 So the next integer to be printed is 18.
// Then 7 is added to 18 So the next integer to be printed is 25.

// Example Input/Output 2:
// Input:
// 45 3 59

// Output:
// 45 48 51 54 57


import java.util.*;
public class Alternate_Progression_Till_C
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt(),c=obj.nextInt();
        while(a<=c)
        {
            System.out.print(a+" ");
            a=a+b;
        }
    }
}