// A store is open from 8:00AM to 9:00PM. A sales person working in the store must
// be present in the store for atleast 8 hours. The sales person can take tea/lunch
// breaks in between. The store has Entry and Exit time monitoring system. The
// program must accept the N entry and exit time entries and print if on a given day,
// the sales person was present in the store for 8 hours. E indicates Entry time and X
// indicates Exit time.

// Boundary Condition(s):
// 1 <= N < = 100

// Input Format:
// The first line contains N.
// Next N lines contain the entry or exit time in 24 hour HH:MM format.

// Output Format:
// The first line yes or no.


// Example Input/Output 1:
// Input:
// 8
// E 8:30
// x 10:00
// E 11:00
// x 14:00
// E 15:00
// x 17:30
// E 17:45
// x 21:00

// Output:
// yes

// Explanation:
// The sales person was present in the following time slots.
// 8:30-10:00= 90 minutes
// 11:00-14:00 = 180 minutes
// 15:00-17:30= 150 minutes
// 17:45-21:00= 195 minutes
// So total minutes = 90+180+150+195 = 615 minutes = 10 hours and 15 minutes
// which is more than 8 hours.
// Hence yes is printed.


// Example Input/Output 2:
// Input:
// 6
// E 10:30
// x 12:00
// E 13:00
// x 14:00
// E 18:00
// x 21:00

// Output:
// no

// Explanation:
// The sales person was present in the following time slots.
// 10:30 - 12:00= 90 minutes
// 13:00 - 14:00= 60 minutes
// 18:00 - 21:00 = 180 minutes
// So total minutes = 90+60+180 = 330 minutes = 5 hours and 30 minutes which is
// less than 8 hours.
// Hence no is printed.


import java.util.*;
public class Employee_Work_Duration
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt(),sum=0,comp=8*60,h1=0,h2=0,m1=0,m2=0,minutes=0,hm1=0,hm2=0;
        for(int i=0;i<a/2;i++)
        {
            char b=obj.next().charAt(0);
            String c=obj.next(),val="",store="";
            char d=obj.next().charAt(0);
            String e=obj.next();
            String[] f=c.split(":");
            String[] t=e.split(":");
            h1=Integer.parseInt(f[0]);
            m1=Integer.parseInt(f[1]);
            h2=Integer.parseInt(t[0]);
            m2=Integer.parseInt(t[1]);
            hm1=h1*60;
            hm2=h2*60;
            minutes=((hm1+m1)-(hm2+m2));
            sum=Math.abs(minutes)+sum;
        }
        if(sum>comp)System.out.print("yes");
        else System.out.print("no");
        
    }
}