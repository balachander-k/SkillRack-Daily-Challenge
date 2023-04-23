// The program must accept a character matrix of size RxC as the input The program
// must print YES if all the vowels (only lowercase vowels) occur at least once in every
// row and every column. Else the program must print NO as the output.

// Boundary Condition(s):
// 1<=R, C<= 50

// Input Format:
// The first line contains the values of R and C separated by a space.
// The next R lines contain C alphabets each separated by a space.

// Output Format:
// The first line contains either YES or NO.

// Example Input/Output 1:
// Input:
// 5 6
// a e i a o u
// e i o e u a
// i o u i a e
// o u a o e i
// u a e u i o

// Output:
// YES

// Explanation:
// All the vowels occur at least once in every row and every column. So YES is
// printed.

// Example Input/Output 2:
// Input:
// 7 6
// e j e u u i
// a y m n o f
// a n h i c q
// e i p u o o
// e o a e t q
// e e o o a e
// u n u n k e

// Output:
// NO


import java.util.*;
public class All_Vowels_In_Every_Row_And_Column
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int row=obj.nextInt(),col=obj.nextInt(),a=0,i=0,u=0,o=0,e=0,allvowel=0;
        for(int k=0;k<row;k++)
        {
            for(int j=0;j<col;j++)
            {
                char c=obj.next().charAt(0);
                if(c=='a')a++;
                if(c=='e')e++;
                if(c=='i')i++;
                if(c=='o')o++;
                if(c=='u')u++;
            }
            if(a!=0 && e!=0 && i!=0 && u!=0 && o!=0)
                allvowel++;
            a=0;
            e=0;
            i=0;
            o=0;
            u=0;
        }
        System.out.print((allvowel==row)?"YES":"NO");
    }
}