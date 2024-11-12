#include <stdio.h>
int fact(int num){
    int res = 1;
    for (int i = num; i > 1; i--) res *= i;
}

int strong(int num){
    int copy = num;
    int sum = 0;
    while (copy > 0){
        sum += fact(copy%10);
        copy /= 10;
    }
    if (sum == num) return 1;
    else return 0;
} 

int main() {
    int b, e;
    scanf("%d\n%d", &b, &e);
    for (int i = b; i <= e; i++){
        if (strong(i) == i){
            printf();
        }  
        
    }
}