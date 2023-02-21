// The program msut accept N integers separated by an alphabet as the input. The program must print the those N integers separated by a comma as the output.

// Boundary Condition(s);
// 1<= N <=100
// 1<= Each integer value <=10^7

// Input Format:
// The first line contains N.
// The second line contains N integers separated by an alphabet.

// Output Format:
// The first line contains N integers separated by a comma.

// Example Input/Output 1:
// Input:
// 4
// 12e56y977z1234

// Output:
// 12,56,877,1234

// Explanation:
// The integers are printed separated by a comma.

// Example Input/Output 2:
// Input:
// 5
// 1s2d3h4e4

// Output:
// 1,2,3,4,4



import java.util.*;
public class Alphabets_To_Comma_Separated_Values
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        for(int i=0;i<a;i++)
        {
            try{
            String b=obj.nextLine();
            char[] c=b.toCharArray();
            for(int j=0;j<c.length;j++)
            {
                for(char ch='a';ch<='z';ch++)
                {
                    if(ch==c[j])
                    {
                        c[j]=',';
                        break;
                    }
                }
            }
            String convert=String.valueOf(c);
            System.out.print(convert);
            }
            catch(Exception e)
            {
                break;
            }
        }
    }
}