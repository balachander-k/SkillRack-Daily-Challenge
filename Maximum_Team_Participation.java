// The program must accept marks of N sutdents as the input. There is a team even held in college and to participate in the event they need to scorew at least 5o. Each team must have exactly 3 students. The program must print the minimum number of teams that can participate in the event as the output.

// Boundary Condition(s);
// 1<= N <=1000
// 0<= Marks <=100

// Input Format:
// The first line contains N.
// The second line contains N integers separated by space.

// Output Format:
// The first line contains the maximum number of teams that can participate in the event.

// Example Input/Output 1:
// Input:
// 9 50 68 45 78 21 68 98 100 87

// Output:
// 2

// Explanation:
// There are 7 eligible students but only 6 students can form teams with 3 students ech. So the output is 2.

// Example Input/Output 2:
// Input:
// 11
// 38 47 97 96 44 59 23 32 61 78 24

// Output:
// 1


import java.util.*;
public class Maximum_Team_Participation
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),count=0;
        for(int i=0;i<a;i++)
        {
            int b=obj.nextInt();
            if(b>=50)count++;
        }
        System.out.print(count/3);
    }
}