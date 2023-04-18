// The program must accept a string S containing only alphabets as the input. The
// program must print yes if all the vowels are present in S. Else the program must
// print no as the output.

// Boundary Condition(s):
// 2 <= Length of S <= 100

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains yes or no.

// Example Input/Output 1:
// Input:
// education

// Output:

// yes
// Explanation:
// All the 5 vowels (aeiou) are present in education.
// So yes is printed.

// Example Input/Output 2:
// Input:
// RECTANGLE

// Output:
// no


import java.util.*;
public class Check_All_Vowels_Present
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String val=obj.nextLine().toLowerCase();
        int a=0,e=0,i=0,o=0,u=0;
        for(int j=0;j<val.length();j++)
        {
            if(val.charAt(j)=='a')a++;
            if(val.charAt(j)=='e')e++;
            if(val.charAt(j)=='i')i++;
            if(val.charAt(j)=='o')o++;
            if(val.charAt(j)=='u')u++;
        }
        if(a!=0 && e!=0 && i!=0 && o!=0 && u!=0)
            System.out.print("yes");
        else 
            System.out.print("no");
    }
}