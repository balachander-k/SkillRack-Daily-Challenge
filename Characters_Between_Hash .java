// The program must accept a string value S as the input. The program must print only the characters present between the character "#" as the output.

// Boundary Condition(s);
// 1<= Length of S <=100

// Input Format:
// The first line contains the string S.

// Output Format:
// The first line contains the characters present between the character "#".

// Example Input/Output 1:
// Input:
// Dhoni#007#wghba56#sfsfga

// Output:
// 007wghba56

// Explanation:
// The characters between the first "#" and the second "#" in the string "Dhoni#007#wghba56#sfsfga" is 007.
// The characters between the second "#" and the third "#" in the string "Dhoni#007#wghba56#sfsfga" is wghba56.
// Hence the output is 007wghba56

// Example Input/Output 2:
// Input:
// #dsvnsxvz#

// Output:
// dsvnsxvz



import java.util.*;
public class Characters_Between_Hash 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] b=a.toCharArray();
        int count=0;
        String val="";
        for(int i=0;i<a.length();i++)
        {
            if(b[i]=='#')
            {
                count++;
                if(count==2)
                {
                    System.out.print(val);
                    val="";
                    count=1;
                }
            }
            if(count==1)
            {
                if(b[i]=='#')
                    continue;
                else    
                    val=val+b[i];
            }
        }
    }
}