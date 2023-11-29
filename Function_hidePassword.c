// You must implement the function hidePassword(char str[]) which accepts a
// string str as the input. The function must calculate the number of alphabets A in
// str and the number of digits D in str. Then the function must modify the string str
// by replacing each alphabet by * (asterisk) if A is greater than or equal to D. Else
// the function must modify the string str by replacing each digit by * (asterisk).
// Note: The string str contains at least 1 alphabet and 1 digit
// Example Input/Output 1:
// Input:
// s1r2a3ck

// Output:
// *1*2*3**

// Explanation:
// Here the string str is slr2a3cl(.
// The count of alphabets in slr2a3ck is 5 and the count of digits in s1r2a3ck is 3.
// Here 5 is greater than 3, so the alphabets are replaced by * (asterisk).
// Hence the output is *1*2*3**

// Example Input/Output 2:
// Input:
// 123ABCD007

// Output:
// ***ABC***

void hidePassword(char str[]) {
  int alphabetCount = 0;
  int digitCount = 0;

  // Count alphabets and digits
  for (int i = 0; str[i] != '\0'; i++) {
    if ((str[i] >= 'A' && str[i] <= 'Z') || (str[i] >= 'a' && str[i] <= 'z')) {
      alphabetCount++;
    } else if (str[i] >= '0' && str[i] <= '9') {
      digitCount++;
    }
  }

  // Replace characters based on comparison
  for (int i = 0; str[i] != '\0'; i++) {
    if ((str[i] >= 'A' && str[i] <= 'Z') || (str[i] >= 'a' && str[i] <= 'z')) {
      if (alphabetCount >= digitCount) {
        str[i] = '*';
      }
    } else if (str[i] >= '0' && str[i] <= '9') {
      if (alphabetCount < digitCount) {
        str[i] = '*';
      }
    }
  }
}

int main() {
  char str[100];
  printf("Enter a string: ");
  scanf("%s", str);

  hidePassword(str);
  printf("Modified string: %s\n", str);

  return 0;
}