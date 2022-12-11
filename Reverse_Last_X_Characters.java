// The program must accept a string value S and an integer X as the input. The program must reverse the last X characters in S. Then the program must print the modified string as the output.

// Boundary Condition(s);
// 1<= Length of S <=100
// 1<= X <=Length of S


// Input Format:
// The first line contains the value of string S.
// The second line contains the integer X.

// Output Format:
// The first line contains the modified string.

// Example Input/Output 1:
// Input:
// skillrack
// 3

// Output:
// skillrkca

// Explanation:
// The last 3 characters in the string "skillrack" are a,c and k. After the reversing the last three characters, the string becomes "skillrkca".
// Hence the output is skillrkca.

// Example Input/Output 2:
// Input:
// program 
// 7

// Output:
// margorp




import java.util.*;
public class Reverse_Last_X_Characters{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        int c=obj.nextInt();
        char[] b=a.toCharArray();
        String temp="";
        int count=0,sub=b.length-c;
        for(int i=b.length-1;i>=0;i--)
        {
            if(count==c)
                break;
            else 
                temp=temp+b[i];
                count++;
        }
        System.out.print(a.substring(0,sub)+temp);
        
    }
}