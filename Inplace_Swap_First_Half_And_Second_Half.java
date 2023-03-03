// The program must swap the first half and second half in the string str passed as the argument
// to the function swapFirstHaIfSecondHalf.

// Note: The length of the string str is always even.

// Example Input/Output 1:
// Input:
// capslock

// Output:
// lockcaps

// Explanation:
// The first half of the string str is "caps".
// The second half of the string str is "lock".
// After swapping, the str becomes "lockcaps".

// Example Input/Output 2:
// Input:
// keymap

// Output:
// mapkey

private static void SwapFirstHalfSecondHalf(char str[])
{
    String val=String.valueOf(str);
    int len=val.length()/2,j=0;
    for(int i=len;i<a.length();i++)
    {
        str[j]=val.charAt(i);
        j++;
    }
    for(int i=0;i<len;i++)
    {
        str[j]=val.charAt(i);
        j++;
    }
}