// In an NXN LED light matrix, each LED has a lumen (how bright an LED is). The NXN LED
// matrix has a pattern to flash, which is given below.

// - Initially, all the LEDs flashing in the matrix (att = 1). Then it changes the flashing mode
// every second.

// - Att = 2, all the LEDs in the last row and the last column will not flash.
// - At t = 3, all the LEDs in the first row and the first column will not flash.
// - At t = 4, all the LEDs in the last two rows and the last two columns will not flash.
// - At t = 5, all the LEDs in the first two rows and the first two columns will not flash.
// Similarly, the LEDs in the matrix are flashing. It will repeat the flashing pattern when all the
// LEDs not flashing at a time.
// The lumen value of each LED in the matrix is passed as the input to the program. The
// program must print the highest lumen of the LED at every second in the above-mentioned
// flashing pattern.

// Boundary Condition(s):
// 2 <= N <= 100
// 1 <= Each matrix element <=10^8

// Input Format:
// The first line contains N.
// The next N lines, each contains N integers separated by a space.

// Output Format:
// The first line contains the highest lumen of the LED at every second in the matrix separated
// by a space.

// Example Input/Output 1:
// Input:
// 4
// 1 2 8 4
// 6 3 4 1
// 5 6 7 2
// 9 3 4 9

// Output:
// 9 8 9 6 9 1 9

// Explanation:
// Att = 1, the lumen values of the flashing LED's are given below.
// 1 2 8 4
// 6 3 4 1
// 5 6 7 2
// 9 3 4 9
// Here 9 is the highest lumen value.
// At t = 2, the lumen values of the flashing LEDs are given below.
// 1 2 8
// 6 3 4
// 5 6 7
// Here 8 is the highest lumen value.
// At t = 3, the lumen values of the flashing LEDs are given below.
// 3 4 1
// 6 7 2
// 3 4 9
// Here 9 is the highest lumen value.
// At t = 4, the lumen values of the flashing LEDs are given below.
// 1 2
// 6 3
// Here 6 is the highest lumen value.
// Similarly, att = 5, 9 is the highest lumen value.
// Att = 6, 1 is the only highest lumen value.
// Att = 7, 9 is the only highest lumen value.
// At t = 8, the pattern ends as all the LEDs not flashing at this time.
// Hence the output is
// 9 8 9 6 9 1 9

// Example Input/Output 2:
// Input:
// 5
// 67 82 13 18 76
// 91 43 25 79 52
// 99 31 37 51 53
// 95 82 67 54 83
// 39 23 92 61 84

// Output:
// 99 99 92 99 92 91 84 67 84

import java.util.*;
public class LED_Flash_Pattern
{
    public static void main(String[] arg)
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),w=1,l=N-2,m=Integer.MIN_VALUE;
        int[][] mat=new int[N][N];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                mat[i][j]=obj.nextInt();
                if(mat[i][j]>m)
                    m=mat[i][j];
            }
        }
        list.add(m);
        while(l>=0)
        {
            int cmax=Integer.MIN_VALUE;
            for(int i=l;i>=0;i--)
                for(int j=l;j>=0;j--)
                    if(mat[i][j]>cmax)
                        cmax=mat[i][j];
            list.add(cmax);
            int rmax=Integer.MIN_VALUE;
            for(int i=w;i<N;i++)
                for(int j=w;j<N;j++)
                    if(mat[i][j]>rmax)
                        rmax=mat[i][j];
            list.add(rmax);
            w++;
            l--;
        }
        for(int i=0;i<list.size();i++)
            System.out.print(list.get(i)+" ");
    }
}