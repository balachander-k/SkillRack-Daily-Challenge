// The program must accept a string S as the input. The program must print the
// characters from the last but one occurrence of the last character in S. If the last
// character occurs only once, the program must print -1 as the output.

// Boundary Condition(s):
// 2 <= Length of S <= 100

// Input Format:
// The first line contains S.

// Output Format:
// The first line contains the characters from the last but one occurrence of the last
// character in S or -1.

// Example Input/Output 1:
// Input:
// banana

// Output:
// ana

// Explanation:
// The last character in S is a.
// The characters from the last but one occurrence of a in S are ana.
// So ana is printed as the output.

// Example Input/Output 2:
// Input:
// skillrack

// Output:
// killrack

// Example Input/Output 3:
// Input:
// enter

// Output:
// -1

using System;

class LastCharacterButLastOne {
  static void Main() {
    var S=Console.ReadLine();
    var last=S[S.Length-1];
    var index=-1;
    for(var j=S.Length-2;j>=0;j--)
    {
        if(last==S[j])
        {
            index=j;
            break;
        }
    }
    Console.WriteLine((index!=-1)?S.Substring(index):"-1");
  }
}