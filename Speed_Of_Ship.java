// The program must accept two integers N and M as the input. The integer M
// denotes the speed of a ship and N denotes the final speed to be reached by the
// ship. The speed of the ship is increased by 1/4th of the previous speed if a bag of
// coal is added as fuel. The program must print the number of bags needed to reach
// the speed of N as the output.

// Boundary Condition(s):
// 1 <= N < = 1000
// 1 <= M <= N

// Input Format:
// The first line contains two integers N and M separated by a space.

// Output Format:
// The first line contains the number of bags needed to reach the speed of N.

// Example Input/Output 1:
// Input:
// 100 64

// Output:
// 2
// Explanation:
// The 1st bag of coal will increase the speed by 1/4 that is for 64 it is 16. So the
// speed is 80(64 + 16).
// The 2nd bag of coal will increase the speed by 1/4 that is for 80 it is 20. So the
// speed is 100(80 + 20).
// Hence the output is 2

// Example Input/Output 2:
// Input:
// 20 10

// Output:
// 4

import java.util.*;
public class Speed_Of_Ship
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        float M=obj.nextFloat(),N=obj.nextFloat(),temp=N,sum=0,count=0,val=0;
        while(true)
        {
            val=temp/4;
            sum=temp+val;
            temp=sum;
            count++;
            if(sum>=M)
                break;
        }
        System.out.print((M==N)?0:(int)count);
    }
}