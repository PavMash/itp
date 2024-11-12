#include <stdio.h>
int main(){
    char str[100000];
    scanf("%s", &str);
    int i = 0;
    for (i = 0; str[i] != '\0'; ++i);
    for (int j = i-1; j >= 0; --j){
        printf("%c", str[j]);
    }
    return 0;
}