#include <stdio.h>

int main(){
    char input[100000];
    scanf("%[^\n]s", input);
    FILE * fl = fopen("output.txt", "w");
    fputs(input, fl);
    fclose(fl);
    return 0;
}