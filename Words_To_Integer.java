// The program must accept a string S representing an integer in words as the input.
// The program must print the corresponding digit for each word in S as the output.
// The words and their equivalent digits are given below.
// zero - 0
// one - 1
// two -2
// three - 3
// four - 4
// five - 5
// six -6
// seven - 7
// eight - 8
// nine -9

// Boundary Condition(s):
// 3 <= Length of S <= 10^8

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains a digit for each word in S.

// Example Input/Output 1:
// Input:
// one five seven

// Output:
// 157

// Example Input/Output 2:
// Input:
// four nine nine zero eight one

// Output:
// 499081

import java.util.*;
public class Words_To_Integer
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        HashMap<String,Integer> map=new HashMap<>();
        map.put("zero",0);
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);
        map.put("seven",7);
        map.put("eight",8);
        map.put("nine",9);
        String val=obj.nextLine();
        String[] temp=val.split(" ");
        for(int i=0;i<temp.length;i++)
            if(map.containsKey(temp[i]))
                System.out.print(map.get(temp[i]));
    }
}