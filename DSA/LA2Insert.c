#include <stdio.h>
#include <string.h>

#define MAX_STUDENTS 50

struct student {
    int roll_no;
    char name[50];
    float marks;
};

void insertion_sort(struct student arr[], int n)
{
    int i, j;
    struct student key;
    for (i = 1; i < n; i++) {
        key = arr[i];
        j = i - 1;
        while (j >= 0 && arr[j].roll_no > key.roll_no) {
            arr[j+1] = arr[j];
            j = j - 1;
        }
        arr[j+1] = key;
    }
}

int main()
{
    int i, n;
    struct student students[MAX_STUDENTS];
    printf("Enter the number of students: ");
    scanf("%d", &n);
    printf("Enter student details:\n");
    for (i = 0; i < n; i++) {
        printf("Student %d:\n", i+1);
        printf("Roll no.: ");
        scanf("%d", &students[i].roll_no);
        printf("Name: ");
        scanf("%s", students[i].name);
        printf("Marks: ");
        scanf("%f", &students[i].marks);
    }
    insertion_sort(students, n);
    printf("Students sorted by roll number:\n");
    for (i = 0; i < n; i++) {
        printf("%d\t%s\t%.2f\n", students[i].roll_no, students[i].name, students[i].marks);
    }
    return 0;
}