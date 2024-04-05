// The program must accept a string S as the input. The program must reverse every
// word in S except the first and last characters in the word. Finally, the program must
// print the modified string as the output.
// Note: The length of each word in S is always greater than 1.

// Boundary Condition(s):
// 2 <= Length of S <= 1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the modified string S.

// Example Input/Output 1:
// Input:
// Ball bat NOTE peNclL

// Output:
// Blal bat NTOE plcNeL

// Explanation:
// The word Ball has 4 characters. After reversing the word except the first and last
// characters, the word becomes Blal.
// The word bat has 3 characters. After reversing the word except the first and last
// characters, the word becomes bat
// The word NOTE has 4 characters. After reversing the word except the first and last
// characters, the word becomes NTOE.
// The word peNcIL has 6 characters. After reversing the word except the first and
// last characters, the word becomes plcNeL.
// Hence the output is Blal bat NTOE plcNeL

// Example Input/Output 2:
// Input:
// dEEr ox Fox
 
// Output:
// dEEr ox Fox


import java.util.*;
public class Reverse_Except_First_And_Last_Characters
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String val=obj.nextLine();
        String[] arr=val.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            char[] carr=arr[i].toCharArray();
            String con="";
            int w=0;
            for(int j=carr.length-1;j>=0;j--)
                if(j!=0 && j!=carr.length-1)
                    con+=carr[j];
            for(int j=0;j<carr.length;j++)
            {
                if(j!=0 && j!=carr.length-1)
                    System.out.print(con.charAt(w++));
                else 
                    System.out.print(carr[j]);
            }
            System.out.print(" ");
        }
    }
}