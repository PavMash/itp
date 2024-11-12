#include <stdio.h>

enum week{
    Monday = 1,
    Teusday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday,
};

int main(){
    int day;
    scanf("%d", &day);
    switch(day){
        case Monday: printf("Monday"); break;
        case Teusday: printf("Teusday"); break;
        case Wednesday: printf("Wednesday"); break;
        case Thursday: printf("Thursday"); break;
        case Friday: printf("Friday"); break;
        case Saturday: printf("Saturday"); break;
        case Sunday: printf("Sunday"); break;
    }
    return 0;
}