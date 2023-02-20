// The program must accept N string values and an integer K as the input. The prograrn must
// print the count Of string values having at most K non repeated alphabets as output-

// All the alphabets in each String ate in lowercase.

// Boundary Condition(s);
// 1 <= N <=1000
// I < = Length Of each string <=100
// 1 <= K  <=26

// Input Format:
// The first line contains the values of N K separated by a space.
// The next N lines each contain a string value.

// Output Format:
// The first line contains the count of string values having at most K non repeated alphabets.

// Example Input/Output 1:
// Input:
// 4 3
// onion
// radish
// cabbage
// yam

// Output:
// 3

// Explanation:
// The string "onion" has only one non repeated alphabet.
// The string "radish" has 6 non repeated alphabets.
// The string "cabbage" has 3 non repeated alphabets.
// The string "yam" has 3 non repeated alphabets.
// So only 3 string values ("onion","cabbage" and "yam") have at most 3 non repeated.

// Example Input/Output 2:
// Input:
// 6 2
// dengue
// fever
// malaria
// cholera
// headache
// diarrhea

// output:
// 1



import java.util.*;
public class Non_Repeated_Alphabets_At_Most_K 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),b=obj.nextInt(),flag=0,t=0,count=0,non=0;
        int[] array=new int[a];
        for(int i=0;i<a;i++)
        {
            String c=obj.next();
            char[] d=c.toCharArray();
            for(int j=0;j<d.length;j++)
            {
                flag=0;
                for(int r=0;r<d.length;r++)
                {
                    if(d[j]==d[r] && j!=r)
                    {
                        flag=1;
                        break;
                    }
                }
                if(flag==0)
                {
                  count++;
                }
            }
           if(count<=b)
           {
               non++;
           }
           count=0;
        }
        System.out.print(non);
    }
}