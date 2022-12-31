// The program must accept N integers and an integer X as the input. For each integer, the program must square the value of the integer and then add X to it. Then the program must print all the integers except the integers which are ending with 5 or 6. If the modified values of all the N integers are ending with 5 or 6 then the program must print -1 as the output.

// Boundary Condition(s);
// 1<= N,X <=100
// 1<= Each integer value <=10^8

// Input Format:
// The first line contains the values of N and X separated by a space.
// The second line contains N integers separated by space(s).

// Output Format:
// The first line contains the either -1 or the list of integers which do not end with 5 or 6 separated by a space.

// Example Input/Output 1:
// Input:
// 4 10
// 3 1 4 7

// Output:
// 19 11 59

// Explanation:
// The modified value of the first integer is 19(3*3+10).
// The modified value of the second integer is 11(1*1+10).
// The modified value of the third integer is 26(4*4+10).
// The modified value of the fourth integer is 59(7*7+10).
// The modified value which do not end with 5 or 6 are 19,11 and 59.
// Hence hte output is 19 11 59.

// Example Input/Output 2:
// Input:
// 4 2
// 2 18 22 8

// Output:
-1



import java.util.*;
public class Not_Ending_With_5_Or_6
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a=obj.nextInt(),b=obj.nextInt();
	    long[] c=new long[a];
	    for(int i=0;i<a;i++)
	        c[i]=obj.nextLong();
	    long[] d=new long[a];
	    for(int i=0;i<a;i++)
	        d[i]=(c[i]*c[i])+b;
	    int count=0;
	    for(int i=0;i<a;i++)
	    {
	        if((d[i]%10==5) || (d[i]%10==6))
	        {
	            count++;
	            continue;
	        }
	       System.out.print(d[i]+" ");
	    }
	    if(count==a)
	        System.out.print(-1);
	}
}