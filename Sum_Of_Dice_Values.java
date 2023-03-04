// Pairs of integers are passed as the input to the program. The integers in each pair represent
// values of two dice in a game. If both the values are same, then the dice are rolled again. If
// the values are different, then the game ends. The program must print the sum of total
// number of values obtained from the dice at the end of the game.

// Boundary Condition(s):
// 1 <= Value of each integer <= 6

// Input Format:
// The lines contain two integers each separated by a space.

// Output Format:
// The first line contains the sum of all values obtained from the dice.

// Example Input/Output 1:
// Input:
// 4 4
// 3 3
// 2 5

// Output:
// 21

// Explanation:
// The dice are rolled until two different values are obtained.
// So the total sum is 4 +4 + 3+ 3+2 +5 = 21

// Example Input/Output 2:
// Input:
// 5 5
// 1 1
// 2 2
// 4 4
// 5 4

// Output:
// 33




import java.util.*;
public class Sum_Of_Dice_Values
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int sum=0;
        while(true)
        {
            int a=obj.nextInt(),b=obj.nextInt(),c=a+b;
            sum=sum+c;
            if(a!=b)
                break;
        }
        System.out.print(sum);
    }
}