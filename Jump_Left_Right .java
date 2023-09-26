// A boy is currently at the point O on a coordinate axis. He jumps by the following
// rules.
// The first jump is X units to the right, the second jump is Y units to the left, the
// third jump is X units to the right, the fourth jump is Y units to the left and so on.
// The program must accept three integers X, Y and K as the input. The program
// must print the position of the boy after K jumps as the output.

// Boundary Condition(s):
// 1 <= X,Y,K <=10^9

// Input Format:
// The first line contains X, Y and K separated by a space.

// Output Format:
// The first line contains the position of the boy after K jumps.

// Example Input/Output 1:
// Input:
// 5 2 3

// Output:
// 8

// Explanation:
// Here X=5, Y=2 and K=3.
// In the first jump, the boy jumps 5 units to the right. Now the current position of
// the boy is 5 (0 + 5).
// In the second jump, the boy jumps 2 units to the left. Now the current position of
// the boy is 3 (5 - 2).
// In the third jump, the boy jumps 5 units to the right Now the current position of
// the boy is 8 (3 + 5).
// The final position of the boy is 8 (after 3 jumps). So 8 is printed as the output.


// Example Input/Output 1:
// Input:
// 100 1 4

// Output:
// 198

import java.util.*;
public class Jump_Left_Right 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt(),y=obj.nextInt(),z=obj.nextInt();
        int curr=0;
        for(int i=1;i<=z;i++)
        {
            if(i%2!=0)
            {
                int temp=curr+x;
                curr=temp;
            }
            if(i%2==0)
            {
                int r=curr-y;
                curr=r;
            }
        }
        System.out.print(curr);
    }
    
}