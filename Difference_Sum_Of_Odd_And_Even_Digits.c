// Given a maximum of hundred digits as the input. The program must print the
// difference between the sum of odd and even digits as the output. If the input is
// not a valid number, then print Invalid as the output.

// Example Input/Output 1:
// Input:
// 118745913

// Output:
// 15

// Explanation:
// The sum of odd digits is 27 (1, 1, 7, 5, 9, 1 and 3).
// The sum of even digits is 12 (8 and 4).
// So the difference is 27-12 = 15.
// Hence the output is 15

// Example Input/Output 2:
// Input:
// 235468173645

// Output:
// -6

// Example Input/Output 3:
// Input:
// 76320Afk384

// Output:
// Invalid

// Note: The invalid number may contain white spaces.

#include <stdio.h>
#include <string.h>
int main()
{
    char str[1000];
    scanf("%[^\n]s",str);
    int len=strlen(str);
    int odd=0,even=0,count=0,space=0;
    for(int i=0;i<len;i++)
    {
        int as=(int)str[i];
        if(as==32)
            space++;
        if(as>=48 && as<=57)
        {
            int con=as-48;
            count++;
            if(con%2==0)
                even=even+con;
            else 
                odd=odd+con;
        }
    }
    if(count!=len || space>0)
        printf("Invalid");
    else 
        printf("%d",(odd-even));
    return 0;
}
