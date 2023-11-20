// The program must accept a character matrix of size NXN containing only
// alphabets as the input. The program must replace the innermost layer and the
// outermost layer of the matrix by the asterisk. Then the program must print the
// modified matrix as the output.

// Boundary Condition(s):
// 3 <= N < = 100

// Input Format:
// The first line contains N.
// The next N lines each contain N alphabets separated by a space.

// Output Format:
// The first N lines containing the modified matrix.

// Example Input/Output 1:
// Input:
// 5
// d z y w y
// y k h a j
// z y b w l
// w i n t w
// e r t y u

// Output:
// * * * * * 
// * k h a *
// * y * w *
// * i n t * 
// * * * * * 

// Explanation:
// In the given 5x5 matrix, the innermost layer and the outermost layer are
// highlighted below.
// d z y w y
// y k h a j
// z y b w l
// w i n t w
// e r t y u
// After replacing the innermost layer and the outermost layer of the matrix by the
// asterisk, it becomes
// * * * * * 
// * k h a *
// * y * w *
// * i n t * 
// * * * * * 

// Example Input/Output 2:
// Input:
// 8
// U A L K Y A N V
// S I U G D T A Z
// D T B J P D C A
// U Z S T Q H O C
// A Q C U R M M C
// D R A T B O T J
// X X S R D T P M
// F Z F E O C G A

// Output
// * * * * * * * *
// * I U G D T A *
// * T B J P D C *
// * Z S * * H O *
// * Q C * * M M *
// * R A T B O T *
// * X S R D T P *‎
// * * * * * * * *


// Example Input/Output 3:
// Input:
// 4
// h x b l
// u q i v
// y c y o
// e m a c

// Output:
// * * * * 
// * * * * 
// * * * * 
// * * * * 


import java.util.*;
public class Asterik_InnerMost_OuterMost_Layers_In_Matrix 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        char[][] mat=new char[size][size];
        for(int i=0;i<size;i++)
            for(int j=0;j<size;j++)
                mat[i][j]=obj.next().charAt(0);
        if(size%2!=0)
        {
            int r=size/2;
            for(int i=0;i<size;i++)
            {
                for(int j=0;j<size;j++)
                {
                    if(i==0||j==0||i==size-1||j==size-1||(i==r&&j==r))
                        System.out.print("*"+" ");
                    else 
                        System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
        }
        else 
        {
            int t=size/2;
            for(int i=0;i<size;i++)
            {
                for(int j=0;j<size;j++)
                {
                    if(i==0||j==0||i==size-1||j==size-1||(i==t&&j==t)||(i==t&&j==t-1)||(i==t-1&&j==t)||(i==t-1&&j==t-1))
                        System.out.print("*"+" ");
                    else 
                        System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}