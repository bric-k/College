#include <stdio.h>
#include <string.h>

#define MAX_STUDENTS 50

struct student {
    int roll_no;
    char name[30];
    float marks;
};

void bubble_sort(struct student arr[], int n)
{
    int i, j;
    struct student temp;
    for (i = 0; i < n-1; i++) {
        for (j = 0; j < n-i-1; j++) {
            if (arr[j].roll_no > arr[j+1].roll_no) {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}

int main()
{
    struct student students[MAX_STUDENTS];
    int n, i, j;
    printf("Enter the number of students (max %d): ", MAX_STUDENTS);
    scanf("%d", &n);
    for (i = 0; i < n; i++) {
        printf("Enter details of student %d:\n", i+1);
        printf("Roll Number: ");
        scanf("%d", &students[i].roll_no);
        printf("Name: ");
        scanf("%s", students[i].name);
        printf("Marks: ");
        scanf("%f", &students[i].marks);
    }
    bubble_sort(students, n);
    printf("Students sorted by marks:\n");
    for (i = 0; i < n; i++) {
        printf("%d\t%s\t%.2f\n", students[i].roll_no, students[i].name, students[i].marks);
    }
    return 0;
}