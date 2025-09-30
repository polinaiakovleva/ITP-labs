#include <stdio.h>

struct Birthday {
    unsigned short day : 5;
    unsigned short month : 4;
    unsigned short year : 7;
};

int main() {
    struct Birthday bd = {30, 12, 07};
    printf("Birthday date: %d.%d.%d\n", bd.day, bd.month, bd.year);
    printf("Size: %lu", sizeof(struct Birthday));
    return 0;
}