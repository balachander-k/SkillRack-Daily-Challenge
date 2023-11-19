// The program must accept a character matrix of size RxC containing only lower
// case alphabets as the input. The program must print the count of rows in the
// matrix where the alphabets are sorted in alphabetical order as the output.

// Boundary Condition(s):
// 2 <= R, c <= 50

// Input Format:
// The first line contains R and C separated by a space.
// The next R lines each contain C characters separated by a space.

// Output Format:
// The first line contains the count of rows in the matrix where the alphabets are
// sorted in alphabetical order.

// Example Input/Output 1:
// Input:
// a s d f
// z x y q
// r s t u
// u t x k

// Output:
// 2

// Explanation:
// In 5x4 matrix, the alphabets in the second row and the fourth row are sorted in
// alphabetical order.
// Second row: h i j k
// Fourth row: r s t u
// Hence the output is 2

// Example Input/Output 2:
// Input:
// 3 3
// i j 0
// a z b
// p c e

// Output:
// 1


import java.util.*;
public class Alphabetically_Ordered_Rows 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int row=obj.nextInt(),col=obj.nextInt(),sort=0;
        for(int i=0;i<row;i++)
        {
            int count=0,temp=0;
            for(int j=0;j<col;j++)
            {
                char alpha=obj.next().charAt(0);
                if((int)alpha>temp)
                {
                    temp=(int)alpha;
                    count++;
                }
            }
            if(count==col)
                sort++;
        }
        System.out.print(sort);
    }
}