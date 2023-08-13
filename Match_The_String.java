// The program must accept N pairs as the input. Each pair contains an integer L
// followed by a string value S. The integer L represents the length of a string among
// the N string values. The program must interchange the string values
// corresponding to their length values. Finally, the program must print all the
// modified pairs as the output.

// Note: The length of the N string values is unique.

// Boundary Condition(s):
// 2 <= N <= 100
// 1 <= L, Length of S <= 1000

// Input Format:
// The first line contains N.
// The next N lines each contain L and S separated by a space.

// Output Format:
// The first N lines each contain an integer and a string value separated by a space.

// Example Input/Output 1:
// Input:
// 4
// 5 danger
// 6 dog
// 3 telephone
// 9 movie

// Output:
// 5 movie
// 6 danger
// 3 dog
// 9 telephone


// Explanation:
// In the first pair, the integer value is 5 which is equal to the length of the string
// 'movie". So 5 movie is printed.
// In the second pair, the integer value is 6 which is equal to the length of the string
// "danger". So 6 danger is printed.
// In the third pair, the integer value is 3 which is equal to the length of the string
// "dog". So 3 dog is printed.
// In the fourth pair, the integer value is 9 which is equal to the length of the string
// "telephone". So 9 telephone is printed.

// Example Input/Output 2:
// Input:
// 5
// 3 battle
// 4 sun
// 8 tree
// 6 elephant
// 5 apple

// Output:
// 3 sun
// 4 tree
// 8 elephant
// 6 battle
// 5 apple


import java.util.*;
public class Match_The_String
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int[] arr=new int[size];
        String[] value=new String[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=obj.nextInt();
            value[i]=obj.next();
        }
        for(int i=0;i<size;i++)
            for(int j=0;j<size;j++)
                if(value[j].length()==arr[i])
                    System.out.println(arr[i]+" "+value[j]);
        
    }
}