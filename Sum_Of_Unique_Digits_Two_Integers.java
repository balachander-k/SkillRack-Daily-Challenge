// The program msut accept two integers M and N as the input. The program msut print YES if the sum of unique digits in M and the sum of unique digits in N are equal. Else the program must print No as the output.

// Boundary Condition(s);
// 1<= M,N <=10^9

// Input Format:
// The first line contains the value of M and N separated by a space.

// Output Format:
// The first line contains either YES or NO

// Example Input/Output 1:
// Input:
// 2452 9222

// Ouput:
// YES

// Explanation:
// The sum of unique digits in 2452 is 11 (2+4+5).
// The sum of unique digits in 9222 is 11 (9+2).
// So the sum of unique digits in 2542 and 9222 are equal.

// Example Input/Output 2:
// Input:
// 121 3035

// Output:
// NO



import java.util.*;
public class Sum_Of_Unique_Digits_Two_Integers
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] b=a.toCharArray();
        int count=0,sum1=0,sum=0,len=a.length();
        for(int i=0;i<a.length();i++)
        {
            if(b[i]==' ')
            {
                count=i;
            }
        }
        for(int i=0;i<count;i++)
        {
            for(int j=i+1;j<count;j++)
            {
                if(b[i]==b[j])
                {
                    for(int q=j;q<count-1;q++)
                    {
                        b[q]=b[q+1];
                    }
                    j--;
                    count--;
                }
            }
        }
        for(int i=0;i<count;i++)
        {
            sum=sum+Integer.parseInt(String.valueOf(b[i]));
        }
        ++count;
        for(int i=count;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                if(b[i]==b[j])
                {
                    for(int q=j;q<len-1;q++)
                    {
                        b[q]=b[q+1];
                    }
                    j--;
                    len--;
                }
            }
        }
        for(int i=count;i<len;i++)
        {
            if(b[i]==' ')
            {
                continue;
            }
            else 
            {
                sum1=sum1+Integer.parseInt(String.valueOf(b[i]));
            }
        }
        if(sum==sum1)
            System.out.println("YES");
        else 
            System.out.println("NO");
    }
}