// The program must accept a character matrix of size NXN and a string S as the input.
// The program must check if the string S is present in the matrix column-wise and print
// the column number of the columns with the given string in it. Else if the string S is
// not present in any column of the matrix then the program must print -1 as the
// output.

// Note: The character matrix and the string S contain only lower case alphabets.

// Boundary Condition(s):
// 1<= N <=100
// 1 <= Length of S <= 100

// Input Format:
// The first line contains the value N.
// The next N lines contain N characters each separated by a space.
// The (N +2)th line contains the string S.

// Output Format:
// The first line contains either -1 or the column number values with the given string
// each separated by a space.

// Example Input/Output 1:
// Input:
// 5
// n q w f r
// e r n u o
// p o b r c
// r c g t k
// j k j k n
// rock

// Output:
// 2 5
// Explanation:
// The string rock is present in the 2nd and 5th column which are highlighted below.
// n q w f r
// e r n u o
// p o b r c
// r c g t k

// Example Input/Output 2:
// Input:
// 3
// o v r
// k b m
// a k t
// to

// Output:
// -1

import java.util.*;
public class Matrix_Find_String_Column_Wise
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt(),count=0;
        char[][] mat=new char[size][size];
        for(int i=0;i<size;i++)
            for(int j=0;j<size;j++)
                mat[i][j]=obj.next().charAt(0);
        String val=obj.next();
        for(int i=0;i<size;i++)
        {
            String store="";
            for(int j=0;j<size;j++)
                store=store+mat[j][i];
            if(store.contains(val))
            {
                System.out.print((i+1)+" ");
                count++;
            }
        }
        if(count==0)System.out.print("-1");
    }
}