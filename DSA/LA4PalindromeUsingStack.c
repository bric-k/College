#include <stdio.h>
#include <string.h>
#define MAX_SIZE 50

int top = -1;
char stack[MAX_SIZE];

//pushing characters in stack
void push(char c) {
  if (top == MAX_SIZE - 1) {
    printf("Stack overflow\n");
    return;
  }
  stack[++top] = c;
}

//popping characters from stack
char pop() {
  if (top == -1) {
    printf("Stack underflow\n");
    return '\0';
  }
  return stack[top--];
}

//to check for palindrome
int isPalindrome(char str[]) {
  int len = strlen(str);
  for (int i = 0; i < len; i++) {
    push(str[i]);
  }
  for (int i = 0; i < len; i++) {
    if (pop() != str[i]) {
      return 0;
    }
  }
  return 1;
}

//entering string
int main() {
  char str[MAX_SIZE], rev_str[MAX_SIZE];
  int i, j; 
  printf("Enter a string: ");
  fgets(str, MAX_SIZE, stdin);
  str[strcspn(str, "\n")] = '\0';

// printing original
   printf("Original string: %s\n", str);

    // reverse the string
    j = 0;
    for (i = strlen(str) - 1; i >= 0; i--) {
        rev_str[j] = str[i];
        j++;
    }
    rev_str[j] = '\0';

    // print the reversed string
    printf("Reversed string: %s\n", rev_str);

  if (isPalindrome(str)) {
    printf("The string is a palindrome.\n");
  } else {
    printf("The string is not a palindrome.\n");
  }
  return 0;
}