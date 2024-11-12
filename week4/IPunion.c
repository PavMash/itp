#include <stdio.h>

union IP{
    unsigned header;
    struct {
        unsigned version : 4;
        unsigned IHL : 4;
        unsigned DSCP : 6;
        unsigned ECN : 2;
        unsigned tot_length : 16;
    } all;
} ip;

int main(){
    scanf("%u", &ip.header);
    printf("version: %u\n IHL: %u\n DSCP: %u\n ECN: %u\n Total length: %u\n",
        ip.all.version, ip.all.IHL, ip.all.DSCP, ip.all.ECN, ip.all.tot_length);
    return 0;    
}