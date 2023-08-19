# Please convert the following Python code to C so that the C program executes
# successfully passing the test cases.

# str1=input()
# str2=input()
# for ch in str1:
#     if not ch in str2:
#         print(ch,end="")
#         break
# else:
#     print("-1")



// converted Code 

#include <stdio.h>
#include <string.h>

int main() {
    char str1[100];
    char str2[100];
    scanf("%s", str1);
    scanf("%s", str2);
    
    int found = 0;
    for (int i = 0; i < strlen(str1); i++) {
        int present = 0;
        for (int j = 0; j < strlen(str2); j++) {
            if (str1[i] == str2[j]) {
                present = 1;
                break;
            }
        }
        if (!present) {
            printf("%c", str1[i]);
            found = 1;
            break;
        }
    }
    
    if (!found) {
        printf("-1");
    }
    
    return 0;
}