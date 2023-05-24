// The program must accept two character matrices A and B are of same size NXN as
// the input. The program must print the matrix which has the maximum number of
// vowels as the output. If both matrices have the same number of vowels then the
// program must print the matrix A as the output.

// Note: At least one vowel must be present in both the matrices.
// Boundary Condition(s):
// 2 <= N <=50

// Input Format:
// The first line contains the integer N.
// The next N lines contain N characters (matrix A) each separated by a space(s).
// The remaining N lines contain N characters (matrix B) each separated by a
// space(s).

// Output Format:
// The first N lines contain N characters separated by space(s).


// Example Input/Output 1:
// Input:
// 3
// Q K e
// v B a
// U I T
// i Y u
// t z o
// w a E

// Output:
// i Y u
// t z o
// w a E 
// Explanation:
// The matrix A has 4 vowels ( e, a, U and I).
// The matrix B has 5 vowels ( i, u, o, a and E ).
// The matrix B has more vowels than matrix A.
// Hence the output is
// i Y u
// t z o
// w a E 


// Example Input/Output 2:
// Input:
// 4
// a s d g
// q w e t
// i h j k
// x c v u
// o f g f
// u r t y
// l k j i
// f d s a 

// Output:
// a s d g
// q w e t
// i h j k
// x c v u


import java.util.*;
public class Highest_Vowel_Matrix
{
    public static int isVowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            return 1;
        else 
            return 0;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        char[][] mat1=new char[a][a];
        char[][] mat2=new char[a][a];
        int vow1=0,vow2=0;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                char ch=obj.next().charAt(0);
                mat1[i][j]=ch;
                if(isVowel(ch)==1)
                    vow1++;
            }
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                char val=obj.next().charAt(0);
                mat2[i][j]=val;
                if(isVowel(val)==1)
                    vow2++;
            }
        }
        if(vow1==vow2)
        {
            for(int i=0;i<a;i++)
            {
                for(int j=0;j<a;j++)
                {
                    System.out.print(mat1[i][j]+" ");
                }
                System.out.println();
            }
        }
        if(vow1>vow2)
        {
            for(int i=0;i<a;i++)
            {
                for(int j=0;j<a;j++)
                {
                    System.out.print(mat1[i][j]+" ");
                }
                System.out.println();
            }
        }
        else 
        {
            for(int i=0;i<a;i++)
            {
                for(int j=0;j<a;j++)
                {
                    System.out.print(mat2[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}