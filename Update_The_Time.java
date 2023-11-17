// The program must accept a time T (in 24hr format HH:MM) and an integer X as
// the input. The program must update the time T by adding X minutes to it. Then
// the program must print the updated time T in the same 24hr format as the output.
// Boundary Condition(s):
// O <= HH <= 23
// O <= MM <= 60
// 1 <= X <=10^8

// Input Format:
// The first line contains T.
// The second line contains X.

// Output Format:
// The first line contains the updated time T.

// Example Input/Output 1:
// Input:
// 08:15
// 20

// Output:
// 08:35

// Explanation:
// Here, HH=08, MM-15 and
// After adding 20 minutes, the time T becomes 08:35
// So 08:35 printed as the output.

// Example Input/Output 2:
// Input:
// 23:50
// 15

// Output:
// 00:05



import java.util.*;
public class Update_The_Time 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String time=obj.nextLine();
        String[] timepart=time.split(":");
        int addmin=obj.nextInt();
        int h=Integer.valueOf(timepart[0]),m=Integer.valueOf(timepart[1]);
        for(int i=1;i<=addmin;i++)
        {
            m+=1;
            if(m>=60)
            {
                m=0;
                h++;
                if(h>=24)
                    h=0;
            }
        }
        String update=String.format("%02d:%02d",h,m);
        System.out.print(update);
    }
}