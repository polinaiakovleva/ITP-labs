#include <stdio.h>

struct Recipe {
    char name[50];
    char ingredients[100];
};

int main() {
    struct Recipe cookbook[2];
    struct Recipe sushi = {"sushi", "3 ingredients: rice, fish, nori"};
    cookbook[0] = sushi;

    struct Recipe pasta = {"chiken pasta", "3 ingredients: pasta, chiken, cream"};
    cookbook[1] = pasta;    

    printf("Cookbok\n");
    printf("\n");
    for (int i = 0; i < 2; i++) {
        printf("Recipe %d\n", i+1);
        printf("Name: %s\n", cookbook[i].name);
        printf("%s\n", cookbook[i].ingredients);
        printf("\n");
    }
    return 0;
}