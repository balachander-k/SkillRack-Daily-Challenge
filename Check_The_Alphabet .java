// The program must accpet a string value S and an integer X as the output. THe program must print yes if Xth position letter in the alphabetical order is present at least once in S.Else the program must print no as the output.
// Note: The string S must contain only lowercase alphabets

// Boundary Condition(s);
// 1<= Length of S <=100
// 1<= X <=26

// Input Format:
// The first line contains the string S.
// The second line contains the integer X.

// Output Format:
// THe first line contains either yes or no.

// Example Input/Output 1:
// Input:
// kickstart
// 20

// Output:
// yes

// Explanation:
// In the alphabetical order,the alphabet in 20th position is 1.
// In the string "kickstart", the alphabet t have execute twice.
// Hence the output is yes.

// Example Input/Output 2:
// Input:
// fruit
// 1

// Output:
// no




import java.util.*;
public class Check_The_Alphabet 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] a=obj.nextLine().toCharArray();
        int X=obj.nextInt();
        char[] alphabet=new char[27];
        char first='a';
        int count=0;
        for(int i=1;i<=26;i++)
        {
            alphabet[i]=first;
            first++;
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==alphabet[X])
                count++;
        }
        if(count>=1)
            System.out.print("yes");
        else
            System.out.print("no");
        
    }
}