// You must implement the function getOddEvenString(int N) which accepts an
// integer N as the input. The function must form a string S by replacing each odd
// digit of N by 'o' and each even digit of N by Then the function must return the
// string S.
// Example Input/Output 1:
// Input:
// 147

// Output:
// oeo

// Explanation:
// The first digit of 147 is odd. So 'o' is present as the first character of S.
// The second digit of 147 is even. So 'e' is present as the second character of S.
// The third digit of 147 is odd. So 'o' is present as the third character of S.
// So the string S is "oeo".
// Example Input/Output 2:
// Input:
// 205070

// Output:
// eeoeoe


char *getOddEvenString(int N) {
   char *result = malloc(sizeof(char) * (12 + 1));  
   int i = 0, digit;
   
   while (N > 0) {
       digit = N % 10;
       result[i++] = (digit & 1) ? 'o' : 'e';  
       N /= 10;
   }
   result[i] = '\0';  
   
   for (int j = 0; j < i / 2; j++) {
       char temp = result[j];
       result[j] = result[i - j - 1];
       result[i - j - 1] = temp;
   }

   return result;
}