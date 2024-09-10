// In a video game, a boy has four options to move in the four directions U, D, L and R
// representing Up, Down, Left and Right directions. The initial position of the boy is always
// (O, O). The program must accept a string S containing only U, D, L and R (both upper case
// and lower case) as the input. The program must print YES if the boy returns to the starting
// position after finishing all the moves. Else the program must print NO as the output.

// Boundary Condition(s):
// 2 <= Length of S <= 1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains YES or NO.

// Example Input/Output 1:
// Input:
// URdL

// Output:
// YES

// Explanation:
// The initial position of the boy is (0, 0).
// In the first move U, the boy moves up. So the current position of the boy becomes (O, 1).
// In the second move R, the boy moves right. So the current position of the boy becomes (1,
// 1).
// In the third move d, the boy moves down. So the current position of the boy becomes (1,
// 0).
// In the fourth move L, the boy moves left So the current position of the boy becomes (O, O).
// After finishing all the moves, the final position of the boy is (O, O) which is the starting
// position.
// So YES is printed as the output.

// Example Input/Output 2:
// Input:
// dddlruuuu

// Output:
// NO

import java.util.*;
public class Video_Game_Development
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] direction=obj.next().toCharArray();
        int[] move={0,0};
        for(int i=0;i<direction.length;i++)
        {
            if(direction[i]=='u' || direction[i]=='U')
                move[1]++;
            else if(direction[i]=='d' || direction[i]=='D')
                move[1]--;
            else if(direction[i]=='L' || direction[i]=='l')
                move[0]++;
            else 
                move[0]--;
        }
        System.out.print((move[0]==0 && move[1]==0)?"YES":"NO");
    }
}