// The program must accept the price P of an item as the input. The program must
// print the minimum number of coins needed to purchase the item as the output.
// The denominations of the coins are given below.
// 1000, 500, 100, 50, 20, 10, 5 and 1.

// Boundary Condition(s):
// 1 <= P <=10^12

// Input Format:
// The first line contains P.

// Output Format:
// The first line contains the minimum number of coins needed to purchase the item.

// Example Input/Output 1:
// Input:
// 1593

// Output:
// 8

// Explanation:
// 1593 = (1000 * 1) + (500 * 1) + (50 * 1) + (20 * 2) + (1 * 3)

// Example Input/Output 2:
// Input:
// 24892

// Output:
// 33

import java.util.*;
public class Number_Of_Coins_Denominations
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int p=obj.nextInt(),count=0;
        int[] coins={1000,500,100,50,20,10,5,1};
        for(int coin:coins)
        {
            while(p>=coin)
            {
                count++;
                p=p-coin;
            }
        }
        System.out.print(count);
    }
}