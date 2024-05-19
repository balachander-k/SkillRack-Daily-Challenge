// The program must accept the names of N patients and the time (in 24-hr format) they
// entered a hospital as the input. The hospital's policy is to provide tokens based on the
// patient's entry time. The program must print the names of the N patients along with their
// token number in ascending order.

// Note: Two entries are not allowed at a given time.
// Boundary Condition(s):
// 3 <= N <= 50
// 3 <= Length of each patient's name <= 50

// Input Format:
// The first line contains N.
// The next N lines, each containing the name and the entry time of a patient separated by a
// space.

// Output Format:
// The first N lines, each containing the name and the token number of a patient separated by
// a space.

// Example Input/Output 1:
// Input:
// 5
// sandy 09:30
// Joel 11:15
// Priya 21:00
// Abdul 13:46
// Kapli 13:45

// Output:
// Sandy 1
// Joel 2
// Kapli 3
// Abdul 4
// Priya 5

// Explanation:
// The tokens are provided based on the entry time of the patients.
// The patient Sandy entered the hospital at 09:30, so he has the token 1.
// The patient Joel entered the hospital at 11:15, so he has the token 2.
// The patient Kapli entered the hospital at 13:45, so he has the token 3.
// The patient Abdul entered the hospital at 13:46, so he has the token 4.
// The patient Priya entered the hospital at 21:00, so she has the token 5.
// Hence the output is

// Sandy 1
// // Joel 2
// Kapli 3
// Abdul 4
// Priya 5

// Example Input/Output 2:
// Input:
// 8
// Leena 19:34
// Patel 17:12
// Varun 21:13
// John 18:56
// Rob 19:20
// Mohammed 19:33
// Kishore 17:11
// Vishnu 21:12

// Output:
// Kishore 1
// Patel 2
// John 3
// Rob 4
// Mohammed 5
// Leena 6
// Vishnu 7
// Varun 8

// Example Input/Output 3:
// Input:
// 3
// Hari 09:35
// Akhila 09:33
// Rob 09:31

// Output:
// Rob 1
// Akhila 2
// Hari 3


import java.util.*;
public class Patient_Tokens
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<String> temp=new ArrayList<String>();
        int N=obj.nextInt(),cout=1;
        obj.nextLine();
        String[] arr=new String[N];
        for(int i=0;i<N;i++)
            arr[i]=obj.nextLine();
        for(int i=0;i<N;i++)
        {
            String[] val=arr[k].split(" ");
            temp.add(val[1]);
        }
        Collections.sort(temp);
        for(int i=0;i<N;i++)
        {
            String[] arrsp=arr[i].split(" ");
            for(int j=0;j<temp.size();j++)
                if(arrsp[1].equals(temp.get(j)))
                    list.add(j);
            
        }
        for(int i=0;i<temp.size();i++)
        {
            String v=temp.get(i);
            for(int j=0;j<N;j++)
            {
                String[] sarr=arr[j].split(" ");
                String t=sarr[1];
                if(v.equals(t))
                    System.out.println(sarr[0]+" "+(count++));
            }
        }
    }
}