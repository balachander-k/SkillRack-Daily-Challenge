// The program must accept three integers A, B and C as the input The program
// must print YES if C can be obtained by repeatedly subtracting B from A (that is A -
// B) as the output. Else the program must print NO as the output.

// Boundary Condition(s):
// 1<= A,B,C <=1000

// Input Format:
// The first line contains the values A, B and C separated by a space.

// Output Format:
// The first line contains either YES or NO.

// Example Input/Output 1:
// Input:
// 71 7 15

// Output:
// YES

// Explanation:
// 71-7 = 64
// 64-7 = 57
// 57-7 = 50
// 50-7 = 43
// 43-7 = 36
// 36-7 = 29
// 29-7 = 22
// 22-7 = 15
// Here 15 is obtained by repeatedly subtracting 7 from 71.
// Hence the output is YES

// Example Input/Output 2:
// Input:
// 89 19 10

// Output:
// NO


import java.util.*;
public class Repeatedly_Subtracting_From_B_TO_A
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt(),c=obj.nextInt(),temp=a,sub=0,count=0;
        while(true)
        {
            temp=(temp-b)+sub;
            if(temp==c)
            {
                System.out.print("YES");
                count++;
                break;
            }
            if(temp<=1)
                break;
        }
        if(count==0)
            System.out.print("NO");
    }
}