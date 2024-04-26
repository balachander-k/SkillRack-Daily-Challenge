import java.util.*;
public class Count_Most_Repeated_Character 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        int[] arr=new int[256];
        char[] s=obj.next().toCharArray();
        for(int i=0;i<s.length;i++)
        {
            int ascii=(int)s[i];
            int temp=arr[ascii];
            arr[ascii]=++temp;
        }
        for(int i=0;i<arr.length;i++)
            if(arr[i]!=0)
                if(arr[i]>max)
                    max=arr[i];
        System.out.print(max);
    }
}