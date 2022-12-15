// The program must accept a string S as the input. The program must toggle the case of vowels in the string S.Then the program must print the modified string as the output.

// Boundary Condition(s);
// 1<= Length of S <=100

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains the modified string.

// Example Input/Output 1:
// Input:
// EquillIbriUm

// Output:
// eqUIllibrIum

// Explanation:
// The vowels in the string "EquillIbriUm" are 'E','u','i','l','i',and 'U'.
// So toggle the case ofall the vowels in the string "EquillIbriUm".
// Hence the output is eqUIllibrIum.

// Example Input/Output 2:
// Input:
// JUNKVIRUS

// Output:
// JuNKViRus


import java.util.*;
public class Toggle_Case_Vowels
{
    public static int isVowel(char ch)
    {
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
            return 1;
        else 
            return 0;
            
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] a=obj.nextLine().toCharArray();
        for(int i=0;i<a.length;i++)
        {
            if(isVowel(a[i])==1)
            {
                if(Character.isUpperCase(a[i]))
                    System.out.print(Character.toLowerCase(a[i]));
                else 
                    System.out.print(Character.toUpperCase(a[i]));
            }
            else 
                System.out.print(a[i]);
        }
        
    }
}