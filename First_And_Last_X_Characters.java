//The program must accept a string S and integer X as the input. The program must print the first X characters and the last X characters in S as the ouput.
//
//Boundary Condition(s):
//3<=Length of S <=100
//1<=X<=Length of S/2
//
//Input Format:
//The first line contains the String S
//The second line contains the integer X
//
//Output Format:
//The first line contains the first X characters and the last X characters in S
//
//Example Input/Ouput 1:
//Input:
//transport
//3
//
//Output:
//traort
//
//Explanation:
//The first 3 characters in the string transport are t r a
//The last 3 characters in the string transport are o r t
//
//
//Example Input/Output 2:
//Input:
//chennai
//2
//
//Output:
//chai


import java.util.*;
public class First_And_Last_X_Characters {
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        int b=obj.nextInt();
        char[] c=a.toCharArray();
        int len=a.length();
        int i=1,r=1,k=0,j=0;
        while(i<=b)
        {
            System.out.print(c[k]);
            k++;
            i++;
        }
        int temp=len-b;
        while(r<=b)
        {
            System.out.print(c[temp]);
            temp++;
            r++;
        }
    }
    
}
