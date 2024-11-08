// The program must accept N integers representing the cost price of N items as the
// input The selling price of each item must be rounded up or down to the nearest
// multiple of 5. The program must print the output based on the following
// conditions.

// - If the shopkeeper makes a profit by selling all N items, the program must print
// the string value "Profit" followed by the profit amount.
// - If the shopkeeper suffers a loss by selling all N items, the program must print the
// string value "Loss" followed by the loss amount.
// - If there is no profit and no loss by selling all N items, the program must print the
// string value "No Profit No Loss".
// Note: If the cost price of an item is a multiple of 5, then no need to round up or
// round down.

// Boundary Condition(s):
// 1 <= N < = 100
// 5 <= Price of each item <= 1000

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains the string value "Profit" or "Loss" followed by the profit or
// loss amount or the string value "No Profit No Loss".

// Example Input/Output 1:
// Input:
// 6
// 84 77 72 58 23 25

// Explanation:
// The cost price of the 6 items are 84, 77, 72, 58, 23 and 25.
// The selling price of the 6 items are 85, 75, 70, 60, 25 and 25.
// The total cost price is 339.
// The total selling price is 340.
// So the shopkeeper makes a profit of 1 rupee.
// Hence the output is
// Profit 1

// Example Input/Output 2:
// Input:
// 3
// 152 96 100

// Output:
// Loss 3

// Explanation:
// The cost price of the 3 items are 152, 96 and 100.
// The selling price of the 3 items are 150, 95 and 100.
// The total cost price is 348.
// The total selling price is 345.
// So the shopkeeper suffers a loss of 3 rupees.
// Hence the output is
// Loss 3

// Example Input/Output 3:
// Input:
// 5
// 15 20 5 16 19

// Output:
// No Profit No Loss


import java.util.*;
public class Profit_Loss_N_Times
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),selpri=0,cospri=0;
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=obj.nextInt();
            cospri+=arr[i];
        }
        for(int i=0;i<N;i++)
        {
            if(arr[i]%5==0)
                selpri+=arr[i];
            else 
            {
                int tmins=arr[i],tplus=arr[i],plus=0,mins=0;
                while(tmins%5!=0)
                {
                    tmins--;
                    mins++;
                }
                while(tplus%5!=0)
                {
                    tplus++;
                    plus++;
                }
                if(mins<plus)
                    selpri+=tmins;
                else 
                    selpri+=tplus;
            }
        }
        if(cospri==selpri)System.out.println("No Profit NO Loss");
        else if(selpri<cospri)System.out.println("Loss "+Math.abs(selpri-cospri));
        else System.out.println("Profit "+Math.abs(selpri-cospri));
    }
}