// There are seven nurses (A, B, C, D, E, F and G) working in a hospital. Only one nurse will be
// on duty each day of the week. At most only one nurse can take leave in a week. If one of
// them takes leave, another nurse will be on duty instead. The program must accept N string
// values representing the nurses on duty in N weeks. For each week, the program must print
// the name of the nurse who is absent and the name of the nurse who took charge instead. If
// no one is absent in a week, the program must print -1 as the output.

// Boundary Condition(s):
// 1 <= N <= 100

// Input Format:
// The first line contains N.
// The next N lines, each contains a string representing the nurses on duty in a week.

// Output Format:
// The first N lines, each contains the name of the nurse who is absent and the name of the
// nurse who took charge instead or -1.

// Example Input/Output 1:
// Input:
// 3
// DEFGADC
// ABCDEFG
// FEBCDAB

// Output:
// B D 
// -1 
// G B

// Explanation:
// In thel week, nurse B is on leave and nurse D is on duty. So B D are printed.
// In the 2nd week, no one takes leave. So -1 is printed.

// Example Input/Output 2:
// Input:
// 4
// GEFCABD
// GFACBCD
// FFGADEB
// CDAGFEA

// Output:

// -1
// E C
// C F
// B A 


import java.util.*;
public class Absent_Nurse
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int N=obj.nextInt();
        for(int i=0;i<N;i++)
        {
            String val=obj.next();
            char[] carr=val.toCharArray();
            int[] alpha=new int[7];
            int count=0;
            for(int j=0;j<carr.length;j++)
                alpha[carr[j]-65]=++alpha[carr[j]-65];
            for(int j=0;j<alpha.length;j++)
                if(alpha[j]==0){
                    System.out.print((char)(j+65)+" ");count++;}
            for(int j=0;j<alpha.length;j++)
                if(alpha[j]>1){
                    System.out.print((char)(j+65)+" ");count++;}
            System.out.print((count==0)?"-1 \n":"\n");
        }
    }
}