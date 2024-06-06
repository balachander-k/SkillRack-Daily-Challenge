// The program must accept N messages shared between the two persons A and B in a single
// day (from 00:00:00 to 23:59:59) as the input. Each message contains the author's name, the
// time of the message sent (in 24-hour format HH:MM:SS) and the content of the message.
// The program must sort and print those N messages in the chronological order as the
// output.

// Note: More than one messages at a time are not possible.

// Boundary Condition(s):
// 2 <= N <= 50
// 12 <= Length of each message <= 100

// Input Format:
// The first line contains N.
// The next N lines, each containing the author's name, the time of the message sent and the
// content of the message separated by a space.

// Output Format:
// The first N lines, each containing the author's name and the content of the message
// separated by a colon.

// Example Input/Output 1:
// Input:
// 4
// A 07:32:21 u can upload first
// A 07:32:30 then you can tag
// A 07:33:10 please ping me once it is done.
// B okay

// Output:
// A:u can upload first
// A:then you can tag
// B:okay
// A:please ping me once it is done.

// Explanation:
// The first message u can upload first was sent at 07:32:21.
// The second message then you can tag was sent at 07:32:30.
// The third message please ping me once it is done was sent at 07:33:10.
// The fourth message okay was sent at 07:32:41.
// After sorting the 4 messages in chronological order, the order of the messages become 1, 2,
// 4 and 3.
// Hence the output is
// A:u can upload first
// A:then you can tag
// B:okay
// A:please ping me once it is done.

// Example Input/Output 2:
// Input:
// 5
// A 12:15:29 hey are you there?
// B 12:59:55 bye see you later
// A 12:45:13 have you done the work?
// B yes
// B 12:45:59 yes i have completed

// Output:
// A:hey are you there?
// B:yes
// A:have you done the work?
// B:yes i have completed
// B:bye see you later

// Example Input/Output 3:
// Input:
// 6
// A SURE
// B 15:16:46 Can we go for a movie?
// B 15:15:54 are you free this weekend?
// A Hi, B!
// A 15:16:17 1 think so, why?
// B HELLO, A!

// Output:

// B:HELLO, A!
// A:Hi, B!
// B:are you free this weekend?
// A:l think so, why?
// B:Can we go for a movie?
// A:SURE



import java.util.*;
public class Sort_Messages_Chrnological_Order
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<String> timemsg=new ArrayList<String>();
        int N=obj.nextInt();
        obj.nextLine();
        String[] arr=new String[N];
        for(int i=0;i<N;i++)
            arr[i]=obj.nextLine();
        for(int i=0;i<N;i++)
        {
            String[] carr=arr[i].split(" ");
            String time=carr[1];
            timemsg.add(time);
        }
        Collections.sort(timemsg);
        for(int j=0;j<timemsg.size();j++)
        {
            for(int i=0;i<N;i++)
            {
                String[] carr=arr[i].split(" ");
                if(carr[1].equals(timemsg.get(j)))
                {
                    System.out.print(carr[0]+" ");
                    for(int k=2;k<carr.length;k++)
                        System.out.print(carr[k]+" ");
                }
            }
            System.out.println();
        }
    }
}