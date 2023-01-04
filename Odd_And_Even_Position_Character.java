// The program must accept a string S as the input. The program mst print the characters which are present at the odd positions in the string S then print the character which are present at the even position in the string S as the output.

// Boundary Condition(s);
// 2< = Length of S <=100

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains the characters which are present at the odd position in S.
// The second line contains the characters which are present at the even position in S.

// Example Input/Output 1:
// Input:
// Skillrack

// Output:
// silak
// klrc

// Explanation:
// The characters which are present at the odd positions in the string "skillrack" are s,i,l,a and k.
// The chracters which are present at the even positions in the string "skillrack" are k,l,r and c.
// Hence the output is 
// silak
// klrc

// Example Input/Output 2:
// Input:
// action

// Output:
// ato
// cin



import java.util.*;
public class Odd_And_Even_Position_Character
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] b=a.toCharArray();
        String odd="",even="";
        for(int i=0;i<a.length();i++)
        {
            if(i%2==0)
                odd=odd+b[i];
            else
                even=even+b[i];
        }
        System.out.println(odd);
        System.out.print(even);
    }
}