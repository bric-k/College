#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
#include <ctype.h>
#include <math.h>
#include <time.h>
#include <limits.h>
#include <assert.h>

#define MAX_ACCOUNTS 100
#define MAX_NAME_LENGTH 20
#define MAX_ADDRESS_LENGTH 100
#define MAX_PHONE_LENGTH 10
#define MAX_PASSWORD_LENGTH 10
#define MAX_ACCOUNT_NUMBER_LENGTH 10
#define MAX_BALANCE_LENGTH 10
#define MAX_TRANSACTION_LENGTH 10
#define MAX_TRANSACTIONS 100

typedef struct {
    char name[MAX_NAME_LENGTH];
    char address[MAX_ADDRESS_LENGTH];
    char phone[MAX_PHONE_LENGTH];
    char password[MAX_PASSWORD_LENGTH];
    char account_number[MAX_ACCOUNT_NUMBER_LENGTH];
    char balance[MAX_BALANCE_LENGTH];
    char transactions[MAX_TRANSACTIONS][MAX_TRANSACTION_LENGTH];
} account;

account accounts[MAX_ACCOUNTS];
int num_accounts = 0;

void create_account() {
    if (num_accounts == MAX_ACCOUNTS) {
        printf("Cannot create more accounts.\n");
        return;
    }
    printf("Enter name: ");
    scanf("%s", accounts[num_accounts].name);
    printf("Enter address: ");
    scanf("%s", accounts[num_accounts].address);
    printf("Enter phone number: ");
    scanf("%s", accounts[num_accounts].phone);
    printf("Enter password: ");
    scanf("%s", accounts[num_accounts].password);
    printf("Enter account number: ");
    scanf("%s", accounts[num_accounts].account_number);
    printf("Enter balance: ");
    scanf("%s", accounts[num_accounts].balance);
    num_accounts++;
}

void delete_account() {
    printf("Enter account number: ");
    char account_number[MAX_ACCOUNT_NUMBER_LENGTH];
    scanf("%s", account_number);
    int i;
    for (i = 0; i < num_accounts; i++) {
        if (strcmp(accounts[i].account_number, account_number) == 0) {
            break;
        }
    }
    if (i == num_accounts) {
        printf("Account not found.\n");
        return;
    }
    for (int j = i; j < num_accounts - 1; j++) {
        accounts[j] = accounts[j + 1];
    }
    num_accounts--;
}

void withdraw() {
    printf("Enter account number: ");
    char account_number[MAX_ACCOUNT_NUMBER_LENGTH];
    scanf("%s", account_number);
    int i;
    for (i = 0; i < num_accounts; i++) {
        if (strcmp(accounts[i].account_number, account_number) == 0) {
            break;
        }
    }
    if (i == num_accounts) {
        printf("Account not found.\n");
        return;
    }
    printf("Enter amount: ");
    char amount[MAX_BALANCE_LENGTH];
    scanf("%s", amount);
    int balance = atoi(accounts[i].balance);
    int amount_int = atoi(amount);
    if (amount_int > balance) {
        printf("Insufficient balance.\n");
        return;
    }
    balance -= amount_int;
    sprintf(accounts[i].balance, "%d", balance);
    printf("Withdrawal successful.\n");
}

void deposit() {
    printf("Enter account number: ");
    char account_number[MAX_ACCOUNT_NUMBER_LENGTH];
    scanf("%s", account_number);
    int i;
    for (i = 0; i < num_accounts; i++) {
        if (strcmp(accounts[i].account_number, account_number) == 0) {
            break;
        }
    }
    if (i == num_accounts) {
        printf("Account not found.\n");
        return;
    }
    printf("Enter amount: ");
    char amount[MAX_BALANCE_LENGTH];
    scanf("%s", amount);
    int balance = atoi(accounts[i].balance);
    int amount_int = atoi(amount);
    balance += amount_int;
    sprintf(accounts[i].balance, "%d", balance);
    printf("Deposit successful.\n");
}

void update_info() {
    printf("Enter account number: ");
    char account_number[MAX_ACCOUNT_NUMBER_LENGTH];
    scanf("%s", account_number);
    int i;
    for (i = 0; i < num_accounts; i++) {
        if (strcmp(accounts[i].account_number, account_number) == 0) {
            break;
        }
    }
    if (i == num_accounts) {
        printf("Account not found.\n");
        return;
    }
    printf("Enter name: ");
    scanf("%s", accounts[i].name);
    printf("Enter address: ");
    scanf("%s", accounts[i].address);
    printf("Enter phone number: ");
    scanf("%s", accounts[i].phone);
    printf("Enter password: ");
    scanf("%s", accounts[i].password);
    printf("Enter balance: ");
    scanf("%s", accounts[i].balance);
}

void print_accounts() {
    for (int i = 0; i < num_accounts; i++) {
        printf("Name: %s\n", accounts[i].name);
        printf("Address: %s\n", accounts[i].address);
        printf("Phone number: %s\n", accounts[i].phone);
        printf("Password: %s\n", accounts[i].password);
        printf("Account number: %s\n", accounts[i].account_number);
        printf("Balance: %s\n", accounts[i].balance);
        printf("\n");
    }
}

int main() {
    while (true) {
        printf("1. Create account\n");
        printf("2. Delete account\n");
        printf("3. Withdraw\n");
        printf("4. Deposit\n");
        printf("5. Update info\n");
        printf("6. Print accounts\n");
        printf("7. Exit\n");
        printf("Enter choice: ");
        int choice;
        scanf("%d", &choice);
        switch (choice) {
            case 1:
                create_account();
                break;
            case 2:
                delete_account();
                break;
            case 3:
                withdraw();
                break;
            case 4:
                deposit();
                break;
            case 5:
                update_info();
                break;
            case 6:
                print_accounts();
                break;
            case 7:
                return 0;
            default:
                printf("Invalid choice.\n");
        }
    }
}