// The program must accept the value of string S as the input. The program must reverse all the words in S except the first and last word of the string. Then the program must print the modified string value as the output.

// Boundary Condition(s);
// 5 <= Length of S <= 999

// Input Format:
// The first line contains the value of S.

// Output Format:
// The first line contains the modified string value.

// Example Input/Output 1:
// Input:
// Hi how are you

// Output:
// Hi woh rea you

// Example Input/Output 2:
// Input:
// I am fine

// Output:
// I ma fine




import java.util.*;
public class Reverse_Middle_Words_In_S
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
		String a=obj.nextLine();
		String[] b=a.split(" ");
		StringBuilder[] str=new StringBuilder[a.length()];
		int count=0;
		for(String temp:b)
		{
		    count++;
		}
		for(int i=0;i<count;i++)
		{
		    str[i]=new StringBuilder(b[i]);
		}
	    int min=count-2;
	    if(count==1 || count==2)
	    {
	        System.out.print(a);
	    }
	    else 
	    {
	        System.out.print(str[0]+" ");
	        for(int i=1;i<=min;i++)
	        {
	            System.out.print(str[i].reverse()+" ");
	        }
	        System.out.print(str[count-1]);
	    }
	}
}
