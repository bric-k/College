#include <stdio.h>

int main() {
   int maths, english, biology, physics, chemistry;
   float total = 0.0, percentage;
   
   printf("Enter the marks of Maths: ");
   scanf("%d", &maths);
   
   printf("Enter the marks of English: ");
   scanf("%d", &english);
   
   printf("Enter the marks of Biology: ");
   scanf("%d", &biology);
   
   printf("Enter the marks of Physics: ");
   scanf("%d", &physics);
   
   printf("Enter the marks of Chemistry: ");
   scanf("%d", &chemistry);
   
   total = maths + english + biology + physics + chemistry;
   
   percentage = (total/500.0) * 100.0;
   
   printf("Total marks obtained: %.2f\n", total);
   printf("Percentage: %.2f\n", percentage);
   
   return 0;
}