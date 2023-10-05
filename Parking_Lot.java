// In a parking lot, N cars can be parked in a row. The free slots are denoted by a O
// and the occupied slots are denoted by a 1. The program must accept N integers
// (representing the slots) as the input. The program must print the number of ways
// two cars can be parked successively.

// Boundary Condition(s):
// 2 <= N < = 1000

// Input Format:
// The first line contains N.
// The second line contains N integers separated by a space.

// Output Format:
// The first line contains the number of ways two cars can be parked successively.

// Example Input/Output 1:
// Input:
// 10
// 1 0 0 0 1 0 1 0 01

// Output:
// 3

// Explanation:
// There are 3 ways to park two cars successively 1
// In the 0 0 0 slots, two cars can be parked in 2 ways.
// In the 0 0 slots, two cars can be parked in 1 way. So 3 (2+1) ways are there to park two cars successively.
// Hence the output is 3

// Example Input/Output 2:
// Input:
// 9
// 1 0 0 0 0 0 1 0 0

// Output:
// 5

import java.util.*;
public class Parking_Lot
{
    public static int ZeroCal(int z)
    {
        int[] zero=new int[z];
        int ways=0,t=0,q=1;
        for(int j=0;j<zero.length;j++)
            zero[j]=0;
        while(true)
        {
            try{
                if(zero[t]==0 && zero[q]==0)
                    ways++;
            }
            catch(Exception e)
            {
                break;
            }
            q=q+1;
            t=t+1;
        }
        return ways;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),count=0,pass=0;
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
            arr[i]=obj.nextInt();
        for(int i=0;i<N;i++)
        {
            if(arr[i]==0)
                count++;
            else 
            {
                if(count>=2)
                    pass=pass+ZeroCal(count);
                count=0;
            }
        }
        if(count!=0)
            pass=pass+ZeroCal(count);
        System.out.print(pass);
            
    }
}