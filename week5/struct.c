#include <stdio.h>

struct exam_day{
    int day;
    int year;
    char month[10];
};

struct student{
        char name[50];
        char surname[50];
        int group_number;
        struct exam_day exam_day;
    };

int main(){
    struct student you;
    struct exam_day day;

    printf("Write your name\n");
    scanf("%s", you.name);
    printf("Write your surname\n");
    scanf("%s", you.surname);
    printf("Write yor group number\n");
    scanf("%d", &you.group_number);
    printf("")
}