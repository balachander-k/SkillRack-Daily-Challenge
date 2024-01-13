// The program must accept a character matrix of size RxC as the input The program
// must print all the characters of the given matrix in the ZigZag fashion as shown in
// the Example Input/Output section.

// Boundary Condition(s):
// 2 <= R, c <=30

// Input Format:
// The first line contains R and C separated by a space.
// The next R lines each contain C characters separated by a space.

// Output Format:
// The first line contains all the characters in the given matrix.

// Example Input/Output 1:
// Input:
// 4 4
// a p p r
// n e h e
// s i v e
// s s e n

// Output:
// apprehensiveness

// Example Input/Output 2:
// Input:
// 3 5
// P e r s o
// c i f i n
// a t i o n
 
// Output:
// Personification

import java.util.*;
public class Characters_ZigZag
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int r=obj.nextInt(),c=obj.nextInt();
        char[][] mat=new char[r][c];
        String t="";
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                mat[i][j]=obj.next().charAt(0);
        for(int i=0;i<r;i++)
        {
            if(i%2==0)
                for(int j=0;j<c;j++)
                    t+=String.valueOf(mat[i][j]);
            else 
                for(int j=c-1;j>=0;j--)
                    t+=String.valueOf(mat[i][j]);
        }
        System.out.print(t);
        
    }
}