// The program must accept a character matrix of size NXN containing only alphabets as the
// input. The program must print the palindromic string values formed by concatenating the
// alphabets in the L-shaped layers of the matrix as the output.

// Note: The palindromic string values are case sensitive.

// Boundary Condition(s):
// 2 <= N <= 50

// Input Format:
// The first line contains N.
// The next N lines, each contains N alphabets separated by a space.

// Output Format:
// The lines containing the palindromic string values.

// Example Input/Output 1:
// Input:
// 5
// m R m B a
// a a A o B
// I C d A M
// A E C a R
// Y A l a m

// Output:
// malAYAlam
// RaCECaR
// BoB
// a
// Explanation:
// The string values formed by concatenating the characters in the L-shaped layers of the
// matrix are given below.
// malAYAlam
// RaCECaR
// mAdAM
// 80B
// a
// The palindromic string values in the above string values are
// malAYAlam
// RaCECaR
// BoB
// a

// Example Input/Output 2:
// Input:
// 6
// d E s R T X
// e V E a i T
// t I v d a r
// r A T I V E
// t r a t e d

// Output:
// detartrated
// EVITATIVE
// TiT
// x


// Example Input/Output 3:
// Input:
// 4
// a F k N
// c M m u 
// Q v M A
// d l c a

// Output:
// N


import java.util.*;
public class L_Layered_Plandromic_Matrix 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt(),y=0,u=N-1;
        char[][] mat=new char[N][N];
        for(int i=0;i<N;i++)
            for(int j=0;j<N;j++)
                mat[i][j]=obj.next().charAt(0);
        for(int i=0;i<N;i++)
        {
            String temp="",rev="";
            for(int j=0;j<(N-1)-i;j++)
                temp+=mat[j][y];
            for(int j=i;j<N;j++)
                temp+=mat[u][j];
            for(int j=temp.length()-1;j>=0;j--)
                rev+=temp.charAt(j);
            if(temp.equals(rev))
                System.out.println(temp);
            y++;
            u--;
        }
    }
}