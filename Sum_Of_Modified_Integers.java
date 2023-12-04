// The program must accept N integers as the input. The program must remove the
// first occurrence of O in each integer among the N integers. Then the program
// must print the sum of the N modified integers as the output.

// Boundary Condition(s):
// 2 <=N < = 100
// 10 <=Each integer value <= 10^5

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains the sum of the N modified integers.

// Example Input/Output 1:
// Input:
// 3
// 100 320 10020

// Output:
// 1062

// Explanation:
// After removing the first occurrence of O in each integer, the three integers become
// 10, 32 and 1020.
// So their sum 1062 is printed as the output (10 + 32 + 1020 = 1062).

// Example Input/Output 2:
// Input:
// 4
// 87 157 10 134

// Output:
// 258


import java.util.*;
public class Sum_Of_Modified_Integers
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),sum=0;
        for(int i=0;i<n;i++)
        {
            int num=obj.nextInt(),count=0,con=0;
            Stack<Integer> stack=new Stack<Integer>();
            while(num!=0)
            {
                int temp=num%10;
                stack.push(temp);
                num=num/10;
            }
            while(!stack.isEmpty())
            {
                int r=stack.pop();
                if(r==0 && count==0)
                    count++;
                else 
                    con=(con*10)+r;
            }
            sum=sum+con;
        }
        System.out.print(sum);
    }
}