#include <stdio.h>
#define alf_len 26
#define a_ind 97

int main(){
    char str[1000000];
    scanf("%[^'\n']", &str);
    int al[alf_len];
    int freq[alf_len];
    for (int i = 0; i < 26; i++){
        al[i] = i;
        freq[i] = 0;
    }
    for (int i = 0; i < strlen(str); i++){
        if (0 <= (str[i]-a_ind) <= 25){
            freq[str[i]-a_ind] += 1;
        }
    }
    for (int i = 0; i < 26; i++){
        if (freq[i] != 0){
            printf("%c", al[i]+a_ind);
            for (int j = 0; j < freq[i]; j++){
                printf(".");
            }
            printf("\n");
        }
    } 
    return 0;
}