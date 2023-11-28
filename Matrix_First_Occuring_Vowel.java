// The program must accept a character matrix of size RxC as the input The program
// must print the first occurring vowels from the top in each column of the matrix as
// the output.

// Note: At least one vowel is always occurred in each column of the matrix.

// Boundary Condition(s):
// 2 <= R,c <=100

// Input Format:
// The first line contains R and C separated by a space.
// The next R lines, each contains C characters separated by a space.

// Output Format:
// The first line contains the first occurring vowels from the top in each column of
// the matrix.

// Example Input/Output 1:
// Input:
// 4 4
// H N L A
// y S l o
// h a O #
// e F @ a

// Output:
// ealA

// Explanation:
// The first occurring vowels from the top in each column of the matrix are
// highlighted below.
// H N L A
// y S I O 
// h a O #
// e F @ a
// So ealA is printed as the output.

// Example Input/Output 2:
// Input:
// 3 7
// o f w $ w E d
// t v M i O i 1
// 2 E e @ R O u

// Output:
// oEeioEu


import java.util.*;
public class Matrix_First_Occuring_Vowel 
{
    public static boolean isVowel(char c)
    {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            return true;
        return false;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int row=obj.nextInt(),col=obj.nextInt();
        char[][] alpha=new char[row][col];
        for(int i=0;i<row;i++)
            for(int j=0;j<col;j++)
                alpha[i][j]=obj.next().charAt(0);
        for(int i=0;i<col;i++)
        {
            int count=0;
            for(int j=0;j<row;j++)
            {
                if(isVowel(alpha[j][i]))
                    count++;
                if(count!=0)
                {
                    System.out.print(alpha[j][i]);
                    break;
                }
            }
        }
    }
}