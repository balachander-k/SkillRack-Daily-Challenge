// The height of N cats is passed as the input. The program must print the height of
// the cats graphically as a column chart represented by # and - as shown in the
// Example Input/Output section.

// Boundary Condition(s):
// 2 <= N <=100
// 1 <= Height of each cat < = 100

// Input Format:
// The first line contains N.
// The second line contains N integers representing the height of N cats separated
// by a space.

// Output Format:
// The lines contain the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 6
// 10 4 2 6 7 2

// Output:
// # - - - - -
// # - - - - -
// # - - - - -
// # - - - # -
// # - - # # -
// # # - # # -
// # # - # # -
// # # # # # #
// # # # # # #

// Example Input/Output 2:
// Input:
// 10
// 1 2 3 4 5 6 7 8 9 10

// Output:
// - - - - - - - - - #
// - - - - - - - - # # 
// - - - - - - - # # # 
// - - - - - - # # # # 
// - - - - - # # # # #
// - - - - # # # # # #
// - - - # # # # # # #
// - - # # # # # # # #
// - # # # # # # # # #
// # # # # # # # # # #

import java.util.*;
public class Height_Pattern_Printing
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt(),max=Integer.MIN_VALUE,t=0;
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=obj.nextInt();
            if(arr[i]>max)
                max=arr[i];
        }
        String[][] mat=new String[size][max];
        for(int i=0;i<size;i++)
        {
            int val=Math.abs(max-arr[i]);
            for(int j=0;j<max;j++)
            {
                if(j>=val)
                    mat[i][j]="#";
                else 
                    mat[i][j]="-";
            }
        }
        for(int i=0;i<max;i++)
        {
            for(int j=0;j<size;j++)
                System.out.print(mat[j][i]+" ");
            System.out.println();
        }
        
    }
}