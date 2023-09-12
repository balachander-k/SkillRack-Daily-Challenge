// A boy wants to invite his N friends to his birthday party. So he decides to make N
// invitations. For each invitation, he needs two blue sheets and five orange sheets. A
// nearby store sells an infinite number of notebooks of any color, but each
// notebook consists of only one color with K sheets (i.e., Each notebook contains K
// sheets of the same color). The values of N and K are passed as the input to the
// program. The program must print the number of notebooks that the boy needs to
// buy to invite his N friends as the output.

// Boundary Condition(s):
// 1 <=N, K <= 1000

// Input Format:
// The first line contains N and K separated by a space.

// Output Format:
// The first line contains the number of notebooks based on the given conditions.

// Example Input/Output 1:
// Input:
// 3 5
// Output:
// 5

// Explanation:
// To invite 3 friends, he needs 6 blue sheets (3 x 2) and 15 orange sheets (3 x 5).
// So he buys notebooks containing only blue sheets (2x5 = 10 blue sheets) and 3 notebooks containing only orange sheets (3x5 = 15 orange sheets).
// Totally, he buys 5 notebooks to invite his friends.
// Hence the output is 5

// Example Input/Output 2:
// Input:
// 15 6

// Output:
// 18

import java.util.*;
public class Invitation_From_NoteBooks
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int frnds=obj.nextInt(),sheets=obj.nextInt();
        int blue=(frnds*2),orange=(frnds*5),o=0,b=0,i=0,j=0;
        while(b<blue)
        {
            b=b+sheets;
            i++;
        }
        while(o<orange)
        {
            o=o+sheets;
            j++;
        }
        System.out.print(i+j);
    }
}