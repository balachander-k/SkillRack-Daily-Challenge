// The program must accept N string values as the input. The program must print the
// string S with the maximum number of consonants. If more than one string have
// the maximum number of consonants then print the first occurring string.
// Note: At least one string will contain one or more consonants.

// Boundary Condition(s):
// 1 <= N, Length of S <= 10^3

// Input Format:
// The first line contains N.
// The next N lines contain the string values.

// Output Format:
// The first line contains the string value which has maximum number of consonants.

// Example Input/Output 1:
// Input:
// 4
// dog
// puppy
// tiger
// lion

// Output:
// puppy

// Explanation:
// The string "dog" has 2 consonants.
// The string "puppy" has 4 consonants.
// The string "tiger" has 3 consonants.
// The string "lion" has 2 consonants.
// Hence the output is puppy

// Example Input/Output 2:
// Input:
// 5
// Scooter
// Ambulance
// Skateboard
// Bus
// Helicopter

// Output:
// Skateboard

import java.util.*;
public class Consonants_Count
{
    public static boolean isVowel(char c)
    {
        char ch=Character.toLowerCase(c);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            return true;
        return false;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt(),max=0,index=0;
        String[] arr=new String[size];
        for(int i=0;i<size;i++)
            arr[i]=obj.next();
        for(int i=0;i<size;i++)
        {
            char[] val=arr[i].toCharArray();
            int count=0;
            for(int j=0;j<val.length;j++)
                if(!isVowel(val[j]))
                    count++;
            if(count>max)
            {
                max=count;
                index=i;
            }
        }
        System.out.print(arr[index]);
    }
}