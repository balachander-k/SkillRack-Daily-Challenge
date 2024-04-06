// The program must accept a string S containing multiple words as the input. The
// program must convert the string S into CamelCase format. Then the program must
// print the modified string as the output.

// Boundary Condition(s):
// 3 <= Length of S <= 1000

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the modified string S.

// Example Input/Output 1:
// Input:
// skill a rack

// Output:
// SkillARack

// Explanation:
// The given string is "skill a rack".
// After converting the above string into CamelCase format, the string becomes
// "SkillARack".
// Hence the output is SkillARack

// Example Input/Output 2:
// Input:
// good morning

// Output:
// GoodMorning


import java.util.*;
public class String_CamelCase_Conversion
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            char[] carr=arr[i].toCharArray();
            for(int j=0;j<carr.length;j++)
            {
                if(j==0)
                    carr[j]=Character.toUpperCase(carr[j]);
            System.out.print(carr[j]);
            }
        }
    }
}