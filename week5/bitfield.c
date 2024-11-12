#include <stdio.h>

struct date_of_birth{
    unsigned short day : 5;
    unsigned short month : 4;
    unsigned short year : 7;
};

int main(){
    struct date_of_birth date;
    date.day = 11;
    date.month = 11;
    date.year = 2005 - 1900;
    printf("%d.%d.%d\n", date.day, date.month, date.year + 1900);
    printf("%lu", sizeof(date));
    return 0;
}