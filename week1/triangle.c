#include <stdio.h>

int main(){
    int n;
    scanf("%d", &n);
    for (int i = n-1; i > (-1); i--){
        for (int j = 0; j < (2*n-1); j++){
            if (j < i || j >= (2*n-1-i)) printf(" ");
            else printf("*");
        }
        printf("\n");
    }
    return 0;
}