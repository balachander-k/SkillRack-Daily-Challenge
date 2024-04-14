// The program must accept a word matrix of size RxC as the input. The program
// must print the desired pattern as shown in the Example Input/Output section.

// Boundary Condition(s):
// 2 <= R,C <= 50
// 1 <= Length of each word <= 50

// Input Format:
// The first line contains R and C separated by a space.
// The next R lines, each containing C words separated by a space.

// Output Format:
// The lines containing the desired pattern as shown in the Example Input/Output
// section.

// Example Input/Output 1:
// Input:
// 3 3 
// cat maths cow
// pillow day four
// dairy milk monsoon

// Output:
// |cat***|maths|cow****|
// |pillow|day**|four***|
// |dairy*|milk*|monsoon|

// Explanation:
// In the given 3x3 word matrix, the longest word in each column are highlighted
// below.
// cat maths cow
// pillow day four
// dairy milk monsoon
// In the first column, pillow is the longest word and it's length is 6. The length of
// cat is 3 and dairy is 5.
// Hence the number of asterisks to be appended to cat is the difference between
// pillow length and cat length which is 6-3 = 3.
// The number of asterisks to be appended to dairy is the difference between pillow
// length and dairy length which is 6-5 = 1.
// Similarly, in the second column, the longest word is maths whose length is 5. The
// number of asterisks to be appended to day is 5-3 = 2 (5 is the length of maths
// and 3 is the length of day). For milk it is 5-4 = 1.
// Similarly, in the third column, the longest word is monsoon whose length is 7. The
// number of asterisks to be appended to cow is 7-3 = 4 (7 is the length of monsoon
// and 3 is the length of cow). For four it is 7-4=3.


// Example Input/Output 2:
// Input:
// 2 4
// handloom mail mobile wood
// silk yahoo nokia chair

// Output:
// |handloom|mail*|mobile|wood*|
// |silk****|yahoo|nokia*|chair|



import java.util.*;
public class Word_Matrix_Pattern
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int r=obj.nextInt(),c=obj.nextInt();
        String[][] mat=new String[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                mat[i][j]=obj.next();
        for(int i=0;i<c;i++)
        {
            int len=Integer.MIN_VALUE;
            for(int j=0;j<r;j++)
                if(mat[j][i].length()>len)
                    len=mat[j][i].length();
            for(int j=0;j<r;j++)
            {
                String temp=mat[j][i];
                int nl=temp.length(),diff=Math.abs(nl-len);
                for(int k=1;k<=diff;k++)
                    temp+=String.valueOf("*");
                mat[j][i]=temp;
            }
        }
        for(int i=0;i<r;i++)
        {
            System.out.print("|");
            for(int j=0;j<c;j++)
                System.out.print(mat[j][i]+"|");
            System.out.println();
        }
    }
}