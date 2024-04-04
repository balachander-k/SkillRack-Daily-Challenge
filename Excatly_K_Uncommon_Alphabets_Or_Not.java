import java.util.*;
public class Excatly_K_Uncommon_Alphabets_Or_Not
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        char[] s1=obj.next().toCharArray(),s2=obj.next().toCharArray();
        int k=obj.nextInt(),c=0;
        for(int i=0;i<s1.length;i++)
        {
            for(int j=0;j<s2.length;j++)
            {
                if(s1[i]==s2[j]){
                        s1[i]='0';s2[j]='0';}
            }
        }
        for(int i=0;i<s1.length;i++)if(s1[i]!='0')c++;
        for(int i=0;i<s2.length;i++)if(s2[i]!='0')c++;
        System.out.print((c==k)?"yes":"no");
    }
}