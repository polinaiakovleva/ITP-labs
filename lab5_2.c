#include <stdio.h>
#include <stdint.h>

struct IPv4 {
    unsigned version : 4;
    unsigned IHL : 4;
    unsigned DSCP : 6;
    unsigned ECN : 2;
    unsigned total_length : 16;
};

union Packet {
    uint32_t value;
    struct IPv4 fields;
};

int main() {
    union Packet packet;
    uint32_t i;
    printf("Enter an integer: ");
    scanf("%i", &i);
    
    packet.value = i;
    
    printf("Version: %u\n", packet.fields.version);
    printf("IHL: %u\n", packet.fields.IHL);
    printf("DSCP: %u\n", packet.fields.DSCP);
    printf("ECN: %u\n", packet.fields.ECN);
    printf("Total Length: %u bytes\n", packet.fields.total_length);
    
    return 0;
}
