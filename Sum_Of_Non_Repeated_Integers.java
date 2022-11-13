The program must accpet N integer as the input. The program must print the sum of non repeated integers as the output. If there is no non repeated integer then the program must print -1 as the output.

Boundary Condition(s);
1<=N<=10^5

Input Format:
The first line contains the value of N.
the second line contains N integers separated by space(s);

Output Format:
The first line contains the either the sum of non repeated integer or -1.

Example Input/Output 1:
Input:
5
1 2 3 2 5

Output:
9

Explanation:
Non repeated integers are 1, 3 and 5.
So, the sum of 1, 3 and 5 is 9.
Hence the output is 9.

Example Input/Output 2:
Input:
7
87 23 87 23 67 87 67

Output:
-1


import java.util.*;
public class Sum_Of_Non_Repeated_Integers 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[] b=new int[a];
        int flag=0;
        for(int i=0;i<a;i++)
        {
            b[i]=obj.nextInt();
        }
        int count=0,sum=0;
        for(int i=0;i<a;i++)
        {
            count=0;
            for(int j=0;j<a;j++)
            {
                if(b[i]==b[j])
                    count++;
            }
            if(count==1)
            {
                sum=sum+b[i];
                flag=1;
            }
        }
        if(flag==1)
        System.out.print(sum);
        else 
        System.out.print("-1");
    }
}