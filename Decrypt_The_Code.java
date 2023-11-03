// The program must accept a string S (encrypted string) containing only . (Dots) and
// - (Hyphens) as the input. The encryption algorithm is given below.
// - Digit O is encrypted as . (Single Dot).
// - Digit 1 is encrypted as (Hyphen and Dot).
// - Digit 2 is encrypted as -- (Two Hyphens).

// The program must decrypt the string S and print it as the output.

// Note: The string S is always a valid encrypted string.

// Boundary Condition(s):
// 1 <= Length of S <= 1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the decrypted string of S.

// Example Input/Output 1:
// Input:
// .-.--

// Output:
// 012

// Explanation:
// 012 can be decrypted as ".-.--"

// Example Input/Output 2:
// Input:
// --.

// Output:
// 20


import java.util.*;
public class Decrypt_The_Code 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] temp=obj.next().toCharArray();
        for(int i=0;i<temp.length;i++)
        {
            try{
                if(temp[i]=='-' && temp[i+1]=='.')
                {
                    System.out.print("1");
                    i++;
                }
                else if(temp[i]=='-' && temp[i+1]=='-')
                {
                    System.out.print("2");
                    i++;
                }
                else 
                    System.out.print("0");
            }
            catch(Exception e)
            {
                break;
            }
        }
    }
}