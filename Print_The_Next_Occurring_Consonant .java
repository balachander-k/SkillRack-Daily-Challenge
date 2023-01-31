// The program msut accept a charcter ch as the input. The program must print the next occurring consonant as the output.
// Note: the output character must be of same case as the input character.

// Input Format:
// The first  line contains the character ch.

// Output Format:
// The first line contains the character as per the given condition.

// Example Input/Output 1:
// Input:
// T

// Output:
// V

// Explanation:
// The next consonant after T is V hence V is printed as the output.

// Example Input/Output 2:
// Input:
// F

// Output 
// G


import java.util.*;
public class s
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
        char a=obj.next().charAt(0);
        int b=1;
        while(b!=0)
        {
            ++a;
            if(isVowel(a)==0)
            {
                System.out.print(a);
                break;
            }
        }
        
    }
}