// The program must accept an NXN matrix as the input. The program must replace
// the digits in each integer by if the integer is divisible by its unit digit and print it
// as the output. Else the program must print the integer without any modification as
// the output.

// Boundary Conditions(s):
// 1 <= N <= 100
// 1 <= Each integer value <= 10^5

// Input Format:
// The first line contains N.
// The next N lines contain N integers each separated by a space.

// Output Format:
// The first N lines contain the modified matrix.

// Example Input/Output 1:
// Input:
// 4
// 163 122 84 97
// 155 246 192 124
// 44 97 57 167
// 46 36 278 281

// Output:
// 163 *** ** 97
// *** *** *** *** 
// ** 97 57 167
// 46 ** 278 ***

// Explanation:
// The integers which are divisible by their unit digits are 122, 84, 155, 246, 192, 124, 44,
// 36 and 281.
// The digits in these integers are replaced as and printed.

// Example Input/Output 2:
// Input:
// 5
// 973 1416 1387 998 727
// 877 995 1352 477 1195
// 74 965 1345 238 591
// 848 182 696 314 7
// 259 764 187 1002 428

// Output:
// 973 **** 1387 998 727
// 877 *** **** 477 ****
// 74 *** **** 238 ***
// *** *** *** 314 *
// 259 *** 187 **** 428

import java.util.*;
public class Replace_Digit_By_*
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int[][] mat=new int[size][size];
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                mat[i][j]=obj.nextInt();
            }
        }
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                int temp=mat[i][j];
                int unit=temp%10;
                try{
                if(temp%unit==0)
                {
                    while(temp!=0)
                    {
                        int rem=temp%10;
                        System.out.print("*");
                        temp=temp/10;
                    }
                    System.out.print(" ");
                }
                else 
                    System.out.print(mat[i][j]+" ");
                }
                catch(Exception e)
                {
                    System.out.print(mat[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}